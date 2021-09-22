package com.example.book.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "placeOfBirth")
    private String placeOfBirth;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "author_book", joinColumns = {@JoinColumn(name = "author_id", referencedColumnName = "id",
            nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false, updatable = false)})
    private List<Book> booksRelese;

    public Author() {

    }

    public Author(String firstName, String lastName, String birthday, String placeOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.placeOfBirth = placeOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public List<Book> getBooksRelese() {
        return booksRelese;
    }

    public void setBooksRelese(List<Book> booksRelese) {
        this.booksRelese = booksRelese;
    }
}
