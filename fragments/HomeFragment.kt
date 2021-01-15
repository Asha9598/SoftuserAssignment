package com.asha.softuserassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.asha.softuserassignment.R
import com.asha.softuserassignment.adapter.StudentAdapter
import com.asha.softuserassignment.model.StudentList

class HomeFragment: Fragment() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        val adapter = StudentAdapter(StudentList.fetchStudent(),this)
        recyclerView.layoutManager = LinearLayoutManager(context!!)
        recyclerView.adapter = adapter



        return view




    }


}


