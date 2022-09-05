package com.example.eyadprox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_details);
        TextView ProductName2 = findViewById(R.id.ProductName2);
        TextView ProductRam = findViewById(R.id.ProductRam);
        TextView ProductRom = findViewById(R.id.ProductRom);
        TextView ProductCamRes= findViewById(R.id.ProductCamRes);
        TextView ProductScreenSize = findViewById(R.id.ProductScreenSize);
        TextView ProductSoft = findViewById(R.id.ProductSoft);
        TextView ProductBrand = findViewById(R.id.ProductBrand);
        TextView ProductScRes = findViewById(R.id.ProductscRes);
        ImageView ProductImage = findViewById(R.id.ProductImage2);
        TextView Price = findViewById(R.id.ProductPrice2);
        ImageView location =findViewById(R.id.imageView2);

        Bundle bundle = getIntent().getExtras();
        Products products2 = (Products) bundle.getSerializable("product");
        ProductName2.setText(products2.getProductName());
        ProductBrand.setText(products2.getProductBrand());
        Price.setText(products2.getProductPrice());
        ProductCamRes.setText(products2.getProductCamRes());
        ProductScRes.setText(products2.getPoductScreenRes());
        ProductScreenSize.setText(products2.getProductScreenSize());
        ProductSoft.setText(products2.getProductSoft());
        ProductRam.setText(products2.getProductRAM());
        ProductRom.setText(products2.getProductROM());
        ProductImage.setImageResource(products2.getProductImage());


        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent location = new Intent(Intent.ACTION_VIEW);
                location.setData(Uri.parse("geo:7V5V+FR Sabah Al Nasser, Kuwait"));
                Intent chooser = Intent.createChooser(location,"Launch Maps");
                startActivity(chooser);
            }
        });
    }
}

