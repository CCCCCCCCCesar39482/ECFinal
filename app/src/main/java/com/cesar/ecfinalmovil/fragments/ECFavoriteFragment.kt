package com.cesar.ecfinalmovil.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cesar.ecfinalmovil.databinding.FragmentECFavoriteBinding

class ECFavoriteFragment : Fragment() {
    private lateinit var binding: FragmentECFavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentECFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }


}