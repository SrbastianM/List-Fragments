package com.srbastian.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val position = intent.getIntExtra("position", 0)


        val secondFragmentManager : FragmentManager = supportFragmentManager
        val secondFragmentTransaction : FragmentTransaction = secondFragmentManager.beginTransaction()


        val secondFragment = SecondFragment()

        val bundle = Bundle()
        bundle.putInt("position", position)
        secondFragment.arguments = bundle

        secondFragmentTransaction.add(R.id.frameLayout, secondFragment)
        secondFragmentTransaction.commit()

    }
}