package ar.edu.ort.challenge4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomNavBar()


    }

    //conectamos la vista al componente de navegacion
    private fun setupBottomNavBar() {

        //referenciamos el fragment que hace la navegación y lo casteamos a navHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        //tomamos el controlador del navHostFragment que es el que hace las conexiones.
        val navController = navHostFragment.navController

        //buscamos el bottomNavigationView
        val navigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)
        navigationView.setupWithNavController(navController)

    }

}


