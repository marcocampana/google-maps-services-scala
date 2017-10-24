package com.marcocampana.google.model

object Units extends Enumeration {
  type Units = Value
  val metric, imperial = Value
}

object TravelMode extends Enumeration {
  type TravelMode = Value
  val driving, walking, bicycling, transit = Value
}

object Language extends Enumeration {
  type Language = Value
  val ar, bg, bn, ca, cs, da, de, el, en, `en-AU`, `en-GB`, es,
      eu, fa, fi, fil, fr, gl, gu, hi, hr, hu, id, it, iw, ja,
      kn, ko, lt, lv, ml, mr, nl, no, pl, pt, ptBR, ptPT, ro,
      ru, sk, sl, sr, sv, ta, te, th, tl, tr, uk, vi, `zh-CN`,
      `zh-TW` = Value
}

object Avoid extends Enumeration {
  type Avoid = Value
  val tolls, highways, ferries, indoor = Value
}

object TrafficModel extends Enumeration {
  type TrafficModel = Value
  val best_guess, pessimistic, optimistic = Value
}

object TransitMode extends Enumeration {
  type TransitMode = Value
  val bus, subway, train, tram, rail = Value
}

object TransitRoutingPreference extends Enumeration {
  type TransitRoutingPreference = Value
  val less_walking, fewer_transfers = Value
}
