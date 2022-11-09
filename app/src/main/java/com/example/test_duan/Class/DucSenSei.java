package com.example.test_duan.Class;

public class DucSenSei {

    private int id;
    private String Lop;
    private String name;
    public DucSenSei(int id, String lop) {
        this.id = id;
        Lop = lop;
    }

    public DucSenSei(int id, String lop, String name) {
        this.id = id;
        Lop = lop;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // DucSenSei com men cho LeeHung

    public DucSenSei() {
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

