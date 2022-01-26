package com.example.valorantskinandcalculator;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class Bundle {
    private Integer id;
    private String name;
    private Integer price;
    private Integer edition;
    private Drawable image;
    private List<Gun> gunList = new ArrayList<>();

    public Bundle(Integer id, String name, Integer price, Integer edition, Drawable image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.edition = edition;
        this.image = image;
    }

    public void addGun(Gun gun){
        gunList.add(gun);
    }
}
