package ar.edu.ort.challenge4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navHostFragment : NavHostFragment
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_view)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        setupDrawerLayout()
    }

    private fun setupDrawerLayout() {

         val navController = navHostFragment.navController

        //Vinculo la navegación del drawer con la del graph
        navigationView.setupWithNavController(navController)

        //Configuramos la appBar para que muestre el icono del drawer y actualiza el titulo
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)

        navController.addOnDestinationChangedListener({_,_,_, ->
             //Aca le digo que quiero que mi icono izquierdo de la appbar sea el del drawer
            supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_home_24)
        })


 }

    /*Navigation sabe si tiene que devolver true o false por eso se devuelve completo todos los parametros y no
    false como en el caso de mas abajo.
    * */
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navHostFragment.navController, drawerLayout)
    }

    //Si yo quiero navegar entre fragments sin tener que volver con la flecha hacia atras

    //en esta función configuramos el drawer p/q siempre se abra el menu, en vez de volver hacia atras.
    //se pone START p/setearlo desde la izquierda.
    //abre el drawer si esta cerrado, cierra si esta abierto.
    /*
    siempre devuele false, xq si le devuelvo TRUE va a querer hacer la navegacion hacia atras.
    override fun onSupportNavigateUp(): Boolean {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        }
        else {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return false
    }
    */
}


