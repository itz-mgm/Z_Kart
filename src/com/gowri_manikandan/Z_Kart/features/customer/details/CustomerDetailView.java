package com.gowri_manikandan.Z_Kart.features.customer.details;

import java.util.Scanner;

public class CustomerDetailView {
    private final CustomerDetailModel model;
    private final Scanner scanner = new Scanner(System.in);
    CustomerDetailView(){
        model = new CustomerDetailModel(this);
    }
}
