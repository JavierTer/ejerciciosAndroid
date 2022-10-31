package ar.edu.ort.challenge6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var userName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNavBar()
    }

    private fun setupBottomNavBar(){

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment

        val navController = navHostFragment.navController

        val navigationView = findViewById<BottomNavigationView>(R.id.bottomNav)
        navigationView.setupWithNavController(navController)


    //Dentro de este listener tiene una función lambda
        /* Recibe: control, destination y arguments
        * */
        // Agrego un listener para poder escuchar cada vez que se realiza una navegacion
        navHostFragment.navController.addOnDestinationChangedListener { _, destination, arguments ->

            // Si mi destino es el login entonces oculto la barra inferior. Caso contrario la muestro
            //el id del fragment que quiero comparar lo obtengo del mismo nombre que se le puso en el nav_graph
            if (destination.id == R.id.login) {
                //la navigation bar es la que me guarde en la linea 24
                navigationView.visibility = View.GONE
            } else {
                navigationView.visibility = View.VISIBLE

                // Si mi destino es la Home, tomo el userName que recibio por parametro y lo almaceno en un Object
                if (destination.id == R.id.lista) {
                    //en sta linea nos estamos tomando los argumentos que utliza el mismo arguments que esta en la expresión lambda de arriba
                    //sobre esos argumentos estamos haciendo un get ()
                    arguments?.getString("name")?.let { name -> UserSession.userName = name }

                    /*Esta linea sería en Java: let hace un crea
                    val name = arguments?getString(key:"name)
                    if (name != null){
                    UserSession.userName = name
                    }
                    * */
                }
            }
        }
    }
}