package com.example.main;

import java.util.Arrays;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Java Unit 3 Closing CFU");


        //Some activities for Array


        //create an array (not an ArrayList) called favoriteColors that holds five strings with your favoriteColors and print the entire array to the screen.
        String[] favoriteColors= {
                "purple", "blue", "red", "green", "yellow"
        };
        //Change the third element of favoriteColors to a different color and print that element to the screen
        favoriteColors[2] = "black";
        //Declare and initialize and array of type int called numbers to hold 1000 elements (this should be used later in the loop exercise)
        int[] numbers = new int[1000];
        //ArrayList
        //Declare and initialize an ArrayList so that it holds values of type <Double>.
        ArrayList<Double> listOfDoubles= new ArrayList<Double>();
        //Using the .add() method, add 5 decimal values to the ArrayList and print it to the screen
        listOfDoubles.add(50.1);
        listOfDoubles.add(34.0);
        listOfDoubles.add(31.05);
        listOfDoubles.add(11.29);
        listOfDoubles.add(10.4);
        //Using the .remove() method, remove the 3rd value in the ArrayList.
        listOfDoubles.remove(2);
        //Print ArrayList to the screen.
        System.out.println(listOfDoubles);
        //Now change the last element in the ArrayList and print the new element to the screen
        listOfDoubles.set(3, 10.6);
        System.out.println(listOfDoubles);

      //Some activities for Loops

//        // write a for loop that prints out numbers 1-1000 and saves these numbers to the empty array you created earlier
        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i] = i + 1);
        }
//        // write a while loop that prints the elements of the array you used in the previous exercise. Take care to avoid infinite looping!
       int j = 0;
        while (j < numbers.length) {
            System.out.println(numbers[j] = j + 1);
            j++;
        }
//        //write a do-while loop that does the same.
        int k = 0;
        do {
            System.out.println(numbers[k] = k + 1);
            k++;
        } while (k < numbers.length);
        // write an enhanced for loop that iterates over this array and prints the result of that number modulus(%) 3
        for (int number : numbers) {
            System.out.println(number % 3);
        }


      //Some activities for String methods

        // Create two String variables, one holding "Hello" and one holding "world"
        String hello = "Hello";
        String world = "World";

        // using String methods, concatenate these strings together with a space between them so that it reads "Hello world" and save the resulting String to a new variable
        hello.concat(world);

        // then, create a for loop that iterates over your new String and prints each letter out using sout




      //Combination Exercises



        // Create a variable that stores a String with the value "Testing out String methods"


        // Use the String's .split() method with the input of '\s' save an array containing each word of your String variable


        // Using a loop of your choosing, loop through the array of strings and print each word to the screen in all caps, along with its length


        // CHALLENGE: search the Oracle Documentation to find out how to sort an array, then print the sorted array to the string

    }
}