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
 * 
 *This class takes a list of book titles and arrange them into a bag. The
 * methods inside of the this class manipulates the entries within the bag and
 * deletes them.
 * @author Erica Chong
 */

import java.util.*;

public class PileOfBooks<T> implements PileInterface<T> {
       private T[] bag;
       private int numOfEntries;
       private static final int DEFAULT_CAPACITY = 4;
       private boolean corruptFree = false;
       public static final int MAX_CAPACITY = 10000;
       
       public PileOfBooks()
       {
           this(DEFAULT_CAPACITY);
           
       }
       
       public PileOfBooks(int getCapacity)
       {
           //creates bag if requested capacity is not exceeding maximum
           if(getCapacity <= MAX_CAPACITY)
           {
               @SuppressWarnings("unchecked")
               T[] createBag = (T[]) new Object[getCapacity];
               bag = createBag;
               numOfEntries = 0;
               corruptFree = true;
           }else{
           
               throw new IllegalStateException("Entered capacity exceeded" +
                                                " allowed maximum.");
           }
       }
       
       /**Checks to see if the object is corrupt*/
       public void checkIntegrity ()
       {
           if(!corruptFree)
           {
               throw new SecurityException("Warning! This object is corrupt!");
           }
       }
       
       /**Checks to see if the array is full
        @return True if the array is full*/
       private boolean isArrayFull()
       {
           return numOfEntries >= bag.length;
       }
       
       /**This method adds a new entry to the bag
            @param newElement the entry to be added
            @return True if entry was added successfully*/
       public boolean add (T newElement)
       {
           checkIntegrity();
           boolean canAdd = true;
           if(isArrayFull())
           {
              doubleCapacity(); 
           }
            
            bag[numOfEntries] = newElement;
            numOfEntries++;
            
            return true;
           } //end add
       
       
       
    /**Checks to see if the bag still has room
        @param getCapacity how much space is needed*/  
    private void checkCapacity(int getCapacity)
    {
        if(getCapacity > MAX_CAPACITY)
        {
            throw new IllegalStateException("Attempt to create a bag whose " +
                        "capacity exceeds allowed " + "maximum of "+ 
                         MAX_CAPACITY);
        }

    }//end checkCapacity
    
    /**Doubles the capacity if there is not enough space*/
    private void doubleCapacity()
    {
        int newLength = 2*bag.length;
        checkCapacity(newLength);
        bag = Arrays.copyOf(bag, newLength);

    }// end doubleCapacity

      /**Removes and return the top Book from the pile
       @return the title of the book to be removed*/ 
       public T remove ()
       {
           checkIntegrity();
           T topBook = null;
           if(!isEmpty())
           {
            topBook = bag[numOfEntries-1];
            bag[numOfEntries-1] = null;
            numOfEntries--;
           }

           
           return topBook;
       }// end remove
       
       /**Returns if the bag is empty
        @return True if there are no entries inside the bag,*/
       public boolean isEmpty()
       {
           return numOfEntries == 0;
       }// end isEmpty
       
       /**Returns the title of the top book
        @return the name of the topmost book*/
       public T getTopBook()
       {
           checkIntegrity();
           T result = null;
           if(!isEmpty())
           {
               result = bag[numOfEntries-1];
           }
               
           return result;
       }// end getTopBook

    /**Clears the bag of entries*/
    public void clear() {
       while(!isEmpty())
       {
         remove(); 
       }
    }//end clear
    
}
