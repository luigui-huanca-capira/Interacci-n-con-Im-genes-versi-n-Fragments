// Autor: Luigui Alexander Huanca Capira
// Fecha creación: 2024-09-25
// Fecha última modificación: 2024-09-25

package com.example.luigui1

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class ImageSelectionFragment : Fragment() {
    private lateinit var spinner: Spinner
    private lateinit var btnNext: Button
    private var listener: OnImageSelectedListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_image_selection, container, false)

        spinner = view.findViewById(R.id.spinnerImages)
        btnNext = view.findViewById(R.id.btnNext)

        val imageNames = arrayOf("imagen1", "imagen2", "imagen3", "imagen4")
        val adapter = ArrayAdapter(activity, android.R.layout.simple_spinner_item, imageNames)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        btnNext.setOnClickListener {
            listener?.onImageSelected(spinner.selectedItem.toString())
        }

        return view
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        if (activity is OnImageSelectedListener) {
            listener = activity
        } else {
            throw RuntimeException("$activity must implement OnImageSelectedListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnImageSelectedListener {
        fun onImageSelected(imageName: String)
    }
}