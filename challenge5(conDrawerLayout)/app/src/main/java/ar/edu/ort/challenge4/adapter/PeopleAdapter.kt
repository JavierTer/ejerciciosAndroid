package ar.edu.ort.challenge4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ar.edu.ort.challenge4.R
import ar.edu.ort.challenge4.model.Person

class PeopleAdapter (private val peopleList: List<Person>) :
    RecyclerView.Adapter<PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        //from pide un context (q esta vinculada al contexto de la app que esta corriendo.
        //parent
        //1er param = q es lo que quiero inflar
        //2do param = a donde (parent)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.simple_item, parent, false)
        return PersonViewHolder(view)

    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(peopleList[position])
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }
    /*Cuando tiene 1 solo return nada mas se podria hacer de la siguiente manera
     override fun getItemCount() = return peopleList.size

    * */
}