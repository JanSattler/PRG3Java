package fileworks;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Kolekce vsech filmu v playlistu
 */
public class Playlist implements Serializable {

    /**
     * Kolekce vsech filmu v playlistu
     */
    List<Movie> programme;
    /**
     * Jmeno pro playlist filmu
     */
    String name;

    /**
     * Konstruktor pro vytvoreni playlistu rovnou s nejakou sadou filmu
     * @param name nazev pro playlist
     * @param programme pocatecni list, do kteroho lze vkladat
     */
    public Playlist(List<Movie> programme, String name){
        this.name = name;
        this.programme = programme;
    }

    /**
     * Konstruktor pro vytvoreni prazdneho playlistu
     * @param name nazev pro playlist
     */
    public Playlist(String name){
        this.name = name;
        this.programme = new ArrayList<>();
    }



        //Vypise ve formatu: PlaylistName (doba trvani ve formatu mm:ss):
        //
        //                      movie1.toString()...


    @Override
    public String toString() {
        return "Playlist{" +
                "programme=" + programme +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Metoda pro celkove doby trvani ve vterinach
     * @return
     */
    public int getTotalDuration(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputs\\MoviesPractice.txt"));
        Movie movie;
        ArrayList<Movie> movies = new ArrayList<>();
        for (String line : lines){
            String[] params = line.split(";");
            movie = new Movie(params[0], Integer.parseInt(params[1]), Double.parseDouble(params[2]), Integer.parseInt(params[3]));
            movies.add(movie);
        }
        System.out.println(movies);
    }
}
