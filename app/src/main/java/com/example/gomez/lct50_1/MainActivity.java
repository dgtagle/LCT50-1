package com.example.gomez.lct50_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int metroslado = 0;
    int metrosancho = 0;
    int metrosalto = 0;
    int gramos = 0;
    double cs = 0.71;
    double cn = 0.4;
    int minutos = 0;

    public void maslado(View view) {
        metroslado = metroslado + 1;
        displaylado(metroslado);
    }
    public void menoslado(View view) {
        metroslado = metroslado - 1;
        displaylado(metroslado);
    }

    private void displaylado(int totallado) {
        TextView ladoTextView = (TextView) findViewById(R.id.ladoMetros);
        ladoTextView.setText("" + totallado + " metros");
    }

    public void masancho(View view) {
        metrosancho = metrosancho + 1;
        displayancho(metrosancho);
    }

    public void menosancho(View view) {
        metrosancho = metrosancho - 1;
        displayancho(metrosancho);
    }

    private void displayancho(int totalancho) {
        TextView anchoTextView = (TextView) findViewById(R.id.anchoMetros);
        anchoTextView.setText("" + totalancho + " metros");
    }

    public void masalto(View view) {
        metrosalto = metrosalto + 1;
        displayalto(metrosalto);
    }

    public void  menosalto(View view) {
        metrosalto = metrosalto - 1;
        displayalto(metrosalto);
    }

    private void displayalto(int totalalto) {
        TextView altoTextView = (TextView) findViewById(R.id.altoMetros);
        altoTextView.setText("" + totalalto + " metros");
    }

    public void mascontenido(View view) {
        gramos = gramos + 1;
        displaygramos(gramos);
    }

    public void menoscontenido(View view) {
        gramos = gramos - 1;
        displaygramos(gramos);
    }

    private void displaygramos(int totalgramos) {
        TextView gramosTextView = (TextView) findViewById(R.id.contenidogramos);
        gramosTextView.setText("" + totalgramos + " gramos");
    }

    public void  calcularcs(View view) {
        double area = (metrosalto * metroslado * metrosancho);
        double carga = (area / gramos);
        double lct = (carga * cs);
        displayminutos(lct);
    }

    public void  calcularcn(View view) {
        double area = (metrosalto * metroslado * metrosancho);
        double carga = (area / gramos);
        double lct = (carga * cn);
        displayminutos(lct);
    }

    private void displayminutos(double minutosDDHH) {
        TextView minutosTextView = (TextView) findViewById(R.id.totalminutos);
        minutosTextView.setText("" + String.format("%.2f", minutosDDHH) + " minutos");
    }

}
