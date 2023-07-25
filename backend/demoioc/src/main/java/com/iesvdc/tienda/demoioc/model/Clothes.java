package com.iesvdc.tienda.demoioc.model;

public class Clothes {
    private SizeType sizeType;
    private String description;
    private CategoryType categoryType;
    private String image;
    private double price;
    private ColorType colorType;
    private int stock;


    public Clothes() {
    }

    public Clothes(SizeType sizeType, String description, CategoryType categoryType, String image, double price, ColorType colorType, int stock) {
        this.sizeType = sizeType;
        this.description = description;
        this.categoryType = categoryType;
        this.image = image;
        this.price = price;
        this.colorType = colorType;
        this.stock = stock;
    }

    public SizeType getSizeType() {
        return this.sizeType;
    }

    public void setSizeType(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryType getCategoryType() {
        return this.categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ColorType getColorType() {
        return this.colorType;
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Clothes sizeType(SizeType sizeType) {
        setSizeType(sizeType);
        return this;
    }

    public Clothes description(String description) {
        setDescription(description);
        return this;
    }

    public Clothes categoryType(CategoryType categoryType) {
        setCategoryType(categoryType);
        return this;
    }

    public Clothes image(String image) {
        setImage(image);
        return this;
    }

    public Clothes price(double price) {
        setPrice(price);
        return this;
    }

    public Clothes colorType(ColorType colorType) {
        setColorType(colorType);
        return this;
    }

    public Clothes stock(int stock) {
        setStock(stock);
        return this;
    }

    @Override
public String toString() {
    return "{" +
        " sizeType='" + getSizeType() + "'" +
        ", description='" + getDescription() + "'" +
        ", categoryType='" + getCategoryType() + "'" +
        ", image='" + getImage() + "'" +
        ", price='" + getPrice() + "€'" +
        ", colorType='" + getColorType() + "'" +
        ", stock='" + getStock() + "'" +
        "}";
}

    
}
