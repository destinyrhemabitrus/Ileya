//importing all functions from bookSuggestionSystem
const {showBooks,addBook,removeBook,updateBook,getSuggestions} = require("./bookSuggestionSystem.js");

//Show books test
test("test that show books function returns all books", ()=>{
    
    expect(showBooks()).toEqual(["Divine","Gift of men"]);    

})

//add book test
test("test that add book function adds book successfully", ()=>{
    let bookToAdd = "lions den";
    let expected = "Book added successfully";
    
    expect(addBook(bookToAdd)).toEqual(expected);    

})



//remove book test
test("test that remove book function remove book successfully", ()=>{

    let bookToRemove = "lions den";
    let expected = "Book removed successfully";
    expect(removeBook(bookToRemove)).toEqual(expected);    

})


//update book test
test("test that update book function update book successfully", ()=>{
    let bookToAdd = "Game of thrones"    
    addBook(bookToAdd)
    let bookToUpdate = "Game of thrones";
    let update = "Game show";
    let expected = "Book updated successfully";
    expect(updateBook(bookToUpdate,update)).toEqual(expected);    

})


















//get suggestions test
//test("test that getSuggestions book function update book successfully", ()=>{
//    
//    let expected = "Divine page 0";
//    expect(getSuggestions()).toEqual(expected);    
//
//})
//


