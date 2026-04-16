package com.gowri_manikandan.Z_Kart.features.product;

import java.util.Scanner;

public class ProductView {
    private final ProductModel model;
    ProductView(){
        model = new ProductModel(this);
    }
    private final Scanner scanner = new Scanner(System.in);
}
