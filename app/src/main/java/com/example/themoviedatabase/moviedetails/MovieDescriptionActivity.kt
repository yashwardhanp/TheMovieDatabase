package com.example.themoviedatabase.moviedetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.themoviedatabase.R
import com.example.themoviedatabase.models.MovieData

class MovieDescriptionActivity : AppCompatActivity() {

    private var movieDetails: MovieData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_description)
        movieDetails = intent.getSerializableExtra("movieData") as MovieData?
    }
}