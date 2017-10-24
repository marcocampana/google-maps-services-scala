package com.marcocampana.google.model

final case class Distance(text: String, value: Int)

final case class Duration(text: String, value: Int)


final case class Element(
                          distance: Distance,
                          duration: Duration
                        )

final case class Row(
                      elements: List[Element]
                    )


final case class DistanceMatrix(
                                 `destination_addresses`: List[String],
                                 `origin_addresses`: List[String],
                                 rows: List[Row],
                                 status: String
                               )