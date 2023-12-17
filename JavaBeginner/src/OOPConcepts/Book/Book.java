package OOPConcepts.Book;

public class Book {

    private int noOfCopies;
    public Book(int noOfCopies){
        this.noOfCopies = noOfCopies;
    }
    public int getNoOfCopies() {
        return noOfCopies;
    }
    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies >= 0)
            this.noOfCopies = noOfCopies;
    }
    public void increaseNoOfCopies(int copies){
        setNoOfCopies(this.noOfCopies + copies);
    }
    public void decreaseNoOfCopies(int copies){
        setNoOfCopies(this.noOfCopies - copies);
    }
}
