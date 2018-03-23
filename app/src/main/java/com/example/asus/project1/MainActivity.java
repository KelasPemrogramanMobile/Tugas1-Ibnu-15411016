package com.example.asus.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNama)
    EditText edNama;
    @BindView(R.id.edNpm)
    EditText edNpm;
    @BindView(R.id.edFakultas)
    EditText edFakultas;
    @BindView(R.id.edJurusan)
    EditText edJurusan;
    @BindView(R.id.edCita)
    EditText edCita;


    @BindView(R.id.tvHasilNama)
    TextView tvHasilNama;
    @BindView(R.id.tvHasilNpm)
    TextView tvHasilNpm;
    @BindView(R.id.tvHasilFakultas)
    TextView tvHasilFakultas;
    @BindView(R.id.tvHasilJurusan)
    TextView tvHasilJurusan;
    @BindView(R.id.tvHasilCita)
    TextView tvHasilCita;


    @OnClick(R.id.btnKlik)
    void Klik() {
        String nama = edNama.getText().toString();
        String npm = edNpm.getText().toString();
        String fak = edFakultas.getText().toString();
        String jur = edJurusan.getText().toString();
        String cita = edCita.getText().toString();
        Toast.makeText(getApplicationContext(), nama+" "+npm+" "+fak+" "+jur+" "+cita, Toast.LENGTH_LONG).show();

        tvHasilNama.setText(nama);
        tvHasilNpm.setText(npm);
        tvHasilFakultas.setText(fak);
        tvHasilJurusan.setText(jur);
        tvHasilCita.setText(cita);
    }
}
