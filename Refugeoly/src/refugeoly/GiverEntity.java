package refugeoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class GiverEntity {
    
    private String name;
    private int money;
    
    public GiverEntity(String name,int money)
    {
        this.name = name;
        this.money = money;
    }
    
    public void giveMoney(int ToGive,Refugee refugee)
    {
        refugee.receiveMoney(ToGive);
    }
    
}
