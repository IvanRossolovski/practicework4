package com.example.MyHomework4

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.MyHomework4.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private lateinit var binding: FragmentThirdBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThirdBinding.bind(view)
        binding.returnToFirstFragmentButton.setOnClickListener {

            findNavController().popBackStack(R.id.rootFragment, false)
        }
        binding.returnTosecondFragmentButton.setOnClickListener {

            findNavController().popBackStack()
        }
    }

}