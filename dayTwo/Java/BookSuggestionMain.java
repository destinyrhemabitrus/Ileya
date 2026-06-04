import java.util.Scanner;
public class BookSuggestionMain{

    public static void main(String[] args){
     
        Scanner inputCollector = new Scanner(System.in);
        BookSuggestionSystem suggestionSys = new BookSuggestionSystem();
        String bookTitle;
        String update;
        boolean decision = true;
        int count = 0;
        int option = 0;
        do{
            System.out.printf("Welcome to the Book Suggestion System!%n1. Get Suggestions%n2. Add Book%n3. Remove Book%n4. Update book%n5. Show all books%n");
            option = inputCollector.nextInt();
            System.out.println();
            switch(option){

                case 1:
                    System.out.println(suggestionSys.suggestBook() + "\n");
                    break;

                case 2:
                    System.out.println("Enter the book title: ");
                    inputCollector.nextLine(); 
                    bookTitle = inputCollector.nextLine();
                    System.out.println(suggestionSys.addBook(bookTitle) + "\n");
                    break;

                case 3:
                    System.out.println("Enter the book title to remove: ");
                    inputCollector.nextLine(); 
                    bookTitle = inputCollector.nextLine();
                    System.out.println(suggestionSys.removeBook(bookTitle) + "\n");
                    break;

                case 4:
                    System.out.println("Enter the old title: ");
                    inputCollector.nextLine(); 
                    bookTitle = inputCollector.nextLine();

                    System.out.println("Enter the new title: ");
                    //inputCollector.nextLine(); 
                    update = inputCollector.nextLine();
                    System.out.println(suggestionSys.updateBook(bookTitle,update) + "\n");
                    break;


                case 5:
                    System.out.println(suggestionSys.showAllBooks() + "\n");
                    break;



                default:
                System.out.println("invalid selection");
                decision = false;
                break;
                
            }

        }while(decision == true);

     
    }

}
