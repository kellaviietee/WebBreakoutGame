package com.niilo.webbreakout.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class HighScore {
    @Id
    @GeneratedValue
    private Long id;
    private Integer score;
    @ManyToOne(cascade = CascadeType.ALL)
    private Player player;
}
