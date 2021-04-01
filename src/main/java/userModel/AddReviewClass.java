package userModel;

public class AddReviewClass {
    String userName;
    String movieName;
    String rating;

    public AddReviewClass(String userName, String movieName, String rating) {
        this.userName = userName;
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
