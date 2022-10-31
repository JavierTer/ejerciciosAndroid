package ar.edu.ort.challenge6.fragment

import android.graphics.Paint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import ar.edu.ort.challenge6.R
import ar.edu.ort.challenge6.UserSession
import com.bumptech.glide.Glide
import org.w3c.dom.Text


class Perfil : Fragment() {

    lateinit var vista : View
    lateinit var nombreMostrar : TextView
    lateinit var boton : Button
    private lateinit var avatar : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_perfil, container, false)
        avatar        =  vista.findViewById(R.id.avatarImg)
        nombreMostrar =  vista.findViewById(R.id.editTextName)
        boton         =  vista.findViewById(R.id.buttonGuardar)
        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nombreMostrar.paintFlags = nombreMostrar.paintFlags or Paint.UNDERLINE_TEXT_FLAG
      //  contraseniaMostrar.paintFlags = contraseniaMostrar.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        nombreMostrar.text = UserSession.userName

        boton.setOnClickListener {
            val action = PerfilDirections.actionPerfilToLista(nombreMostrar.text.toString())
            findNavController().navigate(action)
        }

        avatar.setOnClickListener(){
            val action = PerfilDirections.actionPerfilToLista(nombreMostrar.text.toString())
            findNavController().navigate(action)

        }


        Glide.with(this)
            .load("https://www.w3schools.com/howto/img_avatar.png")
            .circleCrop()
            .into(avatar)
    }

}