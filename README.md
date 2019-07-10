## Book-Service
Book Service REST API

## Author
Arnab Mondal

### This Rest API supports the following endpoints

|   Endpoint      | HTTP Method | Description                          |  Access |
|-----------------|-------------|--------------------------------------|---------|
|/books           | GET         | List of all books                    | GENERAL |
|/books/{book_id} | GET         | Get book by id                       | GENERAL |
|/books/{book_id} | POST        | Add a book                           | ADMIN   |
|/books/{book_id} | DELETE      | Delete a book                        | ADMIN   |
|/books/{book_id} | PUT         | Update a book                        | GENERAL |
|/books/upload    | POST        | Upload CSV file with a list of books | ADMIN   |
