package com.cesar.ecfinalmovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.cesar.ecfinalmovil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtHello.text = "Bienvenidos a la aplicación"

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_ec) as NavHostFragment
        val navController = navHostFragment.navController
        binding.btnMenu.setupWithNavController(navController)

        /*binding.btnMenu.setOnItemSelectedListener {item ->
            when (item.itemId){
                R.id.ECListFragment-> {
                    binding.txtHello.text = "Lista"
                    true
                }
                R.id.ECFavoriteFragment -> {
                    binding.txtHello.text = "Favorito"
                    true
                }
                R.id.ECInfoFragment -> {
                    binding.txtHello.text = "Info"
                    true
                }else -> {
                    false
                }
            }
        }*/
    }
}