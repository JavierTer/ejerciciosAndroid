package ar.edu.ort.challenge3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import ar.edu.ort.challenge3.R


class Fragmento3 : Fragment() {

    lateinit var vista : View
    lateinit var btn1 : Button
    lateinit var textoMostrar : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_fragmento3, container, false)
        btn1 = vista.findViewById(R.id.btnAHome)
        textoMostrar = vista.findViewById(R.id.txtMostrar)
        return vista
    }

    override fun onStart() {
        super.onStart()
        val dato = Fragmento3Args.fromBundle(requireArguments()).unParcelable
        textoMostrar.text = dato.unDato
    }

}