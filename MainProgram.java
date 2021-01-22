
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());
            bookList.add(new Book(name, ageRec));
            System.out.println();
        }
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        
        Collections.sort(bookList, comparator);  
        System.out.println("\n" + bookList.size() + " books in total.\n");
        System.out.println("Books:");
        bookList.stream()
                .forEach(book -> System.out.println(book));
    }
}
