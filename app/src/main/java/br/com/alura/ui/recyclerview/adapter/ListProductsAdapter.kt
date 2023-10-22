package br.com.alura.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.R
import br.com.alura.model.Product

class ListProductsAdapter(private val context: Context, private val products: List<Product>) :
    RecyclerView.Adapter<ListProductsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun addProduct(product: Product) {
            itemView.findViewById<TextView>(R.id.name).text = product.name
            itemView.findViewById<TextView>(R.id.description).text = product.description
            itemView.findViewById<TextView>(R.id.price).text = product.price.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.addProduct(product)
    }

}