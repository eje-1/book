package com.example.book.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_release")
    private String releaseDay;

    @ManyToMany(mappedBy = "booksRelese", fetch = FetchType.LAZY)
    private List<Author> authorList;

    public Book() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book(String bookName, String releaseDay) {
        this.bookName = bookName;
        this.releaseDay = releaseDay;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
}
