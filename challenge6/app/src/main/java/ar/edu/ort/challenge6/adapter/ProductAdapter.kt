package ar.edu.ort.challenge6.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ar.edu.ort.challenge6.R
import ar.edu.ort.challenge6.model.Product
import ar.edu.ort.challenge6.listener.OnProductClickListener

// Esta clase tiene la lógica que adaptará la lista para el recycler.

class ProductAdapter (
    private val productList: List<Product>,
    private val onProductClickListener : OnProductClickListener

) : RecyclerView.Adapter<ProductViewHolder>() {

    //hace el inflate del layout que le pasamos por parametro.
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
       return ProductViewHolder(view)
    }
    //en base a la posicion obtiene ese producto de la lista y se la pasa al viewHolder (con la fun bind del viewHolder)
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        val product = productList[position]

        holder.bind(product)

        //seteamos el holder.

        holder.itemView.setOnClickListener {
            onProductClickListener.onProductSelected(product)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}