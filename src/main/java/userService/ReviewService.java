package userService;

import userDatabase.DatabaseClass;
import userModel.AddReviewClass;
import userModel.ReviewModel;
import userModel.UserModel;

import java.util.Map;

public class ReviewService {
    public Map<String, ReviewModel> reviewModelMap= DatabaseClass.getReviewModelMap();
    private Map<String, UserModel> userModelMap=DatabaseClass.getUserModelMap();

    public ReviewModel addReview(AddReviewClass addReviewClass){
        String userName=addReviewClass.getUserName();
        ReviewModel reviewModel1=new ReviewModel(addReviewClass.getMovieName(),addReviewClass.getRating());

        if(!userModelMap.containsKey(userName))
        {
            System.out.println("User not exist");
            return null;
        }
        reviewModelMap.put(userName,reviewModel1);
        int val=userModelMap.get(userName).getReviewCount();
        val++;
        String tag=userModelMap.get(userName).getTag();
        UserModel userModel=new UserModel(userName,tag,val);
        userModelMap.put(userName,userModel);
        int getCount=userModelMap.get(userName).getReviewCount();
            if(getCount>3)
                update(userName,getCount,"Critic");


        return reviewModel1;
    }
    public void update(String userName,int count,String tag){
        UserModel userModel=new UserModel(userName,tag,count);
        userModelMap.put(userName,userModel);
    }

}
