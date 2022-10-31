package ar.edu.ort.challenge3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import ar.edu.ort.challenge3.Entities.DatoParcelableNuevo
import ar.edu.ort.challenge3.R


class Fragmento1 : Fragment() {

    lateinit var textoEnviar : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_fragmento1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textoIngresado = view.findViewById<EditText>(R.id.inputName)
        val navigate2 = view.findViewById<Button>(R.id.Btn_to_2)
        val navigate3 = view.findViewById<Button>(R.id.btn_to_3)


        navigate2.setOnClickListener {
            textoEnviar = textoIngresado.text.toString()
            val action = Fragmento1Directions.actionF1ToF2(textoEnviar)
            findNavController().navigate(action)
        }
        navigate3.setOnClickListener {

            textoEnviar = textoIngresado.text.toString()
            val data = DatoParcelableNuevo(textoEnviar)
            val action = Fragmento1Directions.actionF1ToF3(data)
            findNavController().navigate(action)
        }
    }



}