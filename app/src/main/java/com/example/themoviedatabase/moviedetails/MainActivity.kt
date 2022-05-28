package com.example.themoviedatabase.moviedetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.themoviedatabase.R

class MainActivity : AppCompatActivity() {

    private val viewModel: MovieListViewModel =
        MovieListViewModel()
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.fetchMovies(applicationContext.resources)
        setupRecyclerView()
    }

    override fun onResume() {
        super.onResume()
    }

    private fun setupRecyclerView(){
        recyclerView = findViewById(R.id.movieListContainer)
        val movieListAdapter = MovieListAdapter(viewModel.moviesResult)
        recyclerView.adapter = movieListAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }


}