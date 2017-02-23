
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Backend-Java-MyBranch/MyBranch/conf/routes
// @DATE:Mon Feb 20 20:16:44 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApplicationController ApplicationController = new controllers.ReverseApplicationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMemberController MemberController = new controllers.ReverseMemberController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApplicationController ApplicationController = new controllers.javascript.ReverseApplicationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMemberController MemberController = new controllers.javascript.ReverseMemberController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
