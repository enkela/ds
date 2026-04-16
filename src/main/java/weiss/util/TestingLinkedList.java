/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weiss.util;

import DS.Book;

/**
 *
 * @author enkel
 */
public class TestingLinkedList {
    
    public static void main(String[] args) {
        testLinkedList();
    }

    private static void testLinkedList() {
        
        LinkedList<Book> myBooks = new LinkedList<Book>();
        Book b1 = new Book("B1", 9000);
        Book b2 = new Book("B2", 1000);
        Book b3 = new Book("B3", 8000);
        Book b4 = new Book("B4", 4000);
        Book b5 = new Book("B5", 9000);
        Book b6 = new Book("B6", 1000);
        Book b7 = new Book("B7", 8000);
        Book b8 = new Book("B8", 4000);

        myBooks.addFirst(b4);
        myBooks.addFirst(b3);
        myBooks.addFirst(b2);
        myBooks.addFirst(b1);
        System.out.println("Show Elements of linked list");

//        System.out.println("Show Elements of linked list after substitute two elemnts of the list");
//        System.out.println("----------------------------------------------------");
//        myBooks.substitute(b1, b4, new BookComparator<Book>());
        myBooks.printList();
//        System.out.println("----------------------------------------------------");
//        System.out.println("Show Elements of linked list in Inverse Order");
//        myBooks.showInverseList();
        myBooks.add(b5);
        myBooks.add(b6);
        myBooks.add(b7);
        myBooks.add(b8);
        
        System.out.println("----------------------------------------------------");
       // myBooks.moveLargerAtTheFrontUKPERAJ(b7, new BookComparator<Book>());
      // myBooks.swap(1,2);
    }
}
