package refugeoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ReceiveMoneyAction extends Action {
    
    private int income;
    private GiverEntity giver;
    
    public ReceiveMoneyAction(int income,GiverEntity giver)
    {
        this.income = income;
        this.giver = giver;
    }
    
    public void act(Refugee refugee)
    {
        refugee.receiveMoney(income);
        
        giver.giveMoney(income, refugee);
        
    }
    
}
