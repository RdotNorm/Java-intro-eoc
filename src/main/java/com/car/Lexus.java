package com.car;

public class Lexus extends Car{
    private boolean hasLeatherSeats;
    public Lexus(String color, int year, int maxSpeed, boolean hasLeatherSeats){
        super(color,year,maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }
   public void sethasLeatherSeats(boolean hasLeatherSeats){
    this.hasLeatherSeats = hasLeatherSeats;
    }
       public boolean gethasLeatherSeats(){
            return this.hasLeatherSeats;
        }


   }
 
