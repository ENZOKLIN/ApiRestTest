package br.com.softplan.homologue.ambiente.Repository;

import br.com.softplan.homologue.ambiente.Model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Integer> {

    List<Processo> findAll();

}
