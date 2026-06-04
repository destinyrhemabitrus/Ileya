const prompt = require("prompt-sync")();
const {showBooks,addBook,removeBook,updateBook,getSuggestions} = require("./bookSuggestionSystem.js");

let decision = true;
while(decision){

    process.stdout.write("Welcome to the Book Suggestion System!" + "\n" + "1. Get Suggestions" + "\n" + "2. Add Book" + "\n" + "3. Remove Book" + "\n" + "4. Update book" + "\n" + "5. Show books" + "\n" + "\n");
    
    decision = prompt("Enter an option: ");
    switch(decision){

        case "1":
            console.log(getSuggestions());
            console.log();
            break;

 
       case "2":
            let title = prompt("Enter the book title: ")
            console.log(addBook(title));
            console.log();
            break;


        case "3":
            let titleToRemove = prompt("Enter the book title to remove: ")
            console.log(removeBook(titleToRemove));
            console.log();
            break;


        case "4":
            let oldTitle = prompt("Enter the old title: ")
            let newTitle = prompt("Enter the new title: ")
            console.log(updateBook(oldTitle,newTitle));
            console.log();
            break;


        case "5":
            console.log(showBooks());
            console.log();
            break;

    }   

}





