import java.util.ArrayList;
public class BookSuggestionSystemTest{

    BookSuggestionSystem suggestionSys = new BookSuggestionSystem();

    @org.junit.jupiter.api.Test
    public void Test_that_showAllBooksMethod_Exists(){
        
//        BookSuggestionSystem suggestionSys = new BookSuggestionSystem();
        suggestionSys.showAllBooks();

    }



    @org.junit.jupiter.api.Test
    public void Test_that_showAllBooksMethod_ReturnsAllBooksInLibrary(){
        
//        BookSuggestionSystem suggestionSys = new BookSuggestionSystem();
        String book1 = "How to pray";
        String book2 = "Think and grow rich";
        suggestionSys.addBook(book1);
        suggestionSys.addBook(book2);
        String actual = suggestionSys.showAllBooks();
        String expected = "How to pray Think and grow rich ";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }



    @org.junit.jupiter.api.Test
    public void Test_that_addBookMethod_AddsBookSuccesufully(){
        
//        BookSuggestionSystem suggestionSys = new BookSuggestionSystem();
        String newBook = "5 Love Languages";
        String actual = suggestionSys.addBook(newBook);
        String expected = "Book added succesfully!";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }



    @org.junit.jupiter.api.Test
    public void Test_that_removeBookMethod_RemovesBookSuccesufully(){
        
//        BookSuggestionSystem suggestionSys = new BookSuggestionSystem();
        String book1 = "How to pray";
        String book2 = "Think and grow rich";
        suggestionSys.addBook(book1);
        suggestionSys.addBook(book2);
        String actual = suggestionSys.removeBook(book1);
        String expected = "Book removed succesfully!";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }



    @org.junit.jupiter.api.Test
    public void Test_that_updateBookMethod_UpdatesBookSuccesufully(){
        
//        BookSuggestionSystem suggestionSys = new BookSuggestionSystem();
//        String book1 = "How to pray";
//        String book2 = "Think and grow rich";
//        suggestionSys.addBook(book1);
//        suggestionSys.addBook(book2);
//
        String bookToUpdate = "How to pray";
        String update = "Finishing Strong";
        String actual = suggestionSys.updateBook(bookToUpdate, update);
        String expected = "Book not found";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    public void Test_that_suggestBookMethod_ReturnsSuggestedBookAndPageNumber(){
        
        BookSuggestionSystem suggestionSys = new BookSuggestionSystem();
        String book1 = "How to pray";
        String book2 = "Think and grow rich";
        suggestionSys.addBook(book1);
        suggestionSys.addBook(book2);
       
 
        String actual = suggestionSys.suggestBook();
        String expected = "How to pray Page 0";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }



}













