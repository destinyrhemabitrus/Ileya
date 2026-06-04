module.exports = {showBooks,addBook,removeBook,updateBook,getSuggestions};

let library = ["5 love languages","Gift of men","Followers of them","The last days","Philosophy of the wise","internet of things"];

//show books function
function showBooks(){
    return library;
}

//add book function
function addBook(bookToAdd){
    library.push(bookToAdd);
    if(library.includes(bookToAdd)){
        return "Book added successfully";
    }
    return "Book not added";
}


//removeBook
function removeBook(bookToRemove){
    if(library.includes(bookToRemove)){
        let index = library.indexOf(bookToRemove);
        library.splice(index,1);
        return "Book removed successfully";
    }
    return "Book not found";
}


//update book
function updateBook(bookToUpdate,update){
    if(library.includes(bookToUpdate)){
        let index = library.indexOf(bookToUpdate);
        library[index] = update;
        return "Book updated successfully";
    }
    return "book not found";    
}


function getSuggestions(){
    if(library.length > 0){
        let suggIndex = Math.floor(Math.random() * library.length);
        let pageRand = Math.round(Math.random() * 100);
        return library[suggIndex] + " page " + pageRand; 

    }
  
}







