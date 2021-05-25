package com.example.qrcode_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class CreateQR extends AppCompatActivity {
    private ImageView ivQrCode;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_qr);

        ivQrCode = (ImageView)findViewById(R.id.iv_qr_code);
        text = "https://www.naver.com";

        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

        try{
            BitMatrix bitMatrix = multiFormatWriter.encode(text, BarcodeFormat.QR_CODE, 200, 200);
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder(); // QR 코드 생성
            Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix); // 비트맵에 적용
            ivQrCode.setImageBitmap(bitmap);
            
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
}