package Basics;

public class MultiplicationTable {

    public void printTable(int table, int from, int to){
        for (int i=from; i<=to; i++) {
            System.out.printf("%d X %d = %d", table, i, i*table).println();
        }
    }
    public void printTable(int table){
        printTable(table, 1, 10);
    }
    public void printTable(){
        printTable(5);
    }
}
