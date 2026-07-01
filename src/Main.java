import java.util.Scanner;
import java.util.Random;
void main() {
    Scanner sc= new Scanner(System.in);
    Random random= new Random();

    String[] INPUT={"ROCK","PAPER","SCISSOR"};

    int ROUND=0;
    int YOUWIN=0;
    int COMPWIN=0;
    int DRAW=0;

    System.out.println("==========LET'S PLAY ROCK PAPER SCISSOR==========");

    while (true){

        System.out.print("ENTER ROCK,PAPER OR SCISSOR OR ENTER QUIT TO EXIST :");
        String USERINPUT= sc.nextLine();

        if (USERINPUT.equalsIgnoreCase("quit")){
            System.out.println("=====THANK YOU FOR PLAYING=====");
            System.out.println("NUMBER OF ROUND= "+ROUND+ " \nTOTAL WIN= "+YOUWIN + " \nLOSE= "+COMPWIN);
            break;
        }

        if (!USERINPUT.equalsIgnoreCase("ROCK") && !USERINPUT.equalsIgnoreCase("PAPER") && !USERINPUT.equalsIgnoreCase("SCISSOR")){
            System.out.println("ENTER ROCK, PAPER OR SCISSOR");
            continue;
        }

        //GENERATE COMPUTER CHOISE
        int COMPUTERINDEX =random.nextInt(3);
        String COMPUTERCHOICE = INPUT[COMPUTERINDEX];
        System.out.println("COMPUTER CHOICE= "+COMPUTERCHOICE);

        if(COMPUTERCHOICE.equalsIgnoreCase(USERINPUT)){
            System.out.println("MATCH DRAW");
            DRAW++;
        }
        else if (WINCASE(COMPUTERCHOICE,USERINPUT)) {
            System.out.println("YOU WON");
            YOUWIN++;
        }
        else {
            System.out.println("YOU LOSE");
            COMPWIN++;
        }
    ROUND++;
    }
}
private static boolean WINCASE(String COMPUTER_INPUT,String INPUT){
    return COMPUTER_INPUT.equalsIgnoreCase("ROCK") && INPUT.equalsIgnoreCase("PAPER")||
            COMPUTER_INPUT.equalsIgnoreCase("PAPER") && INPUT.equalsIgnoreCase("SCISSOR")||
            COMPUTER_INPUT.equalsIgnoreCase("SCISSOR") && INPUT.equalsIgnoreCase("ROCK");
}
