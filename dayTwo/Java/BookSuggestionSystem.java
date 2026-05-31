import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class BookSuggestionSystem{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        BookSuggestionSystem suggestionSys = new BookSuggestionSystem();
        String bookTitle;
        String update;
        boolean decision = true;
        int count = 0;
        int option = 0;
        do{
            count = count + 1;
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
    
    public ArrayList<String> library;
    
    public BookSuggestionSystem(){

        this.library = new ArrayList<String>();

    }

    public String showAllBooks(){
        String books= "";
        if(this.library.size() > 0){

            for(int counter = 0; counter < this.library.size(); counter++){
                books = books + library.get(counter) + ", ";
            }
            return books;
        }
        return "No books found";
    }



    public String addBook(String newBook){
        
        library.add(newBook);
        if(this.library.contains(newBook)){

            return "Book added succesfully!";
        }
        return "Book wasn't added'";
    }



    public String removeBook(String book){
        
        boolean removed  = library.remove(book);
        if(removed){
                    
            return "Book removed succesfully!";
        }
        return "Book isn't in library'";
    }



    public String updateBook(String bookToUpdate, String update){

            if(this.library.contains(bookToUpdate)){
            
                int index = this.library.indexOf(bookToUpdate);
                this.library.set(index,update);
                String element = this.library.get(index);
                if(element.equals(update)){
                    return "Book updated successfully!";
                }
                return "Book not updated";        
            }
            return "Book not found";
    }



    public String suggestBook(){
        Random randNumber = new Random();
         
        if(this.library.size() > 0){
            int index = randNumber.nextInt(this.library.size());    
            int pageNumber = 1 + randNumber.nextInt(100);
            return this.library.get(index) + " Page " + pageNumber;
        }
        return "No book found, Kindly add a book..";
    }




}








