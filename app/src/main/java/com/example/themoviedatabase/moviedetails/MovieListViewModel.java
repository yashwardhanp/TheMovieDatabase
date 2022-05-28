package com.example.themoviedatabase.moviedetails;

import android.content.res.Resources;

import androidx.lifecycle.ViewModel;

import com.example.themoviedatabase.R;
import com.example.themoviedatabase.models.MovieData;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieListViewModel extends ViewModel {

    private final List<MovieData> moviesResult = new ArrayList<>();

    public void fetchMovies(Resources res) {
        InputStream moviesInput = res.openRawResource(R.raw.movies);
        try {
            byte[] b = new byte[moviesInput.available()];
            moviesInput.read(b);
            JSONArray movies = new JSONObject(new String(b)).getJSONArray("results");

            for (int i=0; i<movies.length(); i++){
                JSONObject movie = movies.getJSONObject(i);
                moviesResult.add(
                        new MovieData(
                                movie.getString("title"),
                                movie.getString("overview"),
                                movie.getString("release_date"),
                                movie.getString("backdrop_path"),
                                movie.getString("poster_path"),
                                movie.getDouble("vote_average"),
                                movie.getDouble("popularity")
                        )
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<MovieData> getMoviesResult() {
        return moviesResult;
    }
}
