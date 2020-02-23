package day52.books;

public interface KnowledgeBank {

    public abstract void displayInfo();
    public default void showTableOfContent(){
        System.out.println("");
    }


}
