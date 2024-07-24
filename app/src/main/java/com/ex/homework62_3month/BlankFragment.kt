package com.ex.homework62_3month

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ex.homework62_3month.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
private lateinit var binding: FragmentBlankBinding
private lateinit var adapter: FilmAdapter
private  val filmList:ArrayList<Film> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        filmList.add(Film("Бойцовский клуб"))
        filmList.add(Film("Драйв(2011)"))
        filmList.add(Film("Дом который построил Джек"))
        filmList.add(Film("Грязь"))
        filmList.add(Film("Онг-Бак"))

        adapter = FilmAdapter(filmList)

        binding.rvFilms.adapter = adapter

    }


}