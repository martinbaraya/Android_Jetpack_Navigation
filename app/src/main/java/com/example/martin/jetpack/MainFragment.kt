package com.example.martin.jetpack

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class MainFragment : android.support.v4.app.Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //set on click listener


            view.findViewById<Button>(R.id.button)?.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_firstFragment)
            }
            view.findViewById<Button>(R.id.button2)?.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_secondFragment)
            }



    }
}