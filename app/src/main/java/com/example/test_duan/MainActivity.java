package com.example.test_duan;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.test_duan.Test_package.Order;
import com.example.test_duan.Test_package.OrderDAO;
import com.example.test_duan.Test_package.OrderDB;
import com.example.test_duan.Test_package.Products;
import com.example.test_duan.Test_package.ProductsDAO;
import com.example.test_duan.Test_package.ProductsDB;

public class MainActivity extends AppCompatActivity {

    ListView listView,listOrder;
    Button Add, btnOrder,btnUpdate;
    EditText edt_Price;
    ProductsDAO productsDAO;
    ProductsDB productsDB;
    OrderDAO orderDAO;
    OrderDB orderDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productsDB = Room.databaseBuilder(this,ProductsDB.class,"Products.db").allowMainThreadQueries( ).build( );
        orderDB = Room.databaseBuilder(this,OrderDB.class,"Order.db").allowMainThreadQueries( ).build( );
        productsDAO = productsDB.getDAO();
        orderDAO = orderDB.getDAO();

        listView = findViewById(R.id.List_View);
        listOrder = findViewById(R.id.List_Order);
        Add = findViewById(R.id.Add);
        btnOrder = findViewById(R.id.Order);
        edt_Price = findViewById(R.id.edt_Price);
        btnUpdate = findViewById(R.id.Update);

        resetListProducts();
        resetListOrder();

        Add.setOnClickListener(v -> {
            Products products = new Products();
            products.setName("Products "+edt_Price.getText().toString());
            products.setPrice(Integer.parseInt(edt_Price.getText().toString()));
            productsDAO.Insert(products);
            resetListProducts();
        });

        btnUpdate.setOnClickListener(v -> {
            Log.e("ZZZZZZ", "onCreate: "+edt_Price.getText().toString() );
            Products products = productsDAO.findName("Products "+edt_Price.getText().toString());
            products.setPrice(products.getPrice()/2);
            productsDAO.Update(products);
            resetListProducts();
        });

        btnOrder.setOnClickListener(v -> {
            Order order = new Order();
            int product = productsDAO.getList().get(0).getPrice();
            order.setName("Order "+product/2);
            order.setNumber(product/5);
            order.setTotal_Price((product/5)*product);
            orderDAO.Insert(order);
            resetListOrder();
        });

    }

    private void resetListOrder() {
        ArrayAdapter<Order> adapter = new ArrayAdapter<Order>(this, android.R.layout.simple_list_item_1,orderDAO.getList());
        listOrder.setAdapter(adapter);
    }

    private void resetListProducts() {
        ArrayAdapter<Products> adapter = new ArrayAdapter<Products>(this, android.R.layout.simple_list_item_1,productsDAO.getList());
        listView.setAdapter(adapter);
    }
}
