/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weiss.nonstandard;

import DS.Book;
import DS.BookComparator;

/**
 *
 * @author CS
 */
public class TestProgram {

    public static void main(String[] args) {

        /// Stack operations
        System.out.println("Stack Operations");
        System.out.println("Array Implementation");
        testStackArray();
        System.out.println("List Implementation");
        testStackList();
    }

    public static void testStackArray() {
        ArrayStack<Book> myBooks = new ArrayStack<Book>();

        Book b1 = new Book("Karamazov Brothers", 1000);
        Book b2 = new Book("The Idiot", 9000);
        Book b3 = new Book("Crime and Punishment", 8000);
        Book b4 = new Book("Komedia hyjnore", 7000);

        myBooks.push(b1);
        myBooks.push(b2);
        myBooks.push(b3);
        myBooks.push(b4);

        System.out.println("ShowElements");
        myBooks.showElements();
        System.out.println("ShowElements in inverse");
        myBooks.showInverse();


//
    }
      public static void testStackList() {
        ListStack<Book> myBooksList = new ListStack<Book>();

        Book b1 = new Book("A", 1000);
        Book b2 = new Book("B", 9000);
        Book b3 = new Book("C", 8000);
        Book b4 = new Book("D", 7000);

        myBooksList.push(b1);
        myBooksList.push(b2);
        myBooksList.push(b3);
        myBooksList.push(b4);

        System.out.println("ShowElements");
        myBooksList.showElements();
        System.out.println("ShowElements in inverse");
        myBooksList.showInverse();


//
    }

  

 

    

}
