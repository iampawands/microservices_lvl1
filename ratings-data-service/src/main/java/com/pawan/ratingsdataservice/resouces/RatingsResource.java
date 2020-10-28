package com.pawan.ratingsdataservice.resouces;

import com.pawan.ratingsdataservice.models.Rating;
import com.pawan.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,5);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings =  Arrays.asList(
                new Rating("1234",5),
                new Rating("5647",5)
        );
        return new UserRating(ratings);
    }

}
