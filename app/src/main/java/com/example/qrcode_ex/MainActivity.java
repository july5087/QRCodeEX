package com.example.qrcode_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.zxing.integration.android.IntentIntegrator;

public class MainActivity extends AppCompatActivity {
    private Button btCreateQR;
    private Button btScanQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCreateQR = (Button) findViewById(R.id.bt_create_qr);
        btScanQR = (Button) findViewById(R.id.bt_scan_qr);

        btCreateQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateQR.class);
                startActivity(intent);
            }
        });

        btScanQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanQR.class);
                startActivity(intent);
            }
        });
    }
}