/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ericachongta1;

/**
 * Name: Erica Chong
 * AD 325 - Data Structures and Algorithms
 * Assignment #1
 * 
 *This class tests the PileOfBooks class with sample entries
 * @author Erica Chong
 */
import java.util.*;

public class PileOfBooksTest {
    
    public static void main(String[] args) 
    {

        PileInterface<String> myPile = new PileOfBooks<>();

        System.out.println("Create an empty pile of books: ");
        
        //Indicates that the list is empty
        System.out.println("isEmpty() returns " + myPile.isEmpty());

        System.out.println("Add to pile.");
        
        //user enters a list of book titles
        myPile.add("And then there were none");
        myPile.add("The Hobbit");
        myPile.add("The Lord of the Rings");
        myPile.add("The DaVinci Code");
        myPile.add("The Catcher in the Rye");
        
        //Confirms that the list is/is not empty
        System.out.println("isEmpty() returns " + myPile.isEmpty());
        
        System.out.println("Testing Peek and Pop: ");
        System.out.println("");
        
        //While the bag is not empty
        while(!myPile.isEmpty())
        {
            /**the loop goes through the list and prints out the top book
                and deletes the topmost book.*/
            System.out.println(myPile.getTopBook() + " is at the top of the pile.");
            System.out.println(myPile.remove() + " is removed from the pile.");
            System.out.println("");
        }
        
        System.out.println("The pile should be empty: ");
        System.out.println("isEmpty() returns " + myPile.isEmpty());
        
        System.out.println("Add to the pile");
        
        //adds the pile of books again
        myPile.add("And then there were none");
        myPile.add("The Hobbit");
        myPile.add("The Lord of the Rings");
        myPile.add("The DaVinci Code");
        myPile.add("The Catcher in the Rye");
        
        System.out.println("Testing clear: ");
        
        //bag is cleared
        myPile.clear();
        System.out.println("");
        
        System.out.println("The pile should be clear, "
                             + " isEmpty() returns " + myPile.isEmpty());
        
        //confirms that the bag is empty and full of nulls
        System.out.println("myPile.getTopBook() returns " + myPile.getTopBook());
        System.out.println("myPile.remove() returns " + myPile.remove());
        
        System.out.println("Done.");
        
       
    }

    
}
