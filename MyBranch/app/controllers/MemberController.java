package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import models.Member;
import play.Logger;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Result;
import javax.persistence.TypedQuery;
import java.util.List;
import exceptions.NotFoundException;
import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;

/* Edited by Sridevi Akondi */


public class MemberController {

    public MemberController() {

    }

    private JPAApi jpaApi;

    @Inject
    public MemberController(JPAApi jpaApi){

        this.jpaApi=jpaApi;
    }

    /*@Transactional
    public Result getMembersList(){
        TypedQuery<Member> query=jpaApi.em().createQuery("SELECT m FROM Member m", Member.class);
        List<Member> members =query.getResultList();
        JsonNode json = Json.toJson(members);
        return ok(json);
    } */
    /*
    @Transactional
    public Result getMemberByID(Integer id){
        Member m=jpaApi.em().find(Member.class,id);
        JsonNode json=Json.toJson(m);
        return ok(json);
    } */


    @Transactional
    public Result createMember(){
        final JsonNode json = request().body().asJson();
        if (null == json) {
            return badRequest("Unable to get json from request");
        }
        final Member m = Json.fromJson(json, Member.class);
            if (null == m) {
                return badRequest("Unable to parse json to Member object");
            }
        jpaApi.em().persist(m);
        return ok(json);
    }

    @Transactional
    public Result getMemberByUsernamePassword(String username, String password,  String role) {
        String q = "SELECT m FROM Member m ";
        if (null != username && null != password) {
            q += "where m.username='" + username + "' "
                    + "and m.pwd='" + password + "'"; {
            if (role == "1") {
                q += "and m.role='" + role + "'";
                return ok("Admin is signed in");
            } else if (role =="0"){
                q+="or m.role='"+role+"'";
                return ok("User is signed in");
            }
        }
        } else {
            return badRequest("login failed");
        }
        try {
            TypedQuery<Member> query = jpaApi.em().createQuery(q, Member.class);
            List<Member> members = query.getResultList();
            JsonNode json = Json.toJson(members);
            return ok(json);
        } catch (NotFoundException ex) {
            return notFound();
        }
    }

    /*
    @Transactional
    public Result updateMember(Integer id){
        final JsonNode json=request().body().asJson();
        if(null==json){
            return badRequest("not found");
        }
        Member m=Json.fromJson(json,Member.class);
        if(null==m){
            return badRequest("not found");
        }

        Member originalmember=jpaApi.em().find(Member.class,id);
        originalmember.setUname(m.getUname());
        jpaApi.em().merge(originalmember);
        return ok("the following member is updated"+originalmember.getUname());
    }

    @Transactional
    public Result deleteMember(Integer id){
        Member m=jpaApi.em().find(Member.class,id);
        jpaApi.em().remove(m);
        return ok();
    }
    */

    /*
    public Result getAllMembers(){

        JsonNode json = Json.toJson(members);
        return ok(json);
    }

    public Result getMemberByID(Integer id){
        for(int i=0;i<members.size();i++){
            Member m=members.get(i);
            if(id==m.getUid()){
                JsonNode json=Json.toJson(m);
                return ok(json);
            }
        }
        return notFound("member not found");
    }

    public Result deleteMember(Integer id){
        for(int i=0;i<members.size();i++){
            Member m= members.get(i);
            if(id==r.getUid()){
                restaurants.remove(m);
                return ok("member removed");
            }
        }
        return notFound("member not found");
    }

    public Result updateMember(Integer id){
        final JsonNode json=request().body().asJson();
        if(null==json){
            return badRequest("not found");
        }
        final Member m = Json.fromJson(json,Member.class);
        if(null==m){
            return badRequest("not found");
        }
        for(int i=0;i<members.size();i++){
            Member m=members.get(i);
            if(id==m.getUid()){
                m.setUname.getUname());
                return ok("member updated");
            }
        }

        return ok();
    }

    public Result addMember(){
        final JsonNode json = request().body().asJson();
        if (null == json) {
            Logger.error("Unable to get json from request");
            return badRequest();
        }

        final Member m = Json.fromJson(json,Member.class);
        if (null == m) {
            Logger.error("Unable to parse json");
            return badRequest();
        }

        // make sure id and title is not null
        if (null == res.getName()) {
            return badRequest();
        }
        restaurants.add(res);
        return ok(json);
    }
    */


}
