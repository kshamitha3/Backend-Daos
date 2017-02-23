
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Backend-Java-MyBranch/MyBranch/conf/routes
// @DATE:Mon Feb 20 20:16:44 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def deleteRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.deleteRestAdmin",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "rest/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:15
    def getRestaurantsByCollectionType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.getRestaurantsByCollectionType",
      """
        function(collection0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants_by_collection/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("collection", encodeURIComponent(collection0))})
        }
      """
    )
  
    // @LINE:19
    def updateRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.updateRestAdmin",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update_a_restaurant/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:11
    def getRestaurantByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.getRestaurantByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants_by_id/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:24
    def getRestaurantsFromSearchFilter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.getRestaurantsFromSearchFilter",
      """
        function(area0,restaurantname1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search_restaurants_by_name_area" + _qS([(area0 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("area", area0)), (restaurantname1 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("restaurantname", restaurantname1))])})
        }
      """
    )
  
    // @LINE:10
    def getRestaurantsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.getRestaurantsList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list_of_all_restaurants"})
        }
      """
    )
  
    // @LINE:18
    def createRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.createRestAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rest"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseMemberController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def createMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.createMember",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create_member"})
        }
      """
    )
  
    // @LINE:30
    def getMemberByUsernamePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.getMemberByUsernamePassword",
      """
        function(username0,password1,role2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate_member_by_username_password/" + (""" + implicitly[PathBindable[java.lang.String]].javascriptUnbind + """)("username", username0) + _qS([(password1 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("password", password1)), (role2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("role", role2))])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
