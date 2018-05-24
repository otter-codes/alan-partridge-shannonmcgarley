import org.scalatest._

class AlanPartridgeSpec extends WordSpec with MustMatchers {

  "AlanPartridge" must {

    "return 'Lynn, I've pierced my foot on a spike!!' when given an empty list" in {
      AlanPartridge.partridge(List()) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }
    "return 'Lynn, I've pierced my foot on a spike!!' when given a list of non AP terms" in {
      AlanPartridge.partridge(List("Shannon")) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }
    "return 'Mine's a Pint!' when given a list of one AP term" in {
      AlanPartridge.partridge(List("PearTree")) mustEqual "Mine's a Pint!"
    }
    "return 'Mine's a Pint!!' when given a list of two AP terms" in {
      AlanPartridge.partridge(List("PearTree", "Dan")) mustEqual "Mine's a Pint!!"
    }
    "return 'Mine's a Pint!!!' when given a list of three AP terms and one non ap term" in {
      AlanPartridge.partridge(List("PearTree", "Dan", "Chat", "Shannon")) mustEqual "Mine's a Pint!!!"
    }


  }

}
