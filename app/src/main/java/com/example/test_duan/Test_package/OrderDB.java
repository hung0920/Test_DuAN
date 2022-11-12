package com.example.test_duan.Test_package;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Order.class},version = 1)
public abstract class OrderDB extends RoomDatabase {
    public abstract OrderDAO getDAO();
}
