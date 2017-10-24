package com.marcocampana.google

class GoogleMapsServicesClient() {
  //  TODO create implicit context with api key

  lazy val distanceMatrix = DistanceMatrixApi
}

object GoogleMapsServicesClient {
  def apply(): GoogleMapsServicesClient = {
    new GoogleMapsServicesClient()
  }
}

