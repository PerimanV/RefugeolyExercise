/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class Square {
    
    private int number;
    private String text,description;
    private Board board;
    private ArrayList<Action> actions = new ArrayList<Action>();
    private int ActionSum = 0;
    
    public Square (int number,String text,String description,Board board)
    {
        this.number = number;
        this.text = text;
        this.description = description;
        this.board = board;
        
    }
  
    public void addAction(Action action)
    {
        actions.add(action);
        ActionSum++;
    }
    
     public void act(Refugee refugee) 
     {
        for (int i = 0; i < ActionSum; i++) 
        {
            Action action = actions.get(i);
            action.act(refugee);
        }
    }
    
    
}
