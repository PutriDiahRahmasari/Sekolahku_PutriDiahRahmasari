package com.example.sekolahku_putridiahrahmasari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var jadwal : CardView
    private lateinit var jurusan : CardView
    private lateinit var ppdb : CardView
    private lateinit var bkk : CardView
    private lateinit var tentang : CardView
    private lateinit var berita : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jadwal = findViewById(R.id.jadwal)
        jurusan = findViewById(R.id.jurusan)
        ppdb = findViewById(R.id.ppdb)
        bkk = findViewById(R.id.bkk)
        tentang = findViewById(R.id.tentang)
        berita = findViewById(R.id.berita)
        this.tbPpdb()
    }

    fun tbPpdb() {
        ppdb.setOnClickListener {
            startActivity(Intent(this, sekolahku2::class.java))
            finish()
        }

    }
}
