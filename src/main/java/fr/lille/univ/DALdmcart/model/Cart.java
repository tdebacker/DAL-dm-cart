package fr.lille.univ.DALdmcart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    private List<Article> articles;

    public Cart(Long id) {
        this.id = id;
    }

}
