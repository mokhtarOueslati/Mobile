/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Ghassen
 */
public class Randonnee {
    private int randonnee_id;
    private String nom;
    private String description;
    private String date_depart;
    private Date creation_date;
    private Date last_modification_date;
    private String address_randonnee;
    private String photo_profil_path;
    private float longitude;
    private float latitude;
    private int nbr_places;
         private Profil creator;

    
    public Randonnee() {
    }

    public Randonnee(String nom, String description, String date_depart, Date creation_date, Date last_modification_date, String address_randonnee, String photo_profil_path) {
        this.nom = nom;
        this.description = description;
        this.date_depart = date_depart;
        this.creation_date = creation_date;
        this.last_modification_date = last_modification_date;
        this.address_randonnee = address_randonnee;
        this.photo_profil_path = photo_profil_path;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public Randonnee(String n, String d, String dd, String ad, int parseInt) {
        this.nom = n;
        this.address_randonnee = ad;
        this.date_depart = dd;
        this.description = d;
        this.nbr_places = parseInt;
    }

    public int getRandonnee_id() {
        return randonnee_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getLast_modification_date() {
        return last_modification_date;
    }

    public void setLast_modification_date(Date last_modification_date) {
        this.last_modification_date = last_modification_date;
    }

    public String getAddress_randonnee() {
        return address_randonnee;
    }

    public void setAddress_randonnee(String address_randonnee) {
        this.address_randonnee = address_randonnee;
    }

    public String getPhoto_profil_path() {
        return photo_profil_path;
    }

    public void setPhoto_profil_path(String photo_profil_path) {
        this.photo_profil_path = photo_profil_path;
    }

    public void setRandonnee_id(int randonnee_id) {
        this.randonnee_id = randonnee_id;
    }

    @Override
    public String toString() {
        return "Randonnee{" + "randonnee_id=" + randonnee_id + ", nom=" + nom + ", description=" + description + ", date_depart=" + date_depart + ", creation_date=" + creation_date + ", last_modification_date=" + last_modification_date + ", address_randonnee=" + address_randonnee + ", photo_profil_path=" + photo_profil_path + '}';
    }

    public void setNbr_places(int nbr_places) {
        this.nbr_places = nbr_places;
    }

    public int getNbr_places() {
        return nbr_places;
    }

    public Profil getCreator() {
        return creator;
    }

    public void setCreator(Profil creator) {
        this.creator = creator;
    }

}
