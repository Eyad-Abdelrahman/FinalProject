package com.example.eyadprox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<Products> product = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        Bundle bundlelogo = getIntent().getExtras();


                Products iPhone = new Products("iPhone 13", "240 KD", "6.1 inch", "4 GB", "128 GB", "IOS", "Apple", "4k", "2543x1170-pixel", R.drawable.img);
                Products MacBook = new Products("MacBook Air M1", "360 KD", "13.3 inch", "8 GB", "256 GB", "MacOS", "Apple", "720p", "2560x1600-pixel", R.drawable.img_1);
                Products iPad = new Products("iPad Air M1", "213 KD", "10.9 inch", "6 GB", "64 GB", "iPadOS", "Apple", "4k", "2360x1640-pixel", R.drawable.img_2);
                Products P50 = new Products("P50 Pro", "320 KD", "6.6 inch", "8 GB", "256 GB", "HarmonyOS", "Huawei", "4K", "1228x2700-pixel", R.drawable.img_3);
                Products D15 = new Products("Matebook D15", "140 KD", "15.6 inch", "8 GB", "256 GB", "Windows", "Huawei", "720p", "1920x1080-pixel", R.drawable.img_4);
                product.add(iPhone);
                product.add(MacBook);
                product.add(iPad);
                product.add(P50);
                product.add(D15);

                ListView listView = findViewById(R.id.listVIEW);

                ProductAdapter productAdapter = new ProductAdapter(this, 0, product);
                listView.setAdapter(productAdapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                        Products currentProduct = product.get(position);

                        Intent intent = new Intent(MainActivity2.this, Details_Activity.class);
                        intent.putExtra("product", currentProduct);


                        startActivity(intent);


                    }
                });


            }
        }
