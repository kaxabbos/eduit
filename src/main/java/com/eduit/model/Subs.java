package com.eduit.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Subs {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String file;
    private String spec;
    private byte modules;
    private String time;
    private String complexity;
    @Column(length = 5000)
    private String description;

    @OneToMany(mappedBy = "sub", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Purchased> purchased;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Statics statics;

    public Subs(String name, String file, String spec, byte modules, String time, String complexity, String description) {
        this.name = name;
        this.file = file;
        this.spec = spec;
        this.modules = modules;
        this.time = time;
        this.complexity = complexity;
        this.description = description;
        this.statics = new Statics(this);
    }
}
