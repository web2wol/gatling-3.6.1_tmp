
import config.BaseHelpers.httpProtocolWithoutInferHtmlResources
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import scenarios.ResDeskLogin


class PerfTestSimulations extends Simulation {

//  object ScenarioMapping {
//    def scnNames: Map[String, ScenarioBuilder] = Map(
//      "ResDesk" -> ResDeskLogin.scnResDeskLogin
//    )
//  }
  setUp(ResDeskLogin.scnResDeskLogin.inject(atOnceUsers(1)).protocols(httpProtocolWithoutInferHtmlResources))

}
