
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Backend-Java-MyBranch/MyBranch/conf/routes
// @DATE:Mon Feb 20 20:16:44 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def deleteRestAdmin(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "rest/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:15
    def getRestaurantsByCollectionType(collection:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants_by_collection/" + implicitly[PathBindable[String]].unbind("collection", dynamicString(collection)))
    }
  
    // @LINE:19
    def updateRestAdmin(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update_a_restaurant/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:11
    def getRestaurantByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants_by_id/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:24
    def getRestaurantsFromSearchFilter(area:java.lang.String = null , restaurantname:java.lang.String = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search_restaurants_by_name_area" + queryString(List(if(area == null ) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("area", area)), if(restaurantname == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("restaurantname", restaurantname)))))
    }
  
    // @LINE:10
    def getRestaurantsList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "list_of_all_restaurants")
    }
  
    // @LINE:18
    def createRestAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "rest")
    }
  
  }

  // @LINE:30
  class ReverseMemberController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def createMember(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "create_member")
    }
  
    // @LINE:30
    def getMemberByUsernamePassword(username:java.lang.String, password:java.lang.String = null, role:String = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "authenticate_member_by_username_password/" + implicitly[PathBindable[java.lang.String]].unbind("username", username) + queryString(List(if(password == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("password", password)), if(role == null) None else Some(implicitly[QueryStringBindable[String]].unbind("role", role)))))
    }
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
