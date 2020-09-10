import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
 
 
public class Game5 {
 
    public static void main(String[] args) {
        boolean validgrid=false; // this variable will change at the end of the loop only if the size is good (between 4 and 9)
        int grid[][]; // 2D array, I still didn`t figure out a way to put the grid on it
        int size; // I still couldnt do it, but I wanna put this size variable into the 2D to change the dimensions
        while (validgrid==false) {  // While will it keep doing unless validgrid is true which will only happen at the end
        Scanner in = new Scanner(System.in); // mandatory otherwise scan doesnt work
        System.out.println("What size would you like to play? Smallest 4 biggest 8");
        size = in.nextInt(); // allocating the input inside of size
   
        if (size > 8 || size<4) {   // Checking if size is acceptable || is logical operator OR
            System.out.println("Sorry enter a valid size");
        }
        else {
            validgrid=true; // If size is in the range we can change valid grid so  the loop will stop
        }
       
        }
   
       
         Game5 g = new Game5();
            System.out.println("Let's get started !!The moves are defined by the letters \n A for LEFT\n S for DOWN  \n W for Up \n D for RIGHT ");
         
           g.printArray();
           //g.keyPressed();
       
       
    }
    private int [][] grid;
    private Random r = new Random();
    public Game5() {
        grid = new int[4][4];
        addNewNumber();
        addNewNumber();
    }
   
    public void addNewNumber() {
        ArrayList<Integer> emptySpacesX = new ArrayList<Integer>();
        ArrayList<Integer> emptySpacesY = new ArrayList<Integer>();
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (grid[x][y] == 0) {
                    emptySpacesX.add(new Integer(x));
                    emptySpacesY.add(new Integer(y));
                }
            }
        }
        int choice = r.nextInt(emptySpacesX.size());
        int numberChooser = r.nextInt(10); // value 0-9
        int newNumber = 1;
        if (numberChooser == 0) {
            newNumber = 2;
        }
        int X = emptySpacesX.get(choice);
        int Y = emptySpacesY.get(choice);
        grid[X][Y] = newNumber;
    }
   
     public void printArray() {
            for (int[] x : grid) {
                System.out.format("%6d%6d%6d%6d%n", x[0], x[1], x[2], x[3]);
            }
            System.out.format("%n");
        }
}