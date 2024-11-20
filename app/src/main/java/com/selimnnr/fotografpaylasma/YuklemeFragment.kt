package com.selimnnr.fotografpaylasma

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.selimnnr.fotografpaylasma.databinding.FragmentYuklemeBinding

class YuklemeFragment : Fragment() {

    private var _binding: FragmentYuklemeBinding?= null

    private val birding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentYuklemeBinding. inflate(inflater, container, false)
        val view = birding.root
        return view
    }

    fun yukleTiklandi(view: View){

    }

    fun gorselSec(view: View){

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        birding.yuklebutton.setOnClickListener { yukleTiklandi(it) }
        birding.imageView2.setOnClickListener { gorselSec(it) }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}