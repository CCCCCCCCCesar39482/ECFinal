package com.cesar.ecfinalmovil.fragments

import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.cesar.ecfinalmovil.databinding.ItemEcBinding
import com.cesar.ecfinalmovil.model.ecf

class RVECListAdapter(private val ec: List<ecf>) : RecyclerView.Adapter<ECVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ECVH {
        val binding = ItemEcBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ECVH(binding)
    }

    override fun getItemCount(): Int = ec.size

    override fun onBindViewHolder(holder: ECVH, position: Int) {
        holder.bind(ec[position])
    }
}

class ECVH(private val binding: ItemEcBinding): ViewHolder(binding.root){
    fun bind(ecf: ecf) {
        binding.txtNoteEc.text = ecf.name
        binding.cvItemEc.setCardBackgroundColor(ColorStateList.valueOf(ecf.id))
        binding.txtContentEc.text = ecf.family
        binding.txtCreatedonEc.text = ecf.order
    }


}