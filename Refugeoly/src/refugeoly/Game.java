package refugeoly;


import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Game {
    
    public void play()
    {
        Board board1 = new Board();
        ReceiverEntity mafia = new ReceiverEntity("mafia",0);
        GiverEntity NGOBank = new GiverEntity("NGOBank",10000);

        String filePath = "./refugeoly-squares.txt";

        ArrayList<Square> squares = new ArrayList<>();

            Scanner scanner;

            System.out.println("LINE 59");
            
        //read the file of rules for the squares and save their number,text and description
        try{
        scanner = new Scanner(new File(filePath));

            while (scanner.hasNextLine()) {
                int number = Integer.parseInt(scanner.nextLine().trim());

                String text = scanner.nextLine().trim();

                String description = scanner.nextLine().trim();

                squares.add(new Square(number, text, description, board1)); 
                scanner.nextLine();
            }
            scanner.close();
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("Error there was no file ");
        }
        catch(NumberFormatException | NoSuchElementException e2)
        {
            System.out.println("End of file");
        }
        
        //initialize the squares 
        initialize(squares,NGOBank,mafia);
        
        
        System.out.println("LINE 59");
        
        Refugee player1 = null;
        Refugee player2 = null;
        Refugee player3 = null;
        Refugee player4 = null;
        
        
        System.out.println("How many players will be playing?");
        Scanner kbrd = new Scanner(System.in);
        
        int res = kbrd.nextInt();

        //interact with the player 
        interaction(squares,board1,player1,player2,player3,player4,res,kbrd);
        
        ArrayList<Refugee> players = new ArrayList<Refugee>();
        
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        
        for(int i = 0; i<39 ; i++)
        {
            board1.addSquare(squares.get(i));
        }


        
        ///////////Gameplay starts here
        
        System.out.println("All the players start on square 0");

        gameplay(players,board1,res);

        
    }
    
    public void interaction(ArrayList<Square> squares,Board board1,Refugee player1,Refugee player2,Refugee player3,Refugee player4,int res,Scanner kbrd)
    {
       
      
        boolean pass = true;
        
        do
        {
           if(res == 1)
           {
               System.out.println("What is the name of player1?");
               String ans = kbrd.nextLine();

               player1 = new Refugee(ans,10000,board1,squares.get(0),0);
           }
           else if(res == 2)
           {
               System.out.println("What is the name of Player1?");
               String ans = kbrd.nextLine();

               System.out.println("What is the name of Player2?");
               String ans2 = kbrd.nextLine();

               player1 = new Refugee(ans,10000,board1,squares.get(0),0);
               player2 = new Refugee(ans2,10000,board1,squares.get(0),0);

           }
           else if(res == 3)
           {
               System.out.println("What is the name of Player1?");
               String ans = kbrd.nextLine();

               System.out.println("What is the name of Player2?");
               String ans2 = kbrd.nextLine();

               System.out.println("What is the name of Player3?");
               String ans3 = kbrd.nextLine();

               player1 = new Refugee(ans,10000,board1,squares.get(0),0);
               player2 = new Refugee(ans2,10000,board1,squares.get(0),0);
               player3 = new Refugee(ans3,10000,board1,squares.get(0),0);
           }
           else if(res == 4)
           {
               System.out.println("What is the name of Player1?");
               String ans = kbrd.nextLine();

               System.out.println("What is the name of Player2?");
               String ans2 = kbrd.nextLine();

               System.out.println("What is the name of Player3?");
               String ans3 = kbrd.nextLine();

               System.out.println("What is the name of Player4?");
               String ans4 = kbrd.nextLine();

               player1 = new Refugee(ans,10000,board1,squares.get(0),0);
               player2 = new Refugee(ans2,10000,board1,squares.get(0),0);
               player3 = new Refugee(ans3,10000,board1,squares.get(0),0);
               player4 = new Refugee(ans4,10000,board1,squares.get(0),0);
           }
           else
           {
               System.out.println("Please give a valid number 1-4");
               pass = false;
               res = kbrd.nextInt();
           }
           
        }while(pass == false);
        
        kbrd.nextLine(); // clear \n
       
    }
    
    //function to check if a player is still alive
    public boolean isAlive(Refugee refugee)
    {
        if(refugee.getMoney() <= 0 )
        {
            System.out.println("Player is dead");
            return false;
        }
        if(refugee.getLives() <= 0 )
        {
            System.out.println("Player is dead");
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public void initialize(ArrayList<Square> squares, GiverEntity NGOBank, ReceiverEntity mafia)
    {
        PayMoneyAction act1 = new PayMoneyAction(100,false,mafia);
        squares.get(1).addAction(act1);
        
        RollDiceAction act2 = new RollDiceAction();  
        squares.get(2).addAction(act2);
        
        PayMoneyAction act3 = new PayMoneyAction(300,true,mafia);
        squares.get(3).addAction(act3);
        
        GoToAction act4 = new GoToAction(squares.get(0));
        squares.get(4).addAction(act4);
        
        GoToAction act5 = new GoToAction(squares.get(0));
        squares.get(5).addAction(act5);
        
        PayMoneyAction act6 = new PayMoneyAction(1000, true, mafia);
        squares.get(6).addAction(act6);
        
        GiveLivesAction act7 = new GiveLivesAction(1);
        squares.get(7).addAction(act7);
        
        SkipTurnsAction act8 = new SkipTurnsAction(1);
        squares.get(8).addAction(act8);
        
        PayMoneyAction act9 = new PayMoneyAction(3000, true, mafia);
        squares.get(9).addAction(act9);
        
        RemoveLivesAction act10 = new RemoveLivesAction(1);
        squares.get(10).addAction(act10);
        
        squares.get(11).addAction(act8);
        
        squares.get(12).addAction(act2);
        
        PayMoneyAction act13 = new PayMoneyAction(200, true,mafia);
        squares.get(13).addAction(act13);
        
        squares.get(14).addAction(act8);
        
        GoToAction act15 = new GoToAction(squares.get(5));
        squares.get(15).addAction(act15);
        
        PayMoneyAction act16 = new PayMoneyAction(500,true,mafia);
        squares.get(16).addAction(act16);
        
        squares.get(16).addAction(act2);
        
        squares.get(17).addAction(act2);
        
        GoToAction act18 = new GoToAction(squares.get(22));
        squares.get(18).addAction(act18);
        
        squares.get(19).addAction(act8);
        
        ReceiveMoneyAction act20 = new ReceiveMoneyAction(1000, NGOBank);
        squares.get(20).addAction(act20);
        
        PayMoneyAction act21 = new PayMoneyAction(1500, false, mafia);
        squares.get(21).addAction(act21);
        
        GoToAction act23 = new GoToAction(squares.get(29));
        squares.get(23).addAction(act23);
        
        squares.get(24).addAction(act8);
        
        GoToAction act25 = new GoToAction(squares.get(15));
        squares.get(25).addAction(act25);
        
        ChoiceAction act26 = new ChoiceAction(mafia);
        squares.get(26).addAction(act26);
        
        squares.get(27).addAction(act8);
        
        squares.get(28).addAction(act2);
        
        GoToAction act29 = new GoToAction(squares.get(31));
        squares.get(29).addAction(act29);
        
        GoToAction act30 = new GoToAction(squares.get(24));
        squares.get(30).addAction(act30);
        
        PayMoneyAction act31 = new PayMoneyAction(800, true, mafia);
        squares.get(31).addAction(act31);
        
        squares.get(31).addAction(act2);
        
        squares.get(32).addAction(act8);
        
        GoToAction act33 = new GoToAction(squares.get(17));
        squares.get(33).addAction(act33);
        
        squares.get(33).addAction(act2);
        
        squares.get(34).addAction(act8);
        
        GoToAction act35 = new GoToAction(squares.get(25));
        squares.get(35).addAction(act35);
        
        PayMoneyAction act37 = new PayMoneyAction(1000, true, mafia);
        squares.get(37).addAction(act37);
        
        GoToAction act38 = new GoToAction(squares.get(0));
        squares.get(38).addAction(act38);
      
    }
    
    public void gameplay(ArrayList<Refugee> players, Board board1, int res)
    {
        Random rand = new Random();
        int roll;
        boolean win = false;
        boolean p1dead = false,p2dead = false,p3dead = false,p4dead = false;
        
        //play each turn of the players every time untill someone has won the game
        while(win == false)
        {
           for(int i = 1;i<=res; i++)
            {
                System.out.println("Player" + i + " rolls the dice");

                //if the player is not alive then remove him from the list of players , if the player is already dead don't try to remove them again from the list
                if((!(isAlive(players.get(1)))) && (p1dead == false))
                {
                    players.remove(1);
                    p1dead = true;
                }
                if(!(isAlive(players.get(2))) && (p2dead == false))
                {
                    players.remove(2);
                    p2dead = true;
                }
                if(!(isAlive(players.get(3))) && (p3dead == false))
                {
                    players.remove(3);
                    p3dead = true;
                }
                if(!(isAlive(players.get(4))) && (p4dead == false))
                {
                    players.remove(4);
                    p4dead = true;
                }
                       

                if (i == 1 && (p1dead == false) && (players.get(1).getSkipTurns() == 0))
                {
                    roll = rand.nextInt(6);

                    players.get(1).setPosition(roll);

                    System.out.println("Player1 has rolled a " + roll);

                    board1.getSquare(players.get(1).getPosition()).printText();

                    board1.getSquare(players.get(1).getPosition()).act(players.get(1));
                    
                    if ((board1.getSquare(roll).getNumber() == 36) || (board1.getSquare(roll).getNumber() == 39) )
                    {
                        System.out.println("Player" + i + " has won!");
                        win = true;
                        break;
                    }
                }
                if( i == 2 && (p2dead == false) && (players.get(2).getSkipTurns() == 0))
                {
                    roll = rand.nextInt(6);
                    
                    players.get(2).setPosition(roll);

                    System.out.println("Player2 has rolled a " + roll);

                    board1.getSquare(players.get(2).getPosition()).printText();

                    board1.getSquare(players.get(2).getPosition()).act(players.get(2));
                    
                    if ((board1.getSquare(roll).getNumber() == 36) || (board1.getSquare(roll).getNumber() == 39) )
                    {
                        System.out.println("Player" + i + " has won!");
                        win = true;
                        break;
                    }
                }
               if ( i == 3 && (p3dead == false) && (players.get(3).getSkipTurns() == 0))
                {
                    roll = rand.nextInt(6);

                    players.get(3).setPosition(roll);

                    System.out.println("Player3 has rolled a " + roll);

                    board1.getSquare(players.get(3).getPosition()).printText();

                    board1.getSquare(players.get(3).getPosition()).act(players.get(3));
                    
                     if ((board1.getSquare(roll).getNumber() == 36) || (board1.getSquare(roll).getNumber() == 39) )
                    {
                        System.out.println("Player" + i + " has won!");
                        win = true;
                        break;
                    }
                }
                if ( i == 4 && (p4dead == false) && (players.get(4).getSkipTurns() == 0))
                {
                    roll = rand.nextInt(6);

                    players.get(4).setPosition(roll);

                    System.out.println("Player4 has rolled a " + roll);

                    board1.getSquare(players.get(4).getPosition()).printText();

                    board1.getSquare(roll).act(players.get(4));

                    //squares
                    if ((board1.getSquare(roll).getNumber() == 36) || (board1.getSquare(roll).getNumber() == 39) )
                    {
                        System.out.println("Player" + i + " has won!");
                        win = true;
                        break;
                    }

                }

                
               //if a player has more than 0 skip turns remove 1
               if((players.get(1).getSkipTurns() > 0) && (p1dead == false))
               {
                   players.get(1).removeSkipTurns(1);
               }
               if((players.get(2).getSkipTurns() > 0) && (p2dead == false))
               {
                   players.get(2).removeSkipTurns(1);
               }
               if((players.get(3).getSkipTurns() > 0) && (p3dead == false))
               {
                    players.get(3).removeSkipTurns(1);
               }
               if((players.get(4).getSkipTurns() > 0) && (p4dead == false))
               {
                   players.get(4).removeSkipTurns(1);
               }
               
               
               //if all players have died END the game on a loss
               if(p1dead && p2dead && p3dead && p4dead)
               {
                   System.out.println("All the players have died , Game Over");
                   return;
               }
            }
        }
        
    }
    

}







