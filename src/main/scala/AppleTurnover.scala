object AppleTurnover {
  def turnoverTemp(temp: Any): String = {
    val tempAsInt = temp.toString.toInt
    val tempSquared = tempAsInt * tempAsInt
    if (tempSquared < 1000) {
      "Help yourself to a honeycomb Yorkie for the glovebox."
    } else {
      "It's hotter than the sun!!"
    }
  }
}
