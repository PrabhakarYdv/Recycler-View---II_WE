package com.prabhakar.recyclerview_ii_we;

public class StudentModel {
    private int img;
    private String name;
    private String id;
    private String dob;
    private String address;

    public StudentModel(int img, String name, String id, String dob, String address) {
        this.img = img;
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.address = address;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }
}
