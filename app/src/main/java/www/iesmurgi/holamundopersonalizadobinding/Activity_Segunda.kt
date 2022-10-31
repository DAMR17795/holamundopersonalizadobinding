package www.iesmurgi.holamundopersonalizadobinding
//DANIEL ALEJANDRO MARTÍN ROMERO - 2ºDAM 2021/2022
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import www.iesmurgi.holamundopersonalizadobinding.databinding.ActivitySegundaBinding


class Activity_Segunda : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //importante
        binding.btFinalizar.setOnClickListener {onBackPressed()}
        mostrarNombre()
    }
    private fun mostrarNombre() {
        val mibundle=intent.extras
        val nombre = mibundle?.getString("SALUDOS")
        val tvSaludoPer=findViewById<TextView>(R.id.tvSaludoPer)
        tvSaludoPer.text="Bienvenido " + nombre
    }
}