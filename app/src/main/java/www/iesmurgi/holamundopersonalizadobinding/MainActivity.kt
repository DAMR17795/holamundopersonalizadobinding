package www.iesmurgi.holamundopersonalizadobinding
//DANIEL ALEJANDRO MARTÍN ROMERO - 2ºDAM 2022/2023
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import www.iesmurgi.holamundopersonalizadobinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btSiguiente.setOnClickListener {chequear()}
    }
    private fun mostrarErrorNbre() {
        Toast.makeText(this, "El nombre del usuario no puede estar vacio", Toast.LENGTH_SHORT).show()
    }

    fun chequear() {
        //Comprobar si el usuario  ha escrito su nombre
        val etNombre:EditText
        etNombre = findViewById<EditText>(R.id.etNombre)
        if(etNombre.text.isNotEmpty()) {
            //iremos a la nueva actividad
            val enviar= Intent(this, Activity_Segunda::class.java)
            enviar.putExtra("SALUDOS", etNombre.text.toString())
            startActivity(enviar)
        } else {
            //Mostramos un mensaje de que no tenemos nombre
            mostrarErrorNbre()
        }
    }
}