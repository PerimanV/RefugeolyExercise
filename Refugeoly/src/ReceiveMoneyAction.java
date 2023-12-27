/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public abstract class ReceiveMoneyAction extends Action {
    
    private int fee;
    private boolean mafia;
    
    public ReceiveMoneyAction(int fee,boolean mafia)
    {
        this.fee = fee;
        this.mafia = mafia;
        
    }
    
    void receiveMoney(Refugee refugee)
    {
        refugee.receiveMoney(fee);
    }
    
}
