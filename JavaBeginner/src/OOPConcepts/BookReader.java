package OOPConcepts;

import OOPConcepts.Book.Book;

public class BookReader {

    public static void main(String []args){
        Book java = new Book(999);
        Book cProgramming = new Book(1000);

        System.out.println(java.getNoOfCopies());
        System.out.println(cProgramming.getNoOfCopies());

        java.setNoOfCopies(10);
        cProgramming.setNoOfCopies(-15);

        java.increaseNoOfCopies(100);
        cProgramming.increaseNoOfCopies(150);

        System.out.println(java.getNoOfCopies());
        System.out.println(cProgramming.getNoOfCopies());

        java.decreaseNoOfCopies(100);
        cProgramming.decreaseNoOfCopies(150);

        System.out.println(java.getNoOfCopies());
        System.out.println(cProgramming.getNoOfCopies());

    }
}
