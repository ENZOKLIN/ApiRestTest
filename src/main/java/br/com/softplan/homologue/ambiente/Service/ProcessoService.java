package br.com.softplan.homologue.ambiente.Service;

import br.com.softplan.homologue.ambiente.Model.Processo;
import br.com.softplan.homologue.ambiente.Repository.ProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProcessoService {

    @Autowired
    private ProcessoRepository repository;

    public Optional<Processo> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Processo> findAll(){
        return repository.findAll();
    }
}
