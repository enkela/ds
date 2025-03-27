/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weiss.util;

import DS.Book;
import DS.BookComparator;

/**
 *
 * @author CS
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
        myBooks.addFirst(b4);
        myBooks.addFirst(b3);
        myBooks.addFirst(b1);
        myBooks.addFirst(b2);
        System.out.println("Show Elements of linked list");
        myBooks.showList();

        System.out.println("Show Elements of linked list in Inverse Order");
        myBooks.showInverseList();

        myBooks.addFirst(b4);
        int a = myBooks.findOccurrences(b4, new BookComparator());
//        myBooks.remove(b4);
        System.out.println("Show count of the occurrences: " + a);

//        System.out.println("Minimum: " + b.getTitle());
//        System.out.println("Show first Elements of linked list: " + myBooks.first().current.element);
    }

}
