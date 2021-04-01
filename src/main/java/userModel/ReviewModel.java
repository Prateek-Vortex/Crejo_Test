package userModel;

public class ReviewModel {
    String movieName;
    String movieRating;

    public ReviewModel(String movieName, String movieRating) {
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }
}
