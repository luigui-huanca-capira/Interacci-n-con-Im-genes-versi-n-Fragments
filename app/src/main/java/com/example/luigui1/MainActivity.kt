// Autor: Luigui Alexander Huanca Capira
// Fecha creación: 2024-09-25
// Fecha última modificación: 2024-09-25

package com.example.luigui1

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity(), ImageSelectionFragment.OnImageSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            fragmentManager.beginTransaction()
                .add(R.id.fragment_container, ImageSelectionFragment())
                .commit()
        }
    }

    override fun onImageSelected(imageName: String) {
        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container, ImageDetailFragment.newInstance(imageName))
            .addToBackStack(null)
            .commit()
    }
}