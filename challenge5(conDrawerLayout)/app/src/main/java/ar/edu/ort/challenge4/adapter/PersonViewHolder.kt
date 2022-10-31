package ar.edu.ort.challenge4.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ar.edu.ort.challenge4.R
import ar.edu.ort.challenge4.model.Person

class PersonViewHolder(itemView : View) : RecyclerView.ViewHolder (itemView) {

    private val titleText : TextView = itemView.findViewById(R.id.item_title)

    //esta función bindea los datos
    //el titulo que me llegue a mi viewHolder se lo setea al item_title
    fun bind(person : Person){
        titleText.text = person.name
    }
}