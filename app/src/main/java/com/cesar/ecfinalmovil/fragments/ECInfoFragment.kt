package com.cesar.ecfinalmovil.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cesar.ecfinalmovil.databinding.FragmentECInfoBinding

class ECInfoFragment : Fragment() {
    private lateinit var binding: FragmentECInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentECInfoBinding.inflate(inflater, container, false)
        return binding.root
    }


}