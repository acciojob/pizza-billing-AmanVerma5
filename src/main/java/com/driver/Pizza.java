package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    boolean isToppingAdded;
    boolean isTakeawayAdded;
    boolean isCheeseAdded;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=10;
        }else{
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill="Base price of pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isCheeseAdded){
            this.isCheeseAdded=true;
            this.price+=this.cheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isToppingAdded){
            this.isToppingAdded=true;
            this.price+=this.cheese;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeawayAdded){
            this.isTakeawayAdded=true;
            this.price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if(this.isCheeseAdded){
            this.bill+="Extra Cheese Added: "+this.cheese+"\n";
        }
        if(this.isToppingAdded){
            this.bill+="Extra Toppings Added: "+this.toppings+"\n";
        }
        if(this.isTakeawayAdded){
            this.bill+="Paperbag Added: 20"+"\n";
        }
        this.bill+="Total price: "+this.price+"\n";

        return this.bill;
    }
}
