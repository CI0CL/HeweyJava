CREATE DATABASE IF NOT EXISTS bookstore_jdbc_ex1;

USE bookstore_jdbc_ex1;

CREATE TABLE books
(
    id          SERIAL PRIMARY KEY,
    isbn        VARCHAR(13),
    title       VARCHAR(255),
    author      VARCHAR(255),
    price       DECIMAL(6, 2),
    location    VARCHAR(255)
);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'The Hunger Games', 'Suzanne Collins', '9780439023481', 5.09);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Harry Potter and the Order of the Phoenix', 'J.K. Rowling, Mary GrandPré (Illustrator)', '9780439358071', 7.38);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'To Kill a Mockingbird', 'Harper Lee', '9999999999999', 10.50);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Pride and Prejudice', 'Jane Austen, Anna Quindlen (Introduction)', '9999999999999', 8.95);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Twilight', 'Stephenie Meyer', '9780316015844', 2.1);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'The Book Thief', 'Markus Zusak (Goodreads Author)', '9780375831003', 3.8);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Animal Farm', 'George Orwell, Russell Baker (Preface), C.M. Woodhouse (Introduction)', '9780451526342', 4.42);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'The Chronicles of Narnia', 'C.S. Lewis, Pauline Baynes (Illustrator)', '9999999999999', 14.50);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'J.R.R. Tolkien 4-Book Boxed Set: The Hobbit and The Lord of the Rings', 'J.R.R. Tolkien', '9780345538376', 21.15);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Gone with the Wind', 'Margaret Mitchell', '9780446675536', 5.58);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'The Fault in Our Stars', 'John Green (Goodreads Author)', '9999999999999', 8.95);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'The Hitchhiker`s Guide to the Galaxy', 'Douglas Adams', '9999999999999', 12.21);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'The Giving Tree', 'Shel Silverstein', '9780060256654', 4.87);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Wuthering Heights', 'Emily Brontë, Richard J. Dunn (Editor), David Timson (Narrator), Charlotte Brontë (Commentary), Robert Heindel (Illustrator)', '9780393978896', 2.73);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'The Da Vinci Code', 'Dan Brown (Goodreads Author)', '9999999999999', 24.65);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Memoirs of a Geisha', 'Arthur Golden', '9781400096893', 2.76);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'The Picture of Dorian Gray', 'Oscar Wilde, Jeffrey Eugenides (Introduction)', '9999999999999', 11.98);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Alice`s Adventures in Wonderland & Through the Looking-Glass', 'Lewis Carroll, John Tenniel (Illustrator), Martin Gardner (Introduction)', '9780451527745', 3.07);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Jane Eyre', 'Charlotte Brontë, Michael Mason (Editor), Barnett Freedman (Illustrator)', '9780142437209', 5.46);
INSERT INTO books (id, title, author, isbn, price) VALUES (DEFAULT, 'Les Misérables', 'Victor Hugo, Lee Fahnestock (Translator), Norman MacAfee (Translator)', '9999999999999', 17.56);
