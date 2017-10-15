package com.example.samorodov.kotlinandroidintro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private class Student (val name: String, var age: Int )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val thisIsVariable = "some String"
//        Log.d("onCreate", thisIsVariable)



        for (i in 0..300){
            if ( ( i % 3 == 0 ) and ( i % 5 == 0 ) ) {
                Log.i("FizzBuzz", i.toString())
            }
            if ( ( i % 3 == 0 ) and ( i % 5 != 0 ) ) {
                Log.i("Fizz", i.toString())
            }
            if ( ( i % 5 == 0 ) and ( i % 3 != 0 ) ) {
                Log.i("Buzz", i.toString())
            }

        }


    }
}
