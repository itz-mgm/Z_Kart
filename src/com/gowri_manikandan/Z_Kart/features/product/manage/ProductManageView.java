package com.gowri_manikandan.Z_Kart.features.product.manage;

import java.util.Scanner;

public class ProductManageView {
    private final ProductManageModel model;
    ProductManageView(){
        model = new ProductManageModel(this);
    }
    private final Scanner scanner = new Scanner(System.in);

}
