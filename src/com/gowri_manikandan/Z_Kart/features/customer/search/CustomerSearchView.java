package com.gowri_manikandan.Z_Kart.features.customer.search;

import java.util.Scanner;

public class CustomerSearchView {
    private final CustomerSearchModel model;
    CustomerSearchView(){
        model = new CustomerSearchModel(this);
    }
    private final Scanner scanner = new Scanner(System.in);
}
