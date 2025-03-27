package maps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieReviews {
    // TODO: 19.03.2025 1: parse souboru (parsing + tridy)
    // 2: Mapa (film, List<review>)
    static class Movie {
        private int movieID;
        private String title;
        private String genre;
        private double rating;  //přidávam ze souboru, proto neni v konstruktoru



        public Movie(int movieID, String title, String genre) {
            this.movieID = movieID;
            this.title = title;
            this.genre = genre;
            this.rating = Double.NaN;
        }

        public int getMovieID() {
            return movieID;
        }

        public String getTitle() {
            return title;
        }

        public String getGenre() {
            return genre;
        }

        public double getRating() {
            return rating;
        }


        public void setMovieID(int movieID) {
            this.movieID = movieID;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

    }

    static class Rating {
        private int movieID;
        private double ratintg;

        public Rating(int movieID, double ratintg) {
            this.movieID = movieID;
            this.ratintg = ratintg;
        }

        public int getMovieID() {
            return movieID;
        }

        public double getRatintg() {
            return ratintg;
        }
    }

    public static void main(String[] args) throws IOException {
        List<Movie> movies = Files.lines(Paths.get("inputs\\logins\\input.csv"))   //omylem sem to dal do logins
                .skip(1)
                .map(line -> line.split(","))
                .map(parts -> new Movie(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2]
                ))
                .toList();

        System.out.println("Nacteno filmů: "+movies.size());

        List<Rating> ratings = Files.lines(Paths.get("inputs\\logins\\ratings.csv"))
                .skip(1)
                .map(line -> line.split(","))
                .map(parts -> new Rating(
                        Integer.parseInt(parts[1].trim()),  //metoda trim je slušnost a dává pryč nadbytečný mezery
                        Double.parseDouble(parts[2].trim())
                ))
                .toList();
        System.out.println("recenzí načteno: "+ratings.size());

        //namapovat
        //namapovat zonvu
        //jednotlivě vypočítat průměry
        //vypsat random deset filmů i s ratingem
        //vypsat prumerny rating pro kategorii.

        //GOOD řešení:
        Map<Integer, List<Double>> ratingsMap = ratings.stream()
                .collect(Collectors.groupingBy(
                        Rating::getMovieID,
                        Collectors.mapping(Rating::getRatintg, Collectors.toList())
                ));


        movies.forEach(movie -> {
            List<Double> movieRatings = ratingsMap.get(movie.getMovieID());
            if (movieRatings != null && !movieRatings.isEmpty()) {
                double avg = movieRatings.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
                movie.setRating(avg);
            }
        });
        movies.forEach(m -> System.out.println(m.getTitle() + ": " + m.getRating()));



        //Řešení bez map a lambd:
        //na gitu
    }
}
