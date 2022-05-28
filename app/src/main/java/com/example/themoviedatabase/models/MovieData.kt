package com.example.themoviedatabase.models

import java.io.Serializable

data class MovieData(
    val title: String,
    val overview: String,
    val release_date: String,
    val backdrop_path: String,
    val poster_path: String,
    val vote_average: Double,
    val popularity: Double
) : Serializable