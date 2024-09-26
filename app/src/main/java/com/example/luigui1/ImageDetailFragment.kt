// Autor: Luigui Alexander Huanca Capira
// Fecha creación: 2024-09-25
// Fecha última modificación: 2024-09-25

package com.example.luigui1

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ImageDetailFragment : Fragment() {
    private lateinit var imageView: ImageView
    private lateinit var textViewImageName: TextView
    private lateinit var btnBack: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_image_detail, container, false)

        imageView = view.findViewById(R.id.imageView)
        textViewImageName = view.findViewById(R.id.textViewImageName)
        btnBack = view.findViewById(R.id.btnBack)

        val selectedImage = arguments?.getString(ARG_IMAGE_NAME) ?: "imagen1"
        textViewImageName.text = selectedImage

        val resourceId = when (selectedImage) {
            "imagen1" -> R.drawable.imagen1
            "imagen2" -> R.drawable.imagen2
            "imagen3" -> R.drawable.imagen3
            "imagen4" -> R.drawable.imagen4
            else -> R.drawable.imagen1
        }
        imageView.setImageResource(resourceId)

        btnBack.setOnClickListener {
            activity.fragmentManager.popBackStack()
        }

        return view
    }

    companion object {
        private const val ARG_IMAGE_NAME = "imageName"

        fun newInstance(imageName: String): ImageDetailFragment {
            val fragment = ImageDetailFragment()
            val args = Bundle()
            args.putString(ARG_IMAGE_NAME, imageName)
            fragment.arguments = args
            return fragment
        }
    }
}