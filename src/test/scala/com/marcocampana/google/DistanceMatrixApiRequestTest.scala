package com.marcocampana.google

import akka.http.scaladsl.model.{HttpMethods, HttpRequest}
import com.marcocampana.google.utils.UnitTest

class DistanceMatrixApiRequestTest extends UnitTest("DistanceMatrixApiRequest") {

  val context = Context(apiKey = "AIzaFakeKey")

  it should "return the correct path for the service" in {
    val request = new DistanceMatrixApiRequest(context)

    request.uri() shouldEqual "/distancematrix/json"
  }

  it should "build the correct request" in {
    val expectedHttpRequest = HttpRequest(
      uri = "https://maps.googleapis.com/maps/api/distancematrix/json?key=AIzaFakeKey",
      method = HttpMethods.GET
    )

    val actualRequest = new DistanceMatrixApiRequest(context).buildRequest()

    actualRequest shouldEqual(expectedHttpRequest)
  }
}
