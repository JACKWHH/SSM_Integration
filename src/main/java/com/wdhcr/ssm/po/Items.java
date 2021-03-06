package com.wdhcr.ssm.po;

public class Items {
    private int id;
    private String name;
    private double price;
    private String detail;

    public Items() {
    }

    public Items(int id, String name, double price, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                '}';
    }
}
