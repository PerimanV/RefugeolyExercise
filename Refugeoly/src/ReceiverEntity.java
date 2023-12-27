/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ReceiverEntity {
    
    private String name;
    private int money;
    
    public ReceiverEntity(String name,int money)
    {
        this.name = name;
        this.money = money;
    }
    
    public void receiveMoney(int ToRecieve)
    {
        money = ToRecieve + money;
    }
    
}
