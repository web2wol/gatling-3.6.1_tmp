package scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.ScenarioBuilder

object ResDeskLogin {


  def scnResDeskLogin: ScenarioBuilder = {
    scenario("Login to ResDesk")
      .exec(flushHttpCache)
      .exec(flushCookieJar)
      .exitBlockOnFail(
        group("ResDesk Login as Org") {
          exec(api.resdesk.openSplashPage)
        }
      )
  }

}
