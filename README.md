Scala Client for Google Maps Services
====================================

## Description

A high performance Scala client library for Google Maps Services built with Akka-Http. It is heavily inspired
by the official [Google Java Client library] and it aims at feature parity with it.

The client implements the following Google Maps APIs:

- [Distance Matrix API]
- [Directions API] (TODO)
- [Elevation API] (TODO)
- [Geocoding API] (TODO)
- [Places API] (TODO)
- [Roads API] (TODO)
- [Time Zone API] (TODO)


### API keys

Each Google Maps Web Service request requires an API key or client ID. API keys
are freely available with a Google Account at
[developers.google.com/console](https://developers.google.com/console). The
type of API key you need is a **Server key**.

To get an API key:

 1. Visit [developers.google.com/console](https://developers.google.com/console)
  and log in with a Google Account.
 1. Select one of your existing projects, or create a new project.
 1. Enable the API(s) you want to use.
 1. Create a new **Server key**.
 1. If you'd like to restrict requests to a specific IP address, do so now.

For guided help, follow the instructions for the [Directions API][directions-key].
You only need one API key, but remember to enable all the APIs you need.
For even more information, see the guide to [API keys][apikey].

**Important:** This key should be kept secret on your server.

## Installation

TODO

## Usage

TODO

## Features

* Rate Limiting
* Retry on Failure. Automatically retry when intermittent failures occur. That is, when any of the retriable 5xx errors
are returned from the API.

[Google Java Client library]: https://github.com/googlemaps/google-maps-services-java
[apikey]: https://developers.google.com/maps/faq#keysystem
[Directions API]: https://developers.google.com/maps/documentation/directions
[directions-key]: https://developers.google.com/maps/documentation/directions/get-api-key#key
[directions-client-id]: https://developers.google.com/maps/documentation/directions/get-api-key#client-id
[Distance Matrix API]: https://developers.google.com/maps/documentation/distancematrix
[Elevation API]: https://developers.google.com/maps/documentation/elevation
[Geocoding API]: https://developers.google.com/maps/documentation/geocoding
[Google Maps API Web Services]: https://developers.google.com/maps/documentation/webservices/
[Places API]: https://developers.google.com/places/web-service/
[Time Zone API]: https://developers.google.com/maps/documentation/timezone
[Roads API]: https://developers.google.com/maps/documentation/roads