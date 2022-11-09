package com.example.test_duan.Class;

public class DucSenSei {

    private int id;
    private String Lop;

    public DucSenSei(int id, String lop) {
        this.id = id;
        Lop = lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }
}

