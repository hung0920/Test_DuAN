package com.example.test_duan.Test_package;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface OrderDAO {

    @Insert
    void Insert(Order order);

    @Query("select * from `Order`")
    List<Order> getList();

}
