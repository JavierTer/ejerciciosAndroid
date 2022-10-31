package ar.edu.ort.challenge4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ar.edu.ort.challenge4.R
import ar.edu.ort.challenge4.adapter.PeopleAdapter
import ar.edu.ort.challenge4.model.Person


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
          return inflater.inflate(R.layout.fragment_first, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //creamos las personas primero
       /* val person = Person("Martin")
        val person2 = Person("Julian")
        val person3 = Person ("Maria")
        val person4 = Person("Juan")
*/
        val people = mutableListOf<Person>()

        for (i in 1..20){
            val name = "persona "
            val personita = Person (name)
            people.add(personita)
            
        }


        //creamos el array(listOf)
        //val people = listOf<Person>(person, person2, person3, person4)

        //Le decimos al recyclerView que use el adapter que queremos usar.

        //1ro --> referenciamos el recyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        //instanciamos el people Adapter , pasandole por parametro la lista de personas
        val adapter = PeopleAdapter(people)

        //uso de layout manager
        /*Aca le especificamos como queremos que nos ordene
        * los elementos
        * linearLayoutManager los ordena en fila
        * es basicamente como los distribuye.
        * */
        recyclerView.layoutManager = LinearLayoutManager(context)

        //si queremos hacer otro tipo de visualización, x ej x columnas
        //recyclerView.layoutManager = GridLayoutManager(context, 2) --> el 2 es la cant de columnas que queremos

        //esto es un set del adapter
        recyclerView.adapter = adapter
    }

}