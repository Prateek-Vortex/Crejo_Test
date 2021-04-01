package org.example.messageresource;

import userModel.Moviemodel;
import userService.MovieService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("movies")
public class RestMovie {
    MovieService movieService=new MovieService();
    @Path("/addmovie")
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String addMovie(String moviemodel){
        movieService.addMovie(moviemodel);
        return "Successfully added movie";
    }
}
