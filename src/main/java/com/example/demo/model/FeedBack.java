package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "feedback")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long productId;

    private String value;

    private int numberLike;

    private int numberDislike;
}
