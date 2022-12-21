/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laptop
 */
class User {
    private int price;
    private String name,date;
    
    public User(String name,int price,String date)
    {      
        this.name = name;
         this.price = price;
        this.date=date;
    }
   
    public String getname()
    {
        return name;
    }
     public int getprice()
    {
        return price;
    }
    public String getdate()
    {
        return date;
    }
    
}
