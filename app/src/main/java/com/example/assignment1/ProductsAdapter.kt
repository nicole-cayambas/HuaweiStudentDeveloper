package com.example.assignment1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter(private val context: Context, private val productList: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_product, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ProductsAdapter.ViewHolder, position: Int) {
        val product:Product = productList[position]
        holder.tv_name.text = product.name
        holder.tv_desc.text = product.description
        holder.tv_price.text = product.price.toString()
        holder.iv_product.setImageResource(product.image!!.toInt())

    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var iv_product: ImageView
        var tv_name: TextView
        var tv_desc: TextView
        var tv_price: TextView

        init {
            iv_product = itemView.findViewById(R.id.iv_product)
            tv_name = itemView.findViewById(R.id.tv_name)
            tv_desc = itemView.findViewById(R.id.tv_desc)
            tv_price = itemView.findViewById(R.id.tv_price)
        }
    }

}