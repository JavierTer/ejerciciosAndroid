package ar.edu.ort.challenge3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import ar.edu.ort.challenge3.R


class Fragmento2 : Fragment() {

    lateinit var vista : View
    lateinit var textoMostrar : TextView
    lateinit var btnRegreso : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_fragmento2, container, false)

        btnRegreso = vista.findViewById(R.id.btn_a_home)
        textoMostrar = vista.findViewById(R.id.muestraNombre)
        return vista
    }

    //El onStart() comienza cuando ya tenes toda la vista montada.
    override fun onStart() {
        super.onStart()

        textoMostrar.text = "Hola " + Fragmento2Args.fromBundle(requireArguments()).dato

        btnRegreso.setOnClickListener {
            val action = Fragmento2Directions.actionF2ToF1()
            vista.findNavController().navigate(action)
        }
    }
}