package com.prueba.my_navegadorweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


        private EditText et1;
        WebView visor1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.el_buscador);
        visor1=(WebView)findViewById(R.id.visorWeb);
    }

    public void Navegar(View view){
        visor1.setWebViewClient(new WebViewClient());
        //Intent inte = new Intent(this,VisorWeb.class);
        //inte.putExtra("navegadoor", et1.getText().toString());
        String busqueda = "http://"+et1.getText().toString();
        visor1.loadUrl(busqueda);
        //startActivity(inte);

    }
}