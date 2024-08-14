//////////////// FILE HEADER  //////////////////////////
//
// Title: P08 - LinkedNode
// Course: CS 300 Spring 2024
//
// Author: Waleed Almousa
// Email: walmousa@wisc.edu
//
//
//////////////////////// ASSISTANCE/HELP CITATIONS ////////////////////////////
//
// Persons: Instructors helped answer questions on Piazza
// Javadoc comments copied from project instructions
// Online Sources:
// https://learn.zybooks.com/zybook/WISCCOMPSCI300Spring2024?selectedPanel=student-activity
// Zybook Chapters 10.13 and 10.14 helped me with the processText function by familiarizing
// me with the syntax of hashmaps
//
///////////////////////////////////////////////////////////////////////////////




/**
 * An class describing a single element of a linkedList. It is comprised of data and a pointer to the next node.
 * 
 * @param <T> the type of data contained in this queue
 */
public class LinkedNode <T> {
	// Data contained within this node.
	private T data;

	// Reference to the next node in the list, or null if this is the last node.
	private LinkedNode<T> next;

	/**
	 * Constructor to initialize a node with data.
	 * Next node reference is not set here (implicitly null).
	 *
	 * @param data The data to store in this node.
	 */
	public LinkedNode(T data) {
		this.data = data;
	}

	/**
	 * Constructor to initialize a node with data and a reference to the next node.
	 *
	 * @param data The data to store in this node.
	 * @param next Reference to the next node in the list.
	 */
	public LinkedNode(T data, LinkedNode<T> next) {
		this.data = data;
		this.next = next;
	}

	// Returns the data stored in this node.
	public T getData() { return data; }

	// Returns the next node in the list.
	public LinkedNode<T> getNext() { return next; }

	// Sets the reference to the next node in the list.
	public void setNext(LinkedNode<T> next) { this.next = next; }

}
