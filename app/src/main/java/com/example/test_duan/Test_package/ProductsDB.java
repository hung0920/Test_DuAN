package com.example.test_duan.Test_package;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Products.class},version = 1)
public abstract class ProductsDB extends RoomDatabase {
    public abstract ProductsDAO getDAO();
}
