package com.genesiss.pimenvibritania.mangansee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.jmlGeprek)
    TextView AyamGeprek;
    @BindView(R.id.jmlBakar)
    TextView AyamBakar;
    @BindView(R.id.jmlGoreng)
    TextView AyamGoreng;
    @BindView(R.id.jmlAir)
    TextView Air;
    @BindView(R.id.jmlTeh)
    TextView Teh;
    @BindView(R.id.jmlKopi)
    TextView Kopi;
    @BindView(R.id.TxtTotalHarga)
    TextView TxtTotalHarga;
    int JumlahGeprek, JumlahBakar, JumlahGoreng, JumlahAir, JumlahTeh, JumlahKopi,totalHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        totalHarga = 0;
        JumlahGeprek = 0;
        JumlahBakar = 0;
        JumlahGoreng = 0;
        JumlahAir = 0;
        JumlahTeh = 0;
        JumlahKopi = 0;

    }

    private int totalHarga(int harga){
        totalHarga = totalHarga+harga;
        return totalHarga;
    }

    private void setTextTotalHarga(int harga){
        TxtTotalHarga.setText(""+harga);
    }

    @OnClick(R.id.plusGeprek)
    public void plusGeprek(){
        int harga = 25000;
        JumlahGeprek +=1;
        AyamGeprek.setText(""+JumlahGeprek);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusBakar)
    public void plusBakar(){
        int harga = 20000;
        JumlahBakar +=1;
        AyamBakar.setText(""+JumlahBakar);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusGoreng)
    public void plusGoreng(){
        int harga = 15000;
        JumlahGoreng +=1;
        AyamGoreng.setText(""+JumlahGoreng);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusAir)
    public void plusAir(){
        int harga = 3000;
        JumlahAir +=1;
        Air.setText(""+JumlahAir);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusTeh)
    public void plusTeh(){
        int harga = 5000;
        JumlahTeh +=1;
        Teh.setText(""+JumlahTeh);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusKopi)
    public void plusKopi(){
        int harga = 7000;
        JumlahKopi +=1;
        Kopi.setText(""+JumlahKopi);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.minGeprek)
    public void minGeprek(){
        if(Integer.valueOf(AyamGeprek.getText().toString()) > 0){
            int harga = -25000;
            JumlahGeprek -=1;
            AyamGeprek.setText(""+JumlahGeprek);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minBakar)
    public void minBakar(){
        if(Integer.valueOf(AyamBakar.getText().toString()) > 0){
            int harga = -20000;
            JumlahBakar -=1;
            AyamBakar.setText(""+JumlahBakar);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minGoreng)
    public void minGoreng(){
        if(Integer.valueOf(AyamGoreng.getText().toString()) > 0){
            int harga = -15000;
            JumlahGoreng -= 1;
            AyamGoreng.setText(""+JumlahGoreng);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minAir)
    public void minAir(){
        if(Integer.valueOf(Air.getText().toString()) > 0){
            int harga = -3000;
            JumlahAir -=1;
            Air.setText(""+JumlahAir);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minTeh)
    public void minTeh(){
        if(Integer.valueOf(Teh.getText().toString()) > 0){
            int harga = -5000;
            JumlahTeh -= 1;
            Teh.setText(""+JumlahTeh);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minKopi)
    public void minKopi(){
        if(Integer.valueOf(Kopi.getText().toString()) > 0){
            int harga = -7000;
            JumlahKopi -= 1;
            Kopi.setText(""+JumlahKopi);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.btnPesan)
    public void btnPesan(){


        Intent i = new Intent(getApplicationContext(), OrderActivity.class);
        i.putExtra("totalHarga", TxtTotalHarga.getText().toString());
        startActivity(i);
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
