package com.certaintyfactor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Diagnosa extends AppCompatActivity {

    Button Proses;
    TextView txtHasil;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11;
    AutoCompleteTextView txt1, txt2, txt3, txt4, txt5, txt6, txt7,
            txt8, txt9, txt10, txt11;

    String[] nilai = { "0", "0.2", "0.4", "0.6", "0.8", "1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        Proses = (Button)findViewById(R.id.btnProses);
        txtHasil = (TextView)findViewById(R.id.txHasil);
        cb1 = (CheckBox)findViewById(R.id.chk1); cb2 = (CheckBox)findViewById(R.id.chk2);
        cb3 = (CheckBox)findViewById(R.id.chk3); cb4 = (CheckBox)findViewById(R.id.chk4);
        cb5 = (CheckBox)findViewById(R.id.chk5); cb6 = (CheckBox)findViewById(R.id.chk6);
        cb7 = (CheckBox)findViewById(R.id.chk7); cb8 = (CheckBox)findViewById(R.id.chk8);
        cb9 = (CheckBox)findViewById(R.id.chk9); cb10 = (CheckBox)findViewById(R.id.chk10);
        cb11 = (CheckBox)findViewById(R.id.chk11);

        txt1 = (AutoCompleteTextView)findViewById(R.id.tx1);
        txt2 = (AutoCompleteTextView)findViewById(R.id.tx2);
        txt3 = (AutoCompleteTextView)findViewById(R.id.tx3);
        txt4 = (AutoCompleteTextView)findViewById(R.id.tx4);
        txt5 = (AutoCompleteTextView)findViewById(R.id.tx5);
        txt6 = (AutoCompleteTextView)findViewById(R.id.tx6);
        txt7 = (AutoCompleteTextView)findViewById(R.id.tx7);
        txt8 = (AutoCompleteTextView)findViewById(R.id.tx8);
        txt9 = (AutoCompleteTextView)findViewById(R.id.tx9);
        txt10 = (AutoCompleteTextView)findViewById(R.id.tx10);
        txt11 = (AutoCompleteTextView)findViewById(R.id.tx11);

        final ArrayAdapter<String> adapterNilai = new ArrayAdapter<>
                (this,android.R.layout.select_dialog_item, nilai);
        txt1.setThreshold(1); txt1.setAdapter(adapterNilai);
        txt2.setThreshold(1); txt2.setAdapter(adapterNilai);
        txt3.setThreshold(1); txt3.setAdapter(adapterNilai);
        txt4.setThreshold(1); txt4.setAdapter(adapterNilai);
        txt5.setThreshold(1); txt5.setAdapter(adapterNilai);
        txt6.setThreshold(1); txt6.setAdapter(adapterNilai);
        txt7.setThreshold(1); txt7.setAdapter(adapterNilai);
        txt8.setThreshold(1); txt8.setAdapter(adapterNilai);
        txt9.setThreshold(1); txt9.setAdapter(adapterNilai);
        txt10.setThreshold(1); txt10.setAdapter(adapterNilai);
        txt11.setThreshold(1); txt11.setAdapter(adapterNilai);

        txt1.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt1.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt2.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt2.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt3.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt3.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt4.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt4.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt5.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt5.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt6.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt6.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt7.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt7.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt8.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt8.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt9.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt9.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt10.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt10.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt11.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt11.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );

        Proses.setOnClickListener(v -> {
            String penyakit = "Anda menderita penyakit : ";
            String persentase = "Persentase kepercayaan : ";

            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb8.isChecked()&& cb9.isChecked() ){

                double nilaig1 = 0.3;
                double nilaig2 = 0.4;
                double nilaig3 = 0.5;
                double nilaig4 = 0.5;
                double nilaig5 = 0.3;
                double nilaig6 = 0.5;
                double nilaig7 = 0.3;
                double nilaig8 = 0.3;
                double nilaig9 = 0.5;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);

                String hasilhitungA = String.valueOf((cfold_cf9 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb8.isChecked()&& cb10.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 0.4;
                double nilaig3 = 0.5;
                double nilaig4 = 0.6;
                double nilaig5 = 0.5;
                double nilaig6 = 0.5;
                double nilaig7 = 0.5;
                double nilaig8 = 0.3;
                double nilaig10 = 0.8;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg10 = nilaig10 * dblgejala10;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf8 + hasilg10 * (1 - cfold_cf8);

                String hasilhitungB = String.valueOf((cfold_cf10 * 100));

                penyakit += "\nPenyakit Postpartum Major Depression ( Sedang )";
                persentase += "\n"+hasilhitungB;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb8.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf11 = cfold_cf8 + hasilg11 * (1 - cfold_cf8);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked()  && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb8.isChecked()&& cb9.isChecked() && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 1;
                double nilaig10 = 0.6;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt3.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf4 = hasilg1 + hasilg4 * (1 - hasilg1);
                double cfold_cf5 = cf1_cf4 + hasilg5 * (1 - cf1_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb9.isChecked()&& cb10.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig7 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf9 = cfold_cf7 + hasilg9 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf10 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb8.isChecked()&& cb10.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig10 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg10 = nilaig10 * dblgejala10;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf8 + hasilg10 * (1 - cfold_cf8);

                String hasilhitungA = String.valueOf((cfold_cf10 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb9.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig7 = 0.4;
                double nilaig9 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf9 = cfold_cf7 + hasilg9 * (1 - cfold_cf7);
                double cfold_cf11 = cfold_cf9 + hasilg11 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig7 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf10 = cfold_cf7 + hasilg10 * (1 - cfold_cf7);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb8.isChecked()
                    && cb9.isChecked()&& cb10.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf8 = cfold_cf6 + hasilg8 * (1 - cfold_cf6);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf10 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb8.isChecked()
                    && cb9.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf8 = cfold_cf6 + hasilg8 * (1 - cfold_cf6);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf11 = cfold_cf9 + hasilg11 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb8.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig8 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf8 = cfold_cf6 + hasilg8 * (1 - cfold_cf6);
                double cfold_cf10 = cfold_cf8 + hasilg10 * (1 - cfold_cf8);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb9.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf9 = cfold_cf6 + hasilg9 * (1 - cfold_cf6);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb7.isChecked() && cb8.isChecked()
                    && cb9.isChecked()&& cb10.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf5 + hasilg7 * (1 - cfold_cf5);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf10 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb7.isChecked() && cb8.isChecked()
                    && cb9.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf5 + hasilg7 * (1 - cfold_cf5);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf11 = cfold_cf9 + hasilg11 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb7.isChecked() && cb8.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.8;
                double nilaig2 = 0.8;
                double nilaig3 = 0.8;
                double nilaig4 = 0.5;
                double nilaig5 = 0.6;
                double nilaig7 = 0.5;
                double nilaig8 = 0.5;
                double nilaig10 = 1;
                double nilaig11 = 1;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf5 + hasilg7 * (1 - cfold_cf5);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf8 + hasilg10 * (1 - cfold_cf8);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungC = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Postpartum Psychosis Depression ( Berat )";
                persentase += "\n"+hasilhitungC;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb8.isChecked() && cb9.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf8 = cfold_cf5 + hasilg8 * (1 - cfold_cf5);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb7.isChecked() && cb9.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 0.4;
                double nilaig3 = 0.5;
                double nilaig4 = 0.6;
                double nilaig5 = 0.5;
                double nilaig7 = 0.5;
                double nilaig9 = 0.3;
                double nilaig10 = 0.8;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf5 + hasilg7 * (1 - cfold_cf5);
                double cfold_cf9 = cfold_cf7 + hasilg9 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb6.isChecked() && cb7.isChecked() && cb8.isChecked()
                    && cb9.isChecked()&& cb10.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf6 = cfold_cf4 + hasilg6 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf10 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb6.isChecked() && cb7.isChecked() && cb8.isChecked()
                    && cb9.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf6 = cfold_cf4 + hasilg6 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf11 = cfold_cf9 + hasilg11 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb6.isChecked() && cb7.isChecked() && cb8.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf6 = cfold_cf4 + hasilg6 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf8 + hasilg10 * (1 - cfold_cf8);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb6.isChecked() && cb7.isChecked() && cb9.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf6 = cfold_cf4 + hasilg6 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf9 = cfold_cf7 + hasilg9 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb6.isChecked() && cb8.isChecked() && cb9.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig6 = 0.8;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf6 = cfold_cf4 + hasilg6 * (1 - cfold_cf4);
                double cfold_cf8 = cfold_cf6 + hasilg8 * (1 - cfold_cf6);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb6.isChecked() && cb8.isChecked() && cb9.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig6 = 0.8;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf2 = hasilg1 + hasilg2 * (1 - hasilg1);
                double cfold_cf3 = cf1_cf2 + hasilg3 * (1 - cf1_cf2);
                double cfold_cf4 = cfold_cf3 + hasilg4 * (1 - cfold_cf3);
                double cfold_cf6 = cfold_cf4 + hasilg6 * (1 - cfold_cf4);
                double cfold_cf8 = cfold_cf6 + hasilg8 * (1 - cfold_cf6);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb2.isChecked() && cb3.isChecked() && cb4.isChecked()
                    && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()
                    && cb8.isChecked()&& cb9.isChecked()&& cb10.isChecked() ) {

                double nilaig2 = 1;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;


                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());

                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;

                double cf1_cf3 = hasilg2 + hasilg3 * (1 - hasilg2);
                double cfold_cf4 = cf1_cf3 + hasilg4 * (1 - cf1_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);

                String hasilhitungA = String.valueOf((cfold_cf10 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n" + hasilhitungA;
            }
            if (cb2.isChecked() && cb4.isChecked() && cb5.isChecked()
                    && cb6.isChecked() && cb7.isChecked() && cb8.isChecked()&& cb9.isChecked()&&
                    cb10.isChecked()  && cb11.isChecked()) {

                double nilaig2 = 1;
                double nilaig4 = 0.2;
                double nilaig5 = 0.8;
                double nilaig6 = 0.4;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.6;


                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf4 = hasilg2 + hasilg4 * (1 - hasilg2);
                double cfold_cf5 = cf1_cf4 + hasilg5 * (1 - cf1_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf9 + hasilg10 * (1 - cfold_cf9);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n" + hasilhitungA;
            }
            if (cb1.isChecked() && cb3.isChecked() && cb4.isChecked() && cb5.isChecked()
                    && cb6.isChecked() && cb7.isChecked() && cb8.isChecked()
                    && cb10.isChecked()&& cb11.isChecked() ){

                double nilaig1 = 0.4;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 1;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig10 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf3 = hasilg1 + hasilg3 * (1 - hasilg1);
                double cfold_cf4 = cf1_cf3 + hasilg4 * (1 - cf1_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf8 + hasilg10 * (1 - cfold_cf8);
                double cfold_cf11 = cfold_cf10 + hasilg11 * (1 - cfold_cf10);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb3.isChecked() && cb4.isChecked() && cb5.isChecked()
                    && cb6.isChecked() && cb7.isChecked() && cb8.isChecked() &&
                    cb9.isChecked()&& cb10.isChecked()){

                double nilaig1 = 0.4;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 1;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig10 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg10 = nilaig10 * dblgejala10;

                double cf1_cf3 = hasilg1 + hasilg3 * (1 - hasilg1);
                double cfold_cf4 = cf1_cf3 + hasilg4 * (1 - cf1_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf10 = cfold_cf8 + hasilg10 * (1 - cfold_cf8);

                String hasilhitungA = String.valueOf((cfold_cf10 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            if (cb1.isChecked() && cb3.isChecked() && cb4.isChecked() && cb5.isChecked()
                    && cb6.isChecked() && cb7.isChecked() && cb8.isChecked() &&
                    cb9.isChecked()&& cb11.isChecked()){

                double nilaig1 = 0.4;
                double nilaig3 = 0.6;
                double nilaig4 = 0.2;
                double nilaig5 = 1;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig9 = 0.4;
                double nilaig11 = 0.4;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg11 = nilaig11 * dblgejala11;

                double cf1_cf3 = hasilg1 + hasilg3 * (1 - hasilg1);
                double cfold_cf4 = cf1_cf3 + hasilg4 * (1 - cf1_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf9 = cfold_cf8 + hasilg9 * (1 - cfold_cf8);
                double cfold_cf11 = cfold_cf8 + hasilg11 * (1 - cfold_cf8);

                String hasilhitungA = String.valueOf((cfold_cf11 * 100));

                penyakit += "\nPenyakit depresi Baby Blues Syndrome (Ringan)";
                persentase += "\n"+hasilhitungA;
            }
            txtHasil.setText(""+penyakit+"\n"+persentase+" %\n\n");
        });

    }
}