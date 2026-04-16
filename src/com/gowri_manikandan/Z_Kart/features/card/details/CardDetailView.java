package com.gowri_manikandan.Z_Kart.features.card.details;

import java.util.Scanner;

public class CardDetailView {
    private final CardDetailModel model;
    private final Scanner scanner = new Scanner(System.in);
    CardDetailView(){
        model = new CardDetailModel(this);
    }
}
