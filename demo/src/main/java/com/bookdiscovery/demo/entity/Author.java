package com.bookdiscovery.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="author_id")
    private int authorId;

    @Column(name="author_name")
    private String authorName;

    @Column(name="author_followers")
    private String authorFollowers;

    @Column(name="author_description")
    private String authorDescription;

    @Column(name="author_image")
    private String authorImage;

    @OneToMany(mappedBy="author", cascade=CascadeType.ALL)
    private List<Book> book;



    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorFollowers='" + authorFollowers + '\'' +
                ", authorDescription='" + authorDescription + '\'' +
                ", authorImage='" + authorImage + '\'' +
                '}';
    }
}
