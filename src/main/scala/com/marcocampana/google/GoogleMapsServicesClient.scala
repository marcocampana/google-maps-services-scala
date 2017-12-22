package com.marcocampana.google

class GoogleMapsServicesClient() {
  lazy val distanceMatrix = DistanceMatrixApi
}

object GoogleMapsServicesClient {
  def apply(): GoogleMapsServicesClient = {
    new GoogleMapsServicesClient()
  }
}

