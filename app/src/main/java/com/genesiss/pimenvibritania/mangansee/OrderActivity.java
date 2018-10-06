package com.genesiss.pimenvibritania.mangansee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderActivity extends AppCompatActivity {

    @BindView(R.id.Jumlah)
    TextView jml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ButterKnife.bind(this);

        jml.setText("Rp."+getIntent().getStringExtra("totalHarga"));

    }
    @OnClick(R.id.btnSelesai)
    public void btnSelesai(){
        Intent i = new Intent(getApplicationContext(), ThanksActivity.class);
        startActivity(i);
    }
}
