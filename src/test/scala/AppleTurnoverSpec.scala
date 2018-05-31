import org.scalatest.{MustMatchers, WordSpec}

class AppleTurnoverSpec extends WordSpec with MustMatchers {

  "AppleTurnover" must {
    "Return the correct elements" when {
      "Given that the temp is less than 1000" in {
        AppleTurnover.turnoverTemp(10) mustEqual "Help yourself to a honeycomb Yorkie for the glovebox."
      }

      "Given that the temp is more than 1000" in {
        AppleTurnover.turnoverTemp(100) mustEqual "It's hotter than the sun!!"
      }

      "Given that the temp is more than 1000 but input given as a string" in {
        AppleTurnover.turnoverTemp("100") mustEqual "It's hotter than the sun!!"
      }
    }
  }
}
