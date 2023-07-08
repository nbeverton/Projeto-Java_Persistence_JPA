package modelo.muitospramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name =  "filmes")
public class Filme {

    private Long id;
    private String nome;
    private Double nota;

    @ManyToMany
    @JoinTable(
            name = "atores_filmes",
            joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id")
    )
    private List<Ator> atores = new ArrayList<>();

    public Filme() {
    }

    public Filme(String nome, Double nota) {
        super();
        this.nome = nome;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
}