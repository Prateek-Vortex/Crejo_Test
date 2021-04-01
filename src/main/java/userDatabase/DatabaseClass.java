package userDatabase;
import userModel.*;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    static Map<String,UserModel> userModelMap=new HashMap<>();
    static Map<String,Moviemodel> moviemodelMap=new HashMap<>();
    static Map<String,ReviewModel> reviewModelMap=new HashMap<>();

    public static Map<String, UserModel> getUserModelMap() {
        return userModelMap;
    }

    public static Map<String, Moviemodel> getMoviemodelMap() {
        return moviemodelMap;
    }

    public static Map<String, ReviewModel> getReviewModelMap() {
        return reviewModelMap;
    }



}
