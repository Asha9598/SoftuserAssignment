package com.asha.softuserassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.asha.softuserassignment.R

class AboutUsFragment : Fragment() {
    private lateinit var about : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_about_us4, container, false)

        about = view.findViewById(R.id.about)
        about.loadUrl("https://softwarica.edu.np/about-softwarica/")

        return view
    }


}

