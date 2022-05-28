package com.example.themoviedatabase.modules.image

import android.widget.ImageView
import com.example.themoviedatabase.R
import com.squareup.picasso.Picasso

abstract class ImageModule {
    abstract val BASE_URL:String
    fun loadImage(imageUrl: String, iv: ImageView){
        Picasso.get().load("$BASE_URL$imageUrl")
            .placeholder(R.drawable.ic_launcher_background)
            .error(com.google.android.material.R.drawable.mtrl_ic_error)
            .into(iv)
    }
}