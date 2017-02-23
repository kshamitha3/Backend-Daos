package dao;


import exceptions.NotFoundException;
import models.Restaurant;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.List;

public class ApplicationDao implements CrudDao<Integer, Restaurant> {

    private JPAApi jpaApi;

    @Inject
    public ApplicationDao(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    public void persist(Restaurant rest) {
        jpaApi.em().persist(rest);
    }

    public Restaurant findById(Integer id) {

        Restaurant i = jpaApi.em().find(Restaurant.class, id);


        if(null==i){
            String errorMesaage = "Book with id:" + id + " not found";
            throw new NotFoundException(errorMesaage);
        }
        return i;

    }

    public List<Restaurant> findAll() {

        TypedQuery<Restaurant> query = jpaApi.em().createQuery("SELECT r FROM Restaurant r", Restaurant.class);
        List<Restaurant> rests = query.getResultList();
        return rests;
    }

    public List<Restaurant> findByCollection(String collection) {
        String q="SELECT r FROM Restaurant r where r.ctype='"+collection+"'";
        TypedQuery<Restaurant> query = jpaApi.em().createQuery(q, Restaurant.class);
        List<Restaurant> rest = query.getResultList();
        return rest;
    }
    public void deleteById(Integer id) {
        Restaurant rest = findById(id);
        jpaApi.em().remove(rest);
    }
}




