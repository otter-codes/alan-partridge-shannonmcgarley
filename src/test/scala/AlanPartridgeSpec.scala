import org.scalatest._

class AlanPartridgeSpec extends WordSpec with MustMatchers {

  "AlanPartridge" must {
    "Return the correct elements" when {

      "Given an empty list" in {
        AlanPartridge.partridge(List()) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }
      "Given a list of non AP terms" in {
        AlanPartridge.partridge(List("Shaz")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }
      "Given a list of one AP term" in {
        AlanPartridge.partridge(List("PearTree")) mustEqual "Mine's a Pint!"
      }
      "Given a list of two AP terms" in {
        AlanPartridge.partridge(List("PearTree", "Dan")) mustEqual "Mine's a Pint!!"
      }
      "Given a list of three AP terms and one non ap term" in {
        AlanPartridge.partridge(List("PearTree", "Dan", "Chat", "Shaz")) mustEqual "Mine's a Pint!!!"
      }
    }
  }
}