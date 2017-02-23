package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import models.Restaurant;
import exceptions.NotFoundException;
import play.Logger;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Result;
import javax.persistence.TypedQuery;
import java.util.List;
import dao.ApplicationDao;
import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;

/* Edited by Sridevi Akondi */
/* Import Restaurant model */




public class ApplicationController {
    private  ApplicationDao applicationdao;

    @javax.inject.Inject
    public ApplicationController(ApplicationDao applicationdao){ this.applicationdao = applicationdao; }

    private JPAApi jpaApi;

    public ApplicationController(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    @Transactional
    public Result getRestaurantsList() {

        List<Restaurant> rests;
        rests = applicationdao.findAll();

        final JsonNode json = Json.toJson(rests);



               /* TypedQuery<Restaurant> query = jpaApi.em().createQuery("SELECT r FROM Restaurant r", Restaurant.class);
                List<Restaurant> rest = query.getResultList();
                JsonNode json = Json.toJson(rest); */
        return ok(json);
    }

    @Transactional
    public Result getRestaurantByID(Integer id) {

        if (null == id) {
            return badRequest();
        }

        try {
            final Restaurant rest = applicationdao.findById(id);
            final JsonNode json = Json.toJson(rest);
            return ok(json);

        } catch (NotFoundException ex) {
            return notFound();
        }

    }

            /*
                Restaurant i = jpaApi.em().find(Restaurant.class, id);
                JsonNode json = Json.toJson(i);

             */


            /*List  of restaurants in each collection*/

    @Transactional
    public Result getRestaurantsByCollectionType(String collection) {


        List<Restaurant> rest =  applicationdao.findByCollection(collection);


        JsonNode json = Json.toJson(rest);
        return ok(json);
            /*
                String q="SELECT r FROM Restaurant r where r.ctype='"+collection+"'";
                TypedQuery<Restaurant> query = jpaApi.em().createQuery(q, Restaurant.class);
                List<Restaurant> rest = query.getResultList();
             */

    }

    /* Creating, Updating and Deleting operations that will be performed by the admin */

    @Transactional
    public Result createRestAdmin() {
        final JsonNode json = request().body().asJson();
        if (null == json) {
            Logger.error("Unable to get json from request");
            return badRequest("Unable to get json from request");
        }
        final Restaurant r = Json.fromJson(json, Restaurant.class);
        if (null == r) {
            Logger.error("Unable to parse json to Member object");
            return badRequest("Unable to parse json to Member object");
        }

        applicationdao.persist(r);
        return ok();

                    /*
                jpaApi.em().merge(r);
                    return ok(json);
                    */
    }

    @Transactional
    public Result updateRestAdmin(Integer id) {
        final JsonNode json = request().body().asJson();
        if (null == json) {
            return badRequest("not found");
        }
        Restaurant r = Json.fromJson(json, Restaurant.class);
        if (null == r) {
            return badRequest("not found");
        }

        Restaurant existingRes = jpaApi.em().find(Restaurant.class, id);
        existingRes.setName(r.getName());
        existingRes.setCuisine(r.getCuisine());
        existingRes.setNumber(r.getNumber());
        existingRes.setAddress(r.getAddress());
        existingRes.setHomePage(r.getHomePage());
        existingRes.setFbUrl(r.getFbUrl());
        existingRes.setWorkHours(r.getWorkHours());
        existingRes.setArea(r.getArea());
        existingRes.setCollection(r.getCollection());
        existingRes.setLatitude(r.getLatitude());
        existingRes.setLongitude(r.getLongitude());
        existingRes.setImage(r.getImage());
        jpaApi.em().merge(existingRes);
        return ok("the following restaurant is updated " +existingRes.getName()+existingRes.getCuisine()+existingRes.getNumber()+existingRes.getAddress()+existingRes.getHomePage()+ existingRes.getFbUrl()+existingRes.getWorkHours()+existingRes.getArea()+existingRes.getCollection()+existingRes.getLatitude()+existingRes.getLongitude()+existingRes.getImage());
    }


    @Transactional
    public Result deleteRestAdmin(Integer id) {


        if(null == id){
            return badRequest();
        }

        try {
            applicationdao.deleteById(id);
            return ok("The restaurant is deleted");
        }catch(NotFoundException ex){
            return notFound();
        }
                /*
                Restaurant r = jpaApi.em().find(Restaurant.class, id);
                jpaApi.em().remove(r);
                return ok();
                */
    }


    @Transactional
    public Result getRestaurantsFromSearchFilter(String area, String restaurantname) {
        String q="SELECT r FROM Restaurant r ";
        if (null != area ) {
            q += "where r.area='"+area+"'";
        }

        else if (null != restaurantname ) {
            q += "where r.name='"+restaurantname+"'";
        }

        else {
            return badRequest("not found");
        }
        TypedQuery<Restaurant> query = jpaApi.em().createQuery(q, Restaurant.class);
        List<Restaurant> rest = query.getResultList();
        JsonNode json = Json.toJson(rest);
        return ok(json);
    }

}
