package com.example.andinurnaf.cobatugas2;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class MovieItems {
    private String title;
    private String description;
    private String date;
    private String image;
    private String rate_count;
    private String rate;

    public MovieItems(JSONObject object){
        try {

            String title        = object.getString("title");
            String description  = object.getString("overview");
            String release_date = object.getString("release_date");
            String image        = object.getString("poster_path");
            String rate_count   = object.getString("vote_count");
            String rate         = object.getString("vote_average");

            this.title          = title;
            this.description    = description;
            this.date           = release_date;
            this.image          = image;
            this.rate_count     = rate_count;
            this.rate           = rate;

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public MovieItems() {

    }

    public String getMov_title() {
        return title;
    }

    public void setMov_title(String title) {
        this.title = title;
    }

    public String getMov_description() {
        return description;
    }

    public void setMov_description(String description) {
        this.description = description;
    }

    public String getMov_date() {
        return date;
    }

    public void setMov_date(String date) {
        this.date = date;
    }

    public String getMov_image() {
        return image;
    }

    public void setMov_image(String image) {
        this.image = image;
    }

    public String getMov_rate_count() {
        return rate_count;
    }

    public void setMov_rate_count(String rate_count) {
        this.rate_count = rate_count;
    }

    public String getMov_rate() {
        return rate;
    }

    public void setMov_rate(String rate) {
        this.rate = rate;
    }
}