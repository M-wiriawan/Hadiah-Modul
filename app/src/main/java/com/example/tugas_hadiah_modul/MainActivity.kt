package com.example.tugas_hadiah_modul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tiketList = listOf<Tiket>(
            Tiket(
                R.drawable.avatar,
                "Avatar",
                "Avatar adalah waralaba media Amerika yang menampilkan serangkaian film fiksi ilmiah epik. Waralaba ini diciptakan oleh James Cameron dan diproduksi oleh Lightstorm Entertainment, serta didistribusikan oleh 20th Century"
            ),

            Tiket(
                R.drawable.days,
                "172 Days",
                "Novel karya Nadzira Shafa yang menceritakan pengalaman pribadinya dengan mendiang suami tercinta. Perempuan yang karib disapa Ziraemitiskan ini menikah di usia yang terbilang muda, yakni 21 tahun."
            ),

            Tiket(
                R.drawable.fast,
                "Fast X",
                "Dom dan rekan nya hidup dengan damai, namun bahaya kembali mengancam Dom dan kru nya ketika Dante Reyes, anak dari Hernan Reyes (musuh di Fast Five) memutuskan untuk membalas dendam terhadap Dom, sekali lagi, Dominic dan kru nya harus kembali menghadapi musuh berbahaya untuk melindungi keluarga yang dicintainya"
            ),

            Tiket(
                R.drawable.ngerisedap,
                "Ngeri-ngeri Sedap",
                "Pak Domu dan Mak Domu merupakan orang tua dari empat orang anak: Sarma E. Purba; Domu, Gabe, dan Sahat Purba. Sarma tinggal bersama orangtuanya, sementara yang lain tinggal di kota-kota luar dengan karirnya tersendiri. Karena rindu dan menjelang sebuah pesta syukuran khas Batak, kedua orangtua ingin anak-anaknya pulang, namun terhalang dilema"
            ),

            Tiket(
                R.drawable.pertaruhan,
                "Pertaruhan",
                "Elzan dan Ical berusaha keluar dari lingkaran setan dan menjadi lebih baik. Namun, mereka kembali terseret dalam skema kriminal yang dirancang Irfan."
            ),

            Tiket(
                R.drawable.waktu,
                "Waktu Maghrib",
                "Adi, Saman, dan Ayu tinggal di Desa Jatijajar, sebuah desa terpencil di Jawa Tengah. Karena harus membantu keluarga mereka di ladang, Adi dan Saman sering terlambat masuk sekolah."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_tiket)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = TiketAdapter(this,tiketList){

        }
    }
}