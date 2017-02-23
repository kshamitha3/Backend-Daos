
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Backend-Java-MyBranch/MyBranch/conf/routes
// @DATE:Mon Feb 20 20:16:44 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_0: controllers.Assets,
  // @LINE:10
  ApplicationController_2: controllers.ApplicationController,
  // @LINE:30
  MemberController_1: controllers.MemberController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_0: controllers.Assets,
    // @LINE:10
    ApplicationController_2: controllers.ApplicationController,
    // @LINE:30
    MemberController_1: controllers.MemberController
  ) = this(errorHandler, Assets_0, ApplicationController_2, MemberController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, ApplicationController_2, MemberController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """list_of_all_restaurants""", """controllers.ApplicationController.getRestaurantsList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants_by_id/""" + "$" + """id<[^/]+>""", """controllers.ApplicationController.getRestaurantByID(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants_by_collection/""" + "$" + """collection<[^/]+>""", """controllers.ApplicationController.getRestaurantsByCollectionType(collection:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rest""", """controllers.ApplicationController.createRestAdmin()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update_a_restaurant/""" + "$" + """id<[^/]+>""", """controllers.ApplicationController.updateRestAdmin(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rest/""" + "$" + """id<[^/]+>""", """controllers.ApplicationController.deleteRestAdmin(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search_restaurants_by_name_area""", """controllers.ApplicationController.getRestaurantsFromSearchFilter(area:java.lang.String ?= null , restaurantname:java.lang.String ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate_member_by_username_password/""" + "$" + """username<[^/]+>""", """controllers.MemberController.getMemberByUsernamePassword(username:java.lang.String, password:java.lang.String ?= null, role:String ?= null)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create_member""", """controllers.MemberController.createMember()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ApplicationController_getRestaurantsList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list_of_all_restaurants")))
  )
  private[this] lazy val controllers_ApplicationController_getRestaurantsList1_invoker = createInvoker(
    ApplicationController_2.getRestaurantsList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getRestaurantsList",
      Nil,
      "GET",
      """Restaurants that will be displayed to the users""",
      this.prefix + """list_of_all_restaurants"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ApplicationController_getRestaurantByID2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants_by_id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_getRestaurantByID2_invoker = createInvoker(
    ApplicationController_2.getRestaurantByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getRestaurantByID",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """restaurants_by_id/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ApplicationController_getRestaurantsByCollectionType3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants_by_collection/"), DynamicPart("collection", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_getRestaurantsByCollectionType3_invoker = createInvoker(
    ApplicationController_2.getRestaurantsByCollectionType(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getRestaurantsByCollectionType",
      Seq(classOf[String]),
      "GET",
      """Restaurants in each collection""",
      this.prefix + """restaurants_by_collection/""" + "$" + """collection<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ApplicationController_createRestAdmin4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rest")))
  )
  private[this] lazy val controllers_ApplicationController_createRestAdmin4_invoker = createInvoker(
    ApplicationController_2.createRestAdmin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "createRestAdmin",
      Nil,
      "POST",
      """CRUD operations that will be performed by the administrator""",
      this.prefix + """rest"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ApplicationController_updateRestAdmin5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update_a_restaurant/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_updateRestAdmin5_invoker = createInvoker(
    ApplicationController_2.updateRestAdmin(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "updateRestAdmin",
      Seq(classOf[Integer]),
      "PUT",
      """""",
      this.prefix + """update_a_restaurant/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ApplicationController_deleteRestAdmin6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rest/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_deleteRestAdmin6_invoker = createInvoker(
    ApplicationController_2.deleteRestAdmin(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "deleteRestAdmin",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """rest/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ApplicationController_getRestaurantsFromSearchFilter7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search_restaurants_by_name_area")))
  )
  private[this] lazy val controllers_ApplicationController_getRestaurantsFromSearchFilter7_invoker = createInvoker(
    ApplicationController_2.getRestaurantsFromSearchFilter(fakeValue[java.lang.String], fakeValue[java.lang.String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getRestaurantsFromSearchFilter",
      Seq(classOf[java.lang.String], classOf[java.lang.String]),
      "GET",
      """Get all Restaurants based on a filter that searches by Restaurant Name or Restaurant Area""",
      this.prefix + """search_restaurants_by_name_area"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_MemberController_getMemberByUsernamePassword8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate_member_by_username_password/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_getMemberByUsernamePassword8_invoker = createInvoker(
    MemberController_1.getMemberByUsernamePassword(fakeValue[java.lang.String], fakeValue[java.lang.String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "getMemberByUsernamePassword",
      Seq(classOf[java.lang.String], classOf[java.lang.String], classOf[String]),
      "GET",
      """The members can be retrieved, created, updated and deleted
GET      /members_list                                                  controllers.MemberController.getMembersList()
GET      /members/:id                                                   controllers.MemberController.getMemberByID(id: Integer)""",
      this.prefix + """authenticate_member_by_username_password/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_MemberController_createMember9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create_member")))
  )
  private[this] lazy val controllers_MemberController_createMember9_invoker = createInvoker(
    MemberController_1.createMember(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "createMember",
      Nil,
      "POST",
      """""",
      this.prefix + """create_member"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_ApplicationController_getRestaurantsList1_route(params) =>
      call { 
        controllers_ApplicationController_getRestaurantsList1_invoker.call(ApplicationController_2.getRestaurantsList())
      }
  
    // @LINE:11
    case controllers_ApplicationController_getRestaurantByID2_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ApplicationController_getRestaurantByID2_invoker.call(ApplicationController_2.getRestaurantByID(id))
      }
  
    // @LINE:15
    case controllers_ApplicationController_getRestaurantsByCollectionType3_route(params) =>
      call(params.fromPath[String]("collection", None)) { (collection) =>
        controllers_ApplicationController_getRestaurantsByCollectionType3_invoker.call(ApplicationController_2.getRestaurantsByCollectionType(collection))
      }
  
    // @LINE:18
    case controllers_ApplicationController_createRestAdmin4_route(params) =>
      call { 
        controllers_ApplicationController_createRestAdmin4_invoker.call(ApplicationController_2.createRestAdmin())
      }
  
    // @LINE:19
    case controllers_ApplicationController_updateRestAdmin5_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ApplicationController_updateRestAdmin5_invoker.call(ApplicationController_2.updateRestAdmin(id))
      }
  
    // @LINE:20
    case controllers_ApplicationController_deleteRestAdmin6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ApplicationController_deleteRestAdmin6_invoker.call(ApplicationController_2.deleteRestAdmin(id))
      }
  
    // @LINE:24
    case controllers_ApplicationController_getRestaurantsFromSearchFilter7_route(params) =>
      call(params.fromQuery[java.lang.String]("area", Some(null )), params.fromQuery[java.lang.String]("restaurantname", Some(null))) { (area, restaurantname) =>
        controllers_ApplicationController_getRestaurantsFromSearchFilter7_invoker.call(ApplicationController_2.getRestaurantsFromSearchFilter(area, restaurantname))
      }
  
    // @LINE:30
    case controllers_MemberController_getMemberByUsernamePassword8_route(params) =>
      call(params.fromPath[java.lang.String]("username", None), params.fromQuery[java.lang.String]("password", Some(null)), params.fromQuery[String]("role", Some(null))) { (username, password, role) =>
        controllers_MemberController_getMemberByUsernamePassword8_invoker.call(MemberController_1.getMemberByUsernamePassword(username, password, role))
      }
  
    // @LINE:31
    case controllers_MemberController_createMember9_route(params) =>
      call { 
        controllers_MemberController_createMember9_invoker.call(MemberController_1.createMember())
      }
  }
}
