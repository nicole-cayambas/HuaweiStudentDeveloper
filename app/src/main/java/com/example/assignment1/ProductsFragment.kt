package com.example.assignment1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_products.*


class ProductsFragment:Fragment(R.layout.fragment_products) {

    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var adapter: ProductsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layoutManager = LinearLayoutManager(activity)
        rv_products.layoutManager = layoutManager
        adapter = ProductsAdapter(requireContext(), ProductList())
        rv_products.adapter = adapter
    }
}