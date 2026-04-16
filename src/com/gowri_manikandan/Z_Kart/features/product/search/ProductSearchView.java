package com.gowri_manikandan.Z_Kart.features.product.search;

import java.util.Scanner;

public class ProductSearchView {
    private final ProductSearchModel model;
    ProductSearchView(){
        model = new ProductSearchModel(this);
    }
    private final Scanner scanner = new Scanner(System.in);
}
