package com.marcocampana.google.model

final case class Distance(text: String, value: Int)

final case class Duration(text: String, value: Int)


final case class DistanceMatrixElement(
                                        distance: Distance,
                                        duration: Duration
                                      )

final case class DistanceMatrixRow(
                                    elements: List[DistanceMatrixElement]
                                  )


final case class DistanceMatrix(
                                 `destination_addresses`: List[String],
                                 `origin_addresses`: List[String],
                                 rows: List[DistanceMatrixRow],
                                 status: String
                               )