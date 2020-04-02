package br.com.softplan.homologue.ambiente.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Processo {

    @Id
    @Column(unique = true, name = "id")
    private Integer nmbrProcess;

    @Column(name = "detalhes")
    private String detailsProcess;


}
