package com.ex.homework62_3month

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ex.homework62_3month.databinding.ItemFilmsBinding

class FilmAdapter(private val film: ArrayList<Film>):RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {
    class FilmViewHolder(item: View): RecyclerView.ViewHolder(item){
        private val binding = ItemFilmsBinding.bind(item)





        fun onBind(film: Film){
         binding.tvFilms.text =film.name
        }

    }




    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.item_films,parent,false)
        return FilmViewHolder(view)
    }

    override fun getItemCount(): Int {
       return film.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.onBind(film[position])
    }
}
