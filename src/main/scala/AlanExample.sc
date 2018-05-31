def turnoverTemp(temp : Any) : String = {
  def process(y: Int): String = {
    val tempSquared = y * y
    if (tempSquared < 1000) {
      "Help yourself to a honeycomb Yorkie for the glovebox."
    } else {
      "It's hotter than the sun!!"
    }
  }
  temp match {
    case i: Int => process(i)
    case s: String =>
      try {
        process(s.toInt)
      } catch {
        case ex: NumberFormatException => "Not a number"
      }
    case _ => "Not a number"
  }
}
}


