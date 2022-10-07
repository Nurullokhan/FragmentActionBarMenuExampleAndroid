package com.example.fragmentactionbarmenuexampleandroid.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.fragmentactionbarmenuexampleandroid.R
import com.example.fragmentactionbarmenuexampleandroid.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(layoutInflater, container, false)

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
    }
}