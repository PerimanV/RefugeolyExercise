/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Refugee {
    private String name;
    private int money,expenses,SkipTurns = 0,dice;
    private Board board;
    private Square square;
    
    
    public Refugee(String name,int money,Board board,Square square,int expenses,int dice)
            {
                this.name = name;
                this.money = money;
                this.board = board;
                this.square = square;
                this.dice = dice;
            }
    
    public void setSquare(Square square)
    {
        this.square = square;
    }
    
    public void receiveMoney(int ToReceive)
    {
        this.money = this.money + ToReceive;
    }
    
    public void giveMoney(boolean mafia,int money,ReceiverEntity reciever)
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
    
    void setDice(int DiceNum)
    {
        dice = DiceNum;
        
    }
}
