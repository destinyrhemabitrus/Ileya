import book_suggestion_system

main_menu = True
while main_menu:
    print("Welcome to the Book Suggestion System! \n1. Get Suggestions\n2. Add Book\n3. Remove Book\n4. Update book\n5. Show books")    
    print()
    option = input("Select option:")
    
    match option:
        case "1":
            print(book_suggestion_system.suggest_book())
            print()
        case "2":
            title = input("Enter the book title:")
            print(book_suggestion_system.add_book(title))
            print()

        case "3":
            title = input("Enter the book title to remove:")
            print(book_suggestion_system.remove_book(title))
            print()

        case "4":
            old_title = input("Enter the old title:")
            new_title = input("Enter the new title:")
            print(book_suggestion_system.update_book(old_title,new_title))
            print()

        case "5":
            print(book_suggestion_system.show_books())
            print()

        case "5":
            print(book_suggestion_system.show_books())
            print()

        case _:
            print("Invalid selection")
            print()
