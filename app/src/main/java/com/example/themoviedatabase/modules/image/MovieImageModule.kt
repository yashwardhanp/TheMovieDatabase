package com.example.themoviedatabase.modules.image

object MovieImageModule: ImageModule() {
    override val BASE_URL: String
        get() = "https://image.tmdb.org/t/p/w500"
}