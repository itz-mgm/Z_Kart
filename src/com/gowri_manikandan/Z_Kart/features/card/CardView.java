package com.gowri_manikandan.Z_Kart.features.card;

import java.util.Scanner;

public class CardView {
    private final CardModel model;
    private final Scanner scanner = new Scanner(System.in);
    CardView(){
        model = new CardModel(this);
    }
}
