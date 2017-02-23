
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Backend-Java-MyBranch/MyBranch/conf/routes
// @DATE:Mon Feb 20 20:16:44 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
