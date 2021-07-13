package com.marvel.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marvel.recycler.databinding.ListItemBinding
import com.marvel.recycler.model.Country

class CountryAdapter(private  var countries : List<Country>, val clickx: (Country) -> Unit) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

   inner class CountryViewHolder(var Binding : ListItemBinding) : RecyclerView.ViewHolder(Binding.root){

        fun bind (country: Country){
            Binding.imageView1.setImageResource(country.flag)
            Binding.manU.text = country.name
            Binding.root.setOnClickListener { clickx (country) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var Binding = ListItemBinding.inflate(LayoutInflater.from(parent.context))
        return  CountryViewHolder(Binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
       val country = countries[position]
        holder.bind(country)
    }

    override fun getItemCount(): Int {
        return countries.size
    }
}