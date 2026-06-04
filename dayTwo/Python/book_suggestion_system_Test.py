from unittest import TestCase

import book_suggestion_system

class AddBookMethod(TestCase):

    def test_that_add_book_function_exists(self):
        book = "gift of men"
        book_suggestion_system.add_book(book)
    
    def test_that_add_book_function_returns_added_succesfully(self):
        book = "gift of men"
        expected = "Book added succesfully"
        actual = book_suggestion_system.add_book(book)
        self.assertEqual(expected,actual)
       
 
class RemoveBookMethod(TestCase):

    def test_that_remove_book_function_exists(self):
        book = "gift of men"
        book_suggestion_system.remove_book(book)
    
    def test_that_remove_book_function_removes_specified_book_succesfull(self):
        book = "gift of men"
        expected = "Book removed successfully"
        actual = book_suggestion_system.remove_book(book)
        self.assertEqual(expected,actual)


class UpdateBookMethod(TestCase):
    book = "Greatest"
    book_suggestion_system.add_book(book)

    def test_that_update_book_function_exists(self):
        book_to_update = "gift of men"
        update = "light"
        book_suggestion_system.update_book(book_to_update,update)
    
    def test_that_update_book_function_updates_book_succesfully(self):

        book_to_update = "Greatest"
        update = "light"
        expected = "Book updated successfully"
        actual = book_suggestion_system.update_book(book_to_update,update)
        self.assertEqual(expected,actual)
        

class ShowBookMethod(TestCase):
    
    def test_that_show_book_function_exists(self):
        book_suggestion_system.show_books()
    
    def test_that_show_book_function_returns_all_books_in_library(self):
        expected =  ["Gift of men","King of persia","Lord of the rings","Super bowl","Greatest"]
        actual = book_suggestion_system.show_books()
        self.assertEqual(expected,actual)

        
#class SuggestBookMethod(TestCase):
#    
#    def test_that_suggest_book_function_exists(self):
#        book_suggestion_system.suggest_book()
#    
#    def test_that_suggest_book_function_returns_book_and_page_number(self):
#        expected = "Greatest page 0"
#        actual = book_suggestion_system.suggest_book()
#        self.assertEqual(expected,actual)
#        
#
