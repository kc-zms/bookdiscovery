package com.bookdiscovery.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="book_id")
    private int bookId;

    @Column(name="book_title")
    private String bookTitle;

    @Column(name="book_description")
    private String bookDescription;

    @Column(name="release_date")
    private Date releaseDate;

    @Column(name="book_language")
    private String bookLanguage;

    @Column(name="review_count")
    private int reviewCount;

    @Column(name="book_rating")
    private Double bookRating;

    @Column(name="book_image")
    private String bookImage;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "user_book",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", releaseDate=" + releaseDate +
                ", bookLanguage='" + bookLanguage + '\'' +
                ", reviewCount=" + reviewCount +
                ", bookRating=" + bookRating +
                '}';
    }
}
