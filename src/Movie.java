public class Movie {
    private String title;
    private String director;
    private Double rating;

    public Movie(String title, String director, Double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public void rateMovie(double newRating){
        if (newRating >= 0.0 && newRating <= 10.0) {
            rating = newRating;
            System.out.println("the movie rating is : " + rating);
        } else {
            System.out.println("Invalid Rating");
        }
    }

    public void displayMovieInfo(){
        System.out.println("Title Of Movie : " + title + "Director Name: " + director + "Rating : " +rating);
    }

    public static void main(String[] args) {
        Movie myMovie = new Movie("Bejir", "Bejir", 9.9);
        myMovie.displayMovieInfo();
        myMovie.rateMovie(9.5);
        myMovie.displayMovieInfo();
    }
}
