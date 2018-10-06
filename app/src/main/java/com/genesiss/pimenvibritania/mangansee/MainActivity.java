package com.genesiss.pimenvibritania.mangansee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKontak = findViewById(R.id.btnKontak);
        btnKontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String phoneNumber = String.format("tel: %s", "085723660012");
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse(phoneNumber));
            startActivity(dialIntent);
            }
        });

        Button btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(m);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.example_menu,menu);
        return true;
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        switch (id){

            case R.id.option1:
                Intent h = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(h);
                break;
            case R.id.option2:
                Intent m = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(m);
                break;

            case R.id.option3:
                String phoneNumber = String.format("tel: %s", "085723660012");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse(phoneNumber));
                startActivity(dialIntent);
                break;
            case R.id.option4:
                finish();
                moveTaskToBack(true);
                break;
        }

        return  true;

    }
}
