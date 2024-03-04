package com.srbastian.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class SecondFragment : Fragment() {

    lateinit var imageView : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_second, container, false)
        imageView = view.findViewById(R.id.imageView)

        when(arguments?.getInt("position", 0)) {
            0 -> imageView.setImageResource(R.drawable.fin)
            1 -> imageView.setImageResource(R.drawable.bublegum)
            2 -> imageView.setImageResource(R.drawable.jake)
            3 -> imageView.setImageResource(R.drawable.gunter)
            4 -> imageView.setImageResource(R.drawable.flame_princess)
        }

        return view
    }
}