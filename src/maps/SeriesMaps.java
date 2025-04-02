package maps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SeriesMaps {
    public static void main(String[] args) throws IOException {
        List<Series> seriesList = Files.lines(Paths.get("inputs\\series.csv"))  //už vrací stream
                .skip(1)
                .map(line -> line.split(";"))
                .map(splitline -> new Series(
                        splitline[0],
                        splitline[1]
                ))
                .toList();

        List<Episode> episodes = Files.lines(Paths.get("inputs\\episodes.csv"))
                .skip(1)
                .map(line -> line.split(";"))
                .map(parts -> new Episode(
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[1]),
                        Double.parseDouble(parts[2]),
                        parts[3]
                ))
                .toList();
    }
}

class Series {
    String seriesID;
    String title;
    List<Episode> episodes;

    public Series(String seriesID, String title) {
        this.seriesID = seriesID;
        this.title = title;
        this.episodes = new ArrayList<>();
    }

    void addEpisode(Episode e) {
        this.episodes.add(e);
    }

    public String getSeriesID() {
        return seriesID;
    }

    public String getTitle() {
        return title;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
class Episode {
    String episodeID;
    int episodeNumber;
    double rating;
    int season;

    public Episode(int season, int episodeNumber, double rating, String episodeID) {
        this.episodeID = episodeID;
        this.episodeNumber = episodeNumber;
        this.rating = rating;
        this.season = season;
    }

    public String getEpisodeID() {
        return episodeID;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public double getRating() {
        return rating;
    }

    public int getSeason() {
        return season;
    }
}
