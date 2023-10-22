package br.com.alura.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.R
import br.com.alura.orgs.model.Product
import br.com.alura.orgs.ui.recyclerview.adapter.ListProductsAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        val name = findViewById<TextView>(R.id.name)
//        name.text = "Cesta de frutas"
//
//        val description = findViewById<TextView>(R.id.description)
//        description.text = "Manga, morangos"
//
//        val price = findViewById<TextView>(R.id.price)
//        price.text = "12.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ListProductsAdapter(
            this, listOf(
                Product("Product 1", "Desc 1", BigDecimal("12.99")),
                Product("Product 2", "Desc 2", BigDecimal("19.99"))
            )
        )

    }
}