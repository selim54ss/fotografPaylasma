package com.selimnnr.fotografpaylasma

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.selimnnr.fotografpaylasma.databinding.FragmentKullaniciBinding
import java.net.BindException


class KullaniciFragment : Fragment() {

    private var _binding: FragmentKullaniciBinding?= null

    private val binding get() = _binding!!
    //private lateinit var auth : FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //auth = Firebase.auth

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKullaniciBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.KayitButonu.setOnClickListener{ kayitOl(it)}
        binding.GirisButton.setOnClickListener{ girisYap(it)}
    }

    fun kayitOl(view : View){

        //val email = binding.EmailText.text.toString()
        //val password = binding.PasswordText.text.toString()

        //if (email.isNotEmpty() && password.isNotEmpty()){
            //auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener{ task ->
                //if(task.isSuccessful){
                    // kullanıcı oluşturuldu
                    val action = KullaniciFragmentDirections.actionKullaniciFragmentToFeedFragment()
                    Navigation.findNavController(view).navigate(action)
    //                }
    //            }.addOnFailureListener { exeption ->
    //                Toast.makeText(requireContext(), exeption.localizedMessage, Toast.LENGTH_SHORT).show()
    //            }
        }



    //        auth.createUserWithEmailAndPassword(email, pasworld)
    //            .addOnCompleteListener() { task -> }

    //        val action = KullaniciFragmentDirections.actionKullaniciFragmentToFeedFragment()
    //        Navigation.findNavController(view).navigate(action)

    fun girisYap(view : View){
        println("ıkalandı")
    }

    override fun onDestroyView() {  // "OnDestroyView" yerine "onDestroyView"
        super.onDestroyView()       // "OnDestroyView" yerine "onDestroyView"
        _binding = null
    }

}


