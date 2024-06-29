package com.example.blogreader

import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvNames.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        displayBlogs()

    }
    fun displayBlogs(){
        val author1= Author("Agnes Ajema","Amazing Love","26 June 2023","","Read more..","","The end gonna be sweet if we all believe \n" +
                "she's an amazing soul to meet \n" )
        val author2= Author("Gifton Bandi","Amazing Love","27 June 2023","","Read more..","","The end gonna be sweet if we all believe \n" +
                "she's an amazing soul to meet \n" )
        val author3= Author("Precious Echenje","Amazing Love","28 June 2023","","Read more..","","The end gonna be sweet if we all believe \n" +
                "she's an amazing soul to meet \n" )
        val author4= Author("Ruth Bandi","Amazing Love","29 June 2023","","Read more..","","The end gonna be sweet if we all believe \n" +
                "she's an amazing soul to meet \n" )
        val author5= Author("Martha Phanice","Amazing Love","20 June 2023","","Read more..","","The end gonna be sweet if we all believe \n" +
                "she's an amazing soul to meet \n" )
        val author6= Author("Damaris Ayanga","Amazing Love","21 June 2023","","Read more..","","The end gonna be sweet if we all believe \n" +
                "she's an amazing soul to meet \n" )
        val author7= Author("Grace Achila","Amazing Love","22 June 2023","","Read more..","","The end gonna be sweet if we all believe \n" +
                "she's an amazing soul to meet \n" )
        var authors = listOf(author1,author2,author3,author4,author5,author6,author7)

        val blogAdapter = BlogAdapter(authors)
        binding.rvNames.adapter = blogAdapter

    }
}