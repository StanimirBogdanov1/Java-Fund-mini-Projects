package Z_MiniProjects_Z;

import java.util.Random;
import java.util.Scanner;

public class b_RockPaperScissors_2 {



    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);




        System.out.println("Choose [r]ock, [p]aper or [s]cissors");
        String myInput=scanner.nextLine();

        if(myInput.equals("r")||myInput.equals("rock")){
            myInput=ROCK;
        }else if(myInput.equals("p")||myInput.equals("paper")){
            myInput=PAPER;
        }else if (myInput.equals("s")|| myInput.equals("scissors")){
            myInput=SCISSORS;
        }else{
            System.out.println("Invalid input. Try again");
            return;
        }

        Random random=new Random();
        int computerRandomNumber=random.nextInt(3);

        String computerMove="";

        switch (computerRandomNumber){
            case 0:
                computerMove=ROCK;
                break;
            case 1:
                computerMove=PAPER;
                break;
            case 2:
                computerMove=SCISSORS;


        }

        System.out.println("Computer choose" +" "+ computerMove);

        if(myInput.equals(ROCK) && computerMove.equals(SCISSORS)||
        myInput.equals(PAPER) && computerMove.equals(ROCK)||
        myInput.equals(SCISSORS)&& computerMove.equals(PAPER)){
            System.out.println("you WIN");
        }else if(myInput.equals(ROCK) && computerMove.equals(PAPER)||
                myInput.equals(PAPER) && computerMove.equals(SCISSORS)||
                myInput.equals(SCISSORS) && computerMove.equals(ROCK)){
            System.out.println("you LOSE");
        }else {
            System.out.println("DRAW");
        }




    }


}
