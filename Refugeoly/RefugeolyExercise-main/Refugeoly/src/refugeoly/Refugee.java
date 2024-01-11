package refugeoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Refugee {
    private String name;
    private int money,expenses,SkipTurns = 0,position = 0;
    private Board board;
    private Square square;
    private int lives = 1;
    
    
    public Refugee(String name,int money,Board board,Square square,int expenses)
            {
                this.name = name;
                this.money = money;
                this.board = board;
                this.square = square;
            }
    
    public void setSquare(Square square)
    {
        this.square = square;
        position =  square.getNumber();
    }
    
    public int getMoney()
    {
        return money;
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
    
    public void addSkipTurns(int turns)
    {
        SkipTurns = turns + SkipTurns;
    }
    
    public void removeSkipTurns(int turns)
    {
        SkipTurns = SkipTurns - turns  ;
    }
    
    public int getSkipTurns()
    {
        return SkipTurns;
    }
    
    public void setPosition(int dice)
    {
        position = position + dice;
        
        
    }
    
    public int getPosition()
    {
        return position; 
    }
    
    public void addLives(int lives)
    {
        this.lives = this.lives + lives;
    }
    
    //true = player can keep playing
    //false = player is dead
    public void removeLives(int lives) 
    {
        this.lives = this.lives - lives;
        
    }
    
    public int getLives()
    {
       return lives; 
    }
}
