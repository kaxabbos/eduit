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
public class Teachers {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String file;
    private String tel;
    @Column(length = 5000)
    private String spec;
    @Column(length = 5000)
    private String ach;
    private byte exp;
    private String email;
    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Purchased> purchased;

    public Teachers(String name, String file, String tel, String ach, String spec, byte exp, String email) {
        this.name = name;
        this.file = file;
        this.tel = tel;
        this.ach = ach;
        this.spec = spec;
        this.exp = exp;
        this.email = email;
    }
}
