import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class BookSuggestionSystem{
    
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
        return "Book isn't in library";
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








