package com.example.test_duan.Test_package;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ProductsDAO {

    @Insert
    void Insert(Products products);

    @Update
    void Update(Products products);

    @Query("select * from Products")
    List<Products> getList();

    @Query("select * from Products where name = :fname")
    Products findName(String fname);

}
