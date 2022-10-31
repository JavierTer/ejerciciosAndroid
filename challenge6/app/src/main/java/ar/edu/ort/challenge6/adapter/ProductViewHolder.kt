package ar.edu.ort.challenge6.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ar.edu.ort.challenge6.R
import ar.edu.ort.challenge6.model.Product
import com.bumptech.glide.Glide

class ProductViewHolder(item : View) : RecyclerView.ViewHolder (item) {


    private lateinit var  nameText : TextView
    private lateinit var priceText : TextView
    private lateinit var image : ImageView

    init {
        nameText  = item.findViewById(R.id.nameProduct)
        priceText = item.findViewById(R.id.priceProduct)
        image     = item.findViewById(R.id.imgMostrar)
    }
    fun bind(product: Product) {
        nameText.text = product.nombre
        priceText.text = "$ ${product.precio}"

        Glide.with(itemView)
            .load(product.imageLink)
            .into(image)


    }


}


