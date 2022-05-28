package com.example.themoviedatabase.moviedetails

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.themoviedatabase.R
import com.example.themoviedatabase.models.MovieData
import com.example.themoviedatabase.modules.image.MovieImageModule

class MovieItemViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val imageView = itemView.findViewById<ImageView>(R.id.poster_iv)
    private val titleTv = itemView.findViewById<TextView>(R.id.title_tv)
    private val descTv = itemView.findViewById<TextView>(R.id.desc_tv)

    fun updateData(movieData: MovieData) {
        titleTv.text = movieData.title
        descTv.text = movieData.overview
        MovieImageModule.loadImage(movieData.poster_path, imageView)
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, MovieDescriptionActivity::class.java)
            val bundle = Bundle()
            bundle.putSerializable("movieData", movieData)
            intent.putExtras(bundle)
            itemView.context.startActivity(intent)
        }
    }
}