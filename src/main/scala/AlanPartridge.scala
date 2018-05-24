object AlanPartridge extends App {

  def partridge(list: List[String]) : String ={
    val apTerms = List("Partridge","PearTree","Chat", "Dan", "Toblerone","Lynn","AlphaPapa","Nomad")

    val apMatch = apTerms.intersect(list).length

    if (apMatch >= 1){
      "Mine's a Pint" + "!"*apMatch
    }else {
      "Lynn, I've pierced my foot on a spike!!"
    }
  }

}
