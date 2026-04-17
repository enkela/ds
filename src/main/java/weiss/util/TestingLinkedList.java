/*
 *
 * Testing class for Linked List 
 */
package weiss.util;

import DS.Book;
import DS.BookComparator;

/**
 *
 * @author eHazizi
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
        myBooks.printList();
        //Find elemnts by using binary search
        System.out.println(myBooks.binarySearch(b2, new BookComparator<>()));
        System.out.println(myBooks.binarySearchAnyType(b2, new BookComparator<>()));
        myBooks.add(b5);
        myBooks.add(b6);
        myBooks.add(b7);
        myBooks.add(b8);
         myBooks.printList();
        System.out.println("Show Elements of linked list");
        System.out.println("Remove duplicates");
         myBooks.removeDublicates(new BookComparator<>());
        myBooks.printList();
        
        System.out.println("----------------------------------------------------");
        System.out.println(myBooks.binarySearch(b2, new BookComparator<>()));
        System.out.println(myBooks.binarySearchAnyType(b7, new BookComparator<>()));
        System.out.println("******Move B5 element at front******** ");
        myBooks.moveAtTheFront(b5, new BookComparator<>());
     
        myBooks.printList();
    }
}
