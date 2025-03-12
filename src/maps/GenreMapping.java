package maps;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenreMapping {

    static ArrayList<Movie> loadData(String path){
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            ArrayList<Movie> movies = new ArrayList<>();

            String[] params;
            for (String line : lines) {
                params = line.split(";");
                movies.add(new Movie(params[0], Integer.parseInt(params[1]), params[2], Double.parseDouble(params[3])));
            }
            return movies;
        } catch (IOException e) {
            System.out.println("Error data load: " + e.getMessage());
            return null;
        }

    }
    public static void main(String[] args) {
        ArrayList<Movie> movies = loadData("inputs\\movieList.txt");

        HashMap<String, List<Movie>> genreMap = new HashMap<>();

        for (Movie movie : movies) {
            if (genreMap.containsKey(movie.getGenre())) {
                genreMap.get(movie.getGenre()).add(movie);
            } else {    //ten žánr tam ještě neni
                ArrayList<Movie> newGenre = new ArrayList<>();
                newGenre.add(movie);
                genreMap.put(movie.getGenre(), newGenre);
            }
        }



        for (String genre : genreMap.keySet()) {
            System.out.println(genre + ":");
            for (Movie movie : genreMap.get(genre)) {
                System.out.println("|-" + movie);
            }
        }
    }
}

class Movie {
    String name;
    int year;
    String genre;
    double rating;

    public Movie(String name, int year, String genre, double rating) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
