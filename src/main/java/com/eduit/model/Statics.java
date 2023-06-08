package com.eduit.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Statics {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Subs sub;
    private int countNow;
    private int countComplete;

    public Statics(Subs sub) {
        this.sub = sub;
        this.countNow = 0;
        this.countComplete = 0;
    }
}
