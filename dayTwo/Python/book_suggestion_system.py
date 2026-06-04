import random

library = ["Gift of men","King of persia","Lord of the rings","Super bowl"]
def add_book(bookToAdd):
    library.append(bookToAdd)
    if bookToAdd in library:
        return "Book added succesfully"
    return "Book not in library"

def remove_book(bookToRemove):
    library.remove(bookToRemove)
    if bookToRemove not in library:
        return "Book removed successfully"
    return "book not found"

def update_book(book_to_update,update):
    if book_to_update in library:
        position = library.index(book_to_update)
        library[position] = update
        return "Book updated successfully"    
    else:
        return "Book not found"                


def show_books():
    if not library:
        return "No books found"
    return library


def suggest_book():
    if len(library) > 0:
        first_rand = 1 + random.randint(0,100)
        second_rand = random.randint(0,len(library)-1)
        
        return f"{library[second_rand]} page {first_rand}"
    else:
        return "no book found"


