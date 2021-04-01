package org.example.messageresource;


import userModel.AddReviewClass;
import userService.ReviewService;
import userService.UserService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("users")
public class Rest {
    UserService userService=new UserService();
    ReviewService reviewService=new ReviewService();

    @Path("/add")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String addUser(String name){
      userService.addUser(name);
        return "Successfully added";
    }

    @Path("/review")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addUserReview(AddReviewClass addReviewClass){

        reviewService.addReview(addReviewClass);
        return "Successfully added review";
    }

}
