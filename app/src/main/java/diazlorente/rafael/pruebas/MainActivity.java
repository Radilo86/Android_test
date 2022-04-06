package diazlorente.rafael.pruebas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* Creamos una funcion que no devuelve nada (void)
    * Y a la que le pasamos un tipos View al que llamamos view,
    * este view es el boton desde el que se realiza la llamada.
    */
    public void accionBotonAceptar(View view) {
        /*
         * Ponemos el nombre de la funcion en el campo propiedades del boton
         * llamado onClick, para que desde alli llame a la funcion.
         */

        // Al pulsar el boton aparece el mensaje funciona en la consola de Android Studio
        Log.i("filtrar", "Funciona");

        // Mostramos el texto que hemos introducido mediante el EditText
        // Para ello creamos una variable del tipo de la View, en este caso
        // EditText y utilizamos el metodo obtener texto que ya lleva incluido.
        EditText textoNombre = findViewById(R.id.editText);
        EditText password = findViewById(R.id.TextPassword);
        Log.i("filtrar", "El nombre es: " + textoNombre.getText().toString() +
        " y la contraseña es: " + password.getText().toString());
        // Borramos el texto introducido
        // textoNombre.setText("");

        /*
        * Creamos un mensaje limitado en el tiempo, con toast al que le pasamos el contexto (la vista
        * donde se visualizara), nuestro mensaje personalizado y el tiempo de duracion. Por ultimo
        * con show() lo mostramos por pantalla.
        */
        Toast.makeText(this,"Loguin creado", Toast.LENGTH_SHORT).show();

        // Ahora mostramos el valor introducido anteriormente y lo mostramos en
        // el campo anterior de tipo TextView, cambiando el mensaje mostrado por
        // defecto.
        TextView textoNombre2 = findViewById((R.id.textView));
        textoNombre2.setText(textoNombre.getText().toString());
    }


    // Esta funcion cambia la imagen del gato 1 por el gato 2
    public void cambiarImagen(View view){
        ImageView gatos = findViewById(R.id.imageView);
        // gatos.setImageResource(R.drawable.cat2);
        // gatos.setTag("gato1");

        // Drawable imagenGato1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat1);
        Drawable imagenGato2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat2);

        gatos.setImageDrawable(imagenGato2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}