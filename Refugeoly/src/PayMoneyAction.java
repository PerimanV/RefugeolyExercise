/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class PayMoneyAction extends Action {
    
    private int fee;
    private boolean mafia;
    private ReceiverEntity receiver;
    
    public PayMoneyAction(int fee,boolean mafia,ReceiverEntity receiver)
    {
        this.fee = fee;
        this.mafia = mafia;
        this.receiver = receiver;
        
    }
    
    @Override
    public void act(Refugee refugee)
    {
        refugee.giveMoney(mafia, fee, receiver);
    }
    
}
