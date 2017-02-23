package models;

import javax.validation.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;

import java.util.List;
import java.sql.Date;
import dao.ApplicationDao;
import java.io.File;
import java.sql.Time;
import java.math.BigDecimal;

/* Edited by Sridevi Akondi */

@Entity
@Table(name = "tb_restaurants")
@SuppressWarnings("FieldCanBeLocal")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Restaurants_names")
    private String name;

    @Column(name = "Cuisine")
    private String cuisine;

    @Column(name = "Phone_Number")
    private String number;

    @Column(name = "Address")
    private String address;

    @Column(name = "Homepage")
    private String homepage;

    @Column(name = "Facebook_Url")
    private String fburl;

    @Column(name = "Working_Hours")
    private String workhours;

    @Column(name = "Area")
    private String area;

    @Column(name= "Collection_Type")
    private String ctype;

    @Column(name = "longitude", precision=11 , scale= 8)
    private BigDecimal longitude;

    @Column(name = "latitude", precision=10 , scale=8)
    private BigDecimal latitude;

    @Column(name = "ImageUrl")
    private String imageurl;

    public Restaurant() {

    }


    public Restaurant (int id, String name, String cuisine, String number, String address, String homepage, String fburl, String workhours, String area, String ctype , BigDecimal latitude, BigDecimal longitude , String imageurl) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
        this.number = number;
        this.address = address;
        this.homepage = homepage;
        this.fburl = fburl;
        this.workhours = workhours;
        this.area = area;
        this.ctype = ctype;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageurl=imageurl;
    }


    public int getId() { return id; }
    public void setId(int id) {
        this.id= id;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() { return cuisine; }
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getNumber() { return number; }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomePage() { return homepage; }
    public void setHomePage(String homepage) {
        this.homepage = homepage;
    }

    public String getFbUrl() { return fburl; }
    public void setFbUrl(String fburl) {
        this.fburl = fburl;
    }

    public String getWorkHours() { return workhours; }
    public void setWorkHours(String workhours) {
        this.workhours = workhours;
    }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public String getCollection() { return ctype; }
    public void setCollection(String ctype) {
        this.ctype = ctype;
    }

    public BigDecimal getLatitude() { return latitude; }
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() { return longitude; }
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getImage() { return imageurl; }
    public void setImage(String imageurl) {
        this.imageurl = imageurl;
    }

}






