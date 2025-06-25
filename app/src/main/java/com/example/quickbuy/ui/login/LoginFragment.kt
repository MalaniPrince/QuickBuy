package com.example.quickbuy.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.quickbuy.R
import com.example.quickbuy.databinding.FragmentLoginBinding
import com.example.quickbuy.ui.home.HomeMainActivity
import com.example.quickbuy.utils.PreferenceHelper


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            binding.buttonLogin.setOnClickListener {
                var useremail = binding.InputEmail.text.toString()
                var password = binding.InputPassword.text.toString()
                if (useremail == "admin" && password == "123") {
                    PreferenceHelper.setUserEmail(requireContext(),useremail)
                    startActivity(Intent(requireContext(), HomeMainActivity::class.java))
                }
                else{
                    Toast.makeText(context, "Enter Valid UserName & Password", Toast.LENGTH_SHORT).show()
                }

            }
        binding.LoginToSignUp.setOnClickListener{
            findNavController().navigate(R.id.SignUpFragment)
        }
    }

}