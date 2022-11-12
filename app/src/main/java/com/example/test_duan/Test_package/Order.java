package com.example.test_duan.Test_package;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity
public class Order {

    @PrimaryKey
    String name;

    int Total_Price;
    int number;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public int getTotal_Price() {
        return Total_Price;
    }

    public void setTotal_Price(int total_Price) {
        Total_Price = total_Price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name : "+getName()+"\n"
                +"Count : "+getNumber()+"\n"
                +"Total price : "+getTotal_Price();
    }
}
