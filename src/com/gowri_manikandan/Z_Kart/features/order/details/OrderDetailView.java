package com.gowri_manikandan.Z_Kart.features.order.details;

import java.util.Scanner;

public class OrderDetailView {
    private final OrderDetailModel model;
    OrderDetailView(){
        model = new OrderDetailModel(this);
    }
    private final Scanner scanner = new Scanner(System.in);
}
