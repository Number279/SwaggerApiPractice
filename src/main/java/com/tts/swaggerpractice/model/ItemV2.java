package com.tts.swaggerpractice.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class ItemV2 {
    @ApiModelProperty(notes = "The name of the menu item")
    private String name;
    @ApiModelProperty(notes = "The description of the menu item")
    private String description;
    @ApiModelProperty(notes = "The category of the menu item")
    private String category;
    @ApiModelProperty(notes = "List of the ingredients of the menu item")
    private List<String> ingredients;
    @ApiModelProperty(notes = "Price of the menu item")
    private double price;
    @ApiModelProperty(notes = "Date the item was created")
    private Date createdDate;
    @ApiModelProperty(notes = "Date the item was last updated")
    private Date updatedDate;
    @ApiModelProperty(notes = "Denotes if the item is vegetarian")
    private Boolean isVegetarian;

    public Boolean getVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public ItemV2() {
    }

    public ItemV2(String name, String description, String category, List<String> ingredients, double price, Date createdDate, Date updatedDate, Boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.ingredients = ingredients;
        this.price = price;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.isVegetarian = isVegetarian;
    }
}
