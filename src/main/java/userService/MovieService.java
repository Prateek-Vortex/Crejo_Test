package userService;
import userDatabase.DatabaseClass;
import userModel.Moviemodel;

import java.util.HashMap;
import java.util.Map;

public class MovieService {
    private Map<String,Moviemodel> moviemodelMap= DatabaseClass.getMoviemodelMap();
    public Moviemodel addMovie(String details){
        String movieName=details;
        Moviemodel moviemodel=new Moviemodel(details);
        moviemodelMap.put(movieName,moviemodel);
        return moviemodel;
    }
}
