package com.marcocampana.google

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.model.{HttpMethods, HttpRequest, HttpResponse, Uri}
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.http.scaladsl.unmarshalling.Unmarshaller
import akka.http.scaladsl.model.ResponseEntity
import akka.stream.ActorMaterializer
import com.marcocampana.google.model._
import spray.json.DefaultJsonProtocol

import scala.concurrent.Future

trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val DistanceFormat = jsonFormat2(Distance)
  implicit val DurationFormat = jsonFormat2(Duration)
  implicit val ElementFormat = jsonFormat2(Element)
  implicit val RowFormat = jsonFormat1(Row)
  implicit val DistanceMatrixFormat = jsonFormat4(DistanceMatrix)
}

// M: Model
trait Request[M] {

  implicit val system = ActorSystem()
  implicit val materializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher

  val BASE_URI = "https://maps.googleapis.com/maps/api"

  var params = Map[String, String]()

  def makeRequest()(implicit um: Unmarshaller[ResponseEntity, M], apiKey: String): Future[M] = {

    val request = buildRequest()
    fetch(request)
  }

  def buildRequest() = {
    params("key", key)

    HttpRequest(
      uri = buildUri().toString,
      method = HttpMethods.GET
    )
  }

  def fetch(request: HttpRequest)(implicit um: Unmarshaller[ResponseEntity, M]): Future[M] = {

    val responseFuture: Future[HttpResponse] =
      Http().singleRequest(request)

    responseFuture.flatMap { response =>
      Unmarshal(response.entity).to[M]
    }
  }

  // TODO validate request params
  def validateRequest() = {}

  def uri(): String = { "" }
  def key(): String = { "" }

  def buildUri() = {
    Uri(BASE_URI + uri).withQuery(buildQuery)
  }

  def buildQuery() = {
    Query(params)
  }

  def params(key: String, value: String) {
    params += (key -> value)
  }
}
