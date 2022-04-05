package com.example.eyadprox;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

class ProductAdapter extends ArrayAdapter<Products> implements Serializable {

    List<Products> products;

    final AlertDialog.Builder alert = new AlertDialog.Builder(getContext());

    public ProductAdapter(@NonNull Context context, int resource, @NonNull List<Products> objects) {
        super(context, resource, objects);
        this.products = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Products currentItem = products.get(position);

        TextView ProductNameTextView = view.findViewById(R.id.textView4);
        ProductNameTextView.setText(currentItem.getProductName());


        ImageView ProductImageTextView = view.findViewById(R.id.ProductImage);
        ProductImageTextView.setImageResource(currentItem.getProductImage());


        TextView Productprice = view.findViewById(R.id.ProductPrice);
        Productprice.setText(currentItem.getProductPrice() + "");



        return view;
    }
}
