import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100) ; 
    }
    void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.format("yes you gessed it right , it was %d\n you guessed it in %d attemp",number,noOfGuesses);
            return true;
        }
        else if(inputNumber < number){
            System.out.println("to Low...");
        }
        else if(inputNumber > number){
            System.out.println("to High...");
        }
       return false;
    }
}
public class NumberGuessesGame{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
        g.takeUserInput();
         b = g.isCorrectNumber();
        }
    }
}
