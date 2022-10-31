package ar.edu.ort.navigationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//es como una pantalla, lo maneja el so de android y tiene un ciclo de vida
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // el oncreate es el primer callback que recibiremos en nuestra actividad
        setContentView(R.layout.activity_main) //aca le esta diciendo cargá esta vista en la pantalla, sin el activity_main, no tendría representación grafica.

    //val text = findViewById<TextView>(R.id.textView2)  //pasame la referencia a 1 recurso y yo te paso el entero que representa

    }
}