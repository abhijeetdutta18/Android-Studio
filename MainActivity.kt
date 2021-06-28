// Define Variables and their Values, Display the Values in Logcat
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var artist: String = "Kumar Sanu"// Name of the Singer
        var songName:String = "Tumhe Apna Banane Ki Kasam"// Name of the Song
        var movie:String="Sadak"//Name of the Movie
        var yearReleased: Int = 1991//Release Year
        var genre: String = "Pop"// Type of Song
        var duration: Float = 6.50f//Duration in Minutes
        var rating:Double = 9.8//Rating out of 10
        val yearReleased2:String=yearReleased.toString()
        val duration2:String=duration.toString()
        val rating2:String=rating.toString()
        Log.d("Artist",artist)
        Log.d("Song Name",songName)
        Log.d("Movie Name",movie)
        Log.d("Release Year",yearReleased2)
        Log.d("Genre",genre)
        Log.d("Duration(Minutes)",duration2)
        Log.d("Rating",rating2)
    }

}