/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Refugee {
    private String name;
    private int money,expenses,SkipTurns = 0;
    private Table board;
    private Square square;
    
    
    public Refugee(String name,int money,Table board,Square square,int expenses)
            {
                this.name = name;
                this.money = money;
                this.board = board;
                this.square = square;
            }
    
    public void setSquare(Square square)
    {
        this.square = square;
    }
    
    public void receiveMoney(int ToReceive)
    {
        this.money = this.money + ToReceive;
    }
    
    public void giveMoney(boolean mafia,int money,RecieverEntity reciever)
    {
        if(mafia)
        {
            reciever.receiveMoney(money);
            this.money = this.money - money;
            expenses = expenses + money;
        }
        else
        {
            this.money = this.money - money;
            expenses = expenses + money;
        }
                
    }
    
    void addSkipTurns(int turns)
    {
        SkipTurns = turns + SkipTurns;
    }
}
