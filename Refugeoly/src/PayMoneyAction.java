/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author perim
 */
public abstract class PayMoneyAction extends Action {
    
    private int fee;
    private boolean mafia;
    
    public PayMoneyAction(int fee,boolean mafia)
    {
        this.fee = fee;
        this.mafia = mafia;
        
    }
    
    public void payMoney(RecieverEntity reciever,Refugee refugee)
    {
        refugee.giveMoney(mafia, fee, reciever);
    }
    
}
