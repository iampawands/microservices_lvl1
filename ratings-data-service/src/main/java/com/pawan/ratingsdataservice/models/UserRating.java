package com.pawan.ratingsdataservice.models;

import java.util.List;

public class UserRating {
    public List<Rating> ratingList;

    public UserRating(){}
    public UserRating(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }
}
