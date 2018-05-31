object London {
  def apStations(stationList: List[String]): String = {
    val stations = List("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")
    if(stations.forall(stationList.contains(_))) {
      "Smell my cheese you mother!"
    } else {
      "No, seriously, run. You will miss it."
    }
  }
}
