package com.gowri_manikandan.Z_Kart.features.order.search;

import java.util.Scanner;

public class OrderSearchView {
    private final OrderSearchModel model;
    OrderSearchView(){
        model = new OrderSearchModel(this);
    }
    private final Scanner scanner = new Scanner(System.in);
}
