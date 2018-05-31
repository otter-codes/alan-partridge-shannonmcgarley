import org.scalatest.{MustMatchers, WordSpec}

class LondonSpec extends WordSpec with MustMatchers {
  "London" must {
    "Return the correct elements" when {
      "Given all the AP stations only" in {
        London.apStations(List("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")) mustEqual "Smell my cheese you mother!"
      }
      "Given none of the AP stations" in {
        London.apStations(List()) mustEqual "No, seriously, run. You will miss it."
      }
      "Given all AP stations and 1 non AP station" in {
        London.apStations(List("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway", "Shannon")) mustEqual "Smell my cheese you mother!"
      }
      "Given 1 non AP station" in {
        London.apStations(List("Shannon")) mustEqual "No, seriously, run. You will miss it."
      }
    }
  }
}
