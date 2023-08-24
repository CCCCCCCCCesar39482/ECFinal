package com.cesar.ecfinalmovil.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cesar.ecfinalmovil.databinding.FragmentECListBinding
import com.cesar.ecfinalmovil.model.getData

class ECListFragment : Fragment() {
    private lateinit var binding: FragmentECListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentECListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvEcList.adapter = RVECListAdapter(getData())

    }

}