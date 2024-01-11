package com.example.Wendys.Model;

public class ComboItem {


    private int comboId;

    private String comboName;

    private double comboPrice;

    private String description;

    public ComboItem(){

    }

    public ComboItem(int comboId, String comboName, double comboPrice, String description) {
        this.comboId = comboId;
        this.comboName = comboName;
        this.comboPrice = comboPrice;
        this.description = description;
    }

    public int getComboId() {
        return comboId;
    }

    public void setComboId(int comboId) {
        this.comboId = comboId;
    }

    public String getComboName() {
        return comboName;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    public double getComboPrice() {
        return comboPrice;
    }

    public void setComboPrice(double comboPrice) {
        this.comboPrice = comboPrice;
    }

    public String getDescription(String description) {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
