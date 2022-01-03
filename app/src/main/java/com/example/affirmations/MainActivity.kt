package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inicializar dados
        val myDataset = Datasource().loadAffirmations()
        // setar recylerView
        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)

        // setar o adapter do recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true) // usar se souber que mudanças no conteúdo
                                           // não alterará o tamanho do layout do rView

    }
}