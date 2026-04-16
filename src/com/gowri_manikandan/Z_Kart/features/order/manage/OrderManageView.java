package com.gowri_manikandan.Z_Kart.features.order.manage;

import java.util.Scanner;

public class OrderManageView {
    private final OrderManageModel model;
    OrderManageView(){
        model = new OrderManageModel(this);
    }
    private final Scanner scanner = new Scanner(System.in);
}
