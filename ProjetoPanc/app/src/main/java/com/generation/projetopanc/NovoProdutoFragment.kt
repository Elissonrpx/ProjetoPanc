package com.generation.projetopanc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.generation.projetopanc.databinding.FragmentNovoProduto2Binding


class NovoProdutoFragment : Fragment() {

    private lateinit var binding : FragmentNovoProduto2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNovoProduto2Binding.inflate(layoutInflater,container, false)


        return binding.root

    }


}