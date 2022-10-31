package ar.edu.ort.challenge6.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import ar.edu.ort.challenge6.R
import ar.edu.ort.challenge6.UserSession
import com.bumptech.glide.Glide


class Detalle : Fragment() {

    private lateinit var nombre: TextView
    private lateinit var price: TextView
    private lateinit var productImage: ImageView

    lateinit var vista : View
    private lateinit var botonComprar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_detalle, container, false)
        botonComprar = vista.findViewById(R.id.buttonComprar)
        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nombre = view.findViewById(R.id.product_description)
        price = view.findViewById(R.id.product_price)
        productImage = view.findViewById(R.id.product_image)

        arguments?.let {
            val product = DetalleArgs.fromBundle(it).producto

            nombre.text = product.nombre
            price.text = "$ ${product.precio}"
           // price.text = "$ " + product.precio.toString()

            Glide.with(this)
                .load(product.imageLink)
                .into(productImage)
        }

        botonComprar.setOnClickListener {
            val action = DetalleDirections.actionDetalleToLista(UserSession.userName.toString())
            findNavController().navigate(action)
        }


    }
}