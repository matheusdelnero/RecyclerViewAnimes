package com.example.recyclerbymyself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerbymyself.adapter.AdapterAnime
import com.example.recyclerbymyself.model.modelAnime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
        val recyclerViewAnimes = findViewById<RecyclerView>(R.id.recyclerViewAnime)
        recyclerViewAnimes.layoutManager = LinearLayoutManager(this)
        recyclerViewAnimes.setHasFixedSize(true)

    //Configurar Adapter

        val listaAnimes: MutableList<modelAnime> = mutableListOf()
        val adapterApp = AdapterAnime(this,listaAnimes)
        recyclerViewAnimes.adapter = adapterApp


        val anime1 = modelAnime("Naruto Shippuden", "220", R.drawable.naruto)
        listaAnimes.add(anime1)
        val anime2 = modelAnime("One piece", "1100", R.drawable.luffy)
        listaAnimes.add(anime2)
        val anime3 = modelAnime("One Punch Man", "40", R.drawable.onepunchman)
        listaAnimes.add(anime3)
        val anime4 = modelAnime("Jujutsu Kaisen", "70", R.drawable.jujutsunokaisen)
        listaAnimes.add(anime4)
        val anime5 = modelAnime("Demon Slayer", "30", R.drawable.demonslayer)
        listaAnimes.add(anime5)
        val anime6 = modelAnime("Hunter x Hunter", "300", R.drawable.hunterxhunter)
        listaAnimes.add(anime6)
        val anime7 = modelAnime("Attack on Titans", "150", R.drawable.attackontitans)
        listaAnimes.add(anime7)






    }
}

