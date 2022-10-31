package ar.edu.ort.challenge6.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import ar.edu.ort.challenge6.R


class Login : Fragment() {

    private lateinit var userEditText : EditText
    private lateinit var passEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        val button = view.findViewById<Button>(R.id.button)
        userEditText = view.findViewById(R.id.editTextUser)
        passEditText = view.findViewById(R.id.editTextPassword)

        button.setOnClickListener {
            val nameEnviar = userEditText.text.toString()
            navController.navigate(LoginDirections.actionLoginToLista(
            userEditText.text.toString()
            ))


        }
    }

}