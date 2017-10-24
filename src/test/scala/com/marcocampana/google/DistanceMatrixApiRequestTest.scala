package com.marcocampana.google

import akka.http.scaladsl.model.{HttpMethods, HttpRequest}
import com.marcocampana.google.utils.UnitTest

class DistanceMatrixApiRequestTest extends UnitTest("DistanceMatrixApiRequest") {

  it should "return the correct path for the service" in {
    val request = new DistanceMatrixApiRequest("AIzaFakeKey")

    request.uri() shouldEqual "/distancematrix/json"
  }

  it should "build the correct request" in {

    val expectedHttpRequest = HttpRequest(
      uri = "https://maps.googleapis.com/maps/api/distancematrix/json?key=AIzaFakeKey",
      method = HttpMethods.GET
    )

    val actualRequest = new DistanceMatrixApiRequest("AIzaFakeKey").buildRequest()

    actualRequest shouldEqual(expectedHttpRequest)
  }
}
