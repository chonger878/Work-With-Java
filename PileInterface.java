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
 * An interface that modifies a stack of books
	@author Erica Chong
 */
import java.util.*;


	

public interface PileInterface<T>
{
	
	/**Add new entry to stack of books
		@param newEntry- title of book to be added
		@return True if title was able to be added*/
	public boolean add(T newElement);
	
	/**Removes element
		@return removed element*/
	//public T remove();
	
	/**Removes requested entry from the stack
		@param anEntry- the element to be removed
		@return True if the element was successfully removed*/
	public T remove();
	
	/**Indicates if the stack is empty
		@returns True if the stack is empty*/
	public boolean isEmpty();
	
	/**Returns the top book from the stack
		@return the string title of the top book*/
	public T getTopBook();
	
	/**Clears the stack*/
	public void clear();

    
}
