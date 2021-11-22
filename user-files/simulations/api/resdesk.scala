package api

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object resdesk {

def openSplashPage: ChainBuilder = {
  exec(
    http("Open ResDesk")
      .get("https://stg-manage.passkey.com")
  )
}

}
