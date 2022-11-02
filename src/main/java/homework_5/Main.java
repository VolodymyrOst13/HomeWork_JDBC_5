package homework_5;

import homework_5.entity.Author;
import homework_5.entity.Book;

public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) {
            AuthorHelper ah = new AuthorHelper();
            BookHelper bH = new BookHelper();

            Author authorUpdate = ah.getAuthorById(2);
            authorUpdate.setName("Kvitka");
            authorUpdate.setLastName("Osnovyanenko");
            ah.updateAuthor(authorUpdate);

            Book bookUpdate = bH.getBookById(1);
            bookUpdate.setName("Test Book Name");
            bookUpdate.setAuthorId(2);
            bH.updateBook(bookUpdate);

            Book bookId = bH.getBookById(1);
            Author authorID = ah.getAuthorById( bookId.getAuthorId() );
            System.out.println("ID book = " + bookId.getId() + " Название Книги "
                    + bookId.getName() + " Автор Книги " + authorID.getName() + " " + authorID.getLastName());

            ah.addAuthorAutoGeneration(10);
        }
    }
}
