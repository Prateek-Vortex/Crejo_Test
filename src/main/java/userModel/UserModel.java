package userModel;

public class UserModel {
    public String userName;
    public String tag;
    public int reviewCount;

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }


    public UserModel(String name, String tag,int reviewCount) {
        this.userName = name;
        this.tag = tag;
        this.reviewCount=reviewCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
