package com.gowri_manikandan.Z_Kart.features.customer.manage;

import java.util.Scanner;

public class CustomerManageView {
    private final CustomerManageModel model;
    CustomerManageView(){
        model = new CustomerManageModel(this);
    }
    private final Scanner scanner = new Scanner(System.in);
}
