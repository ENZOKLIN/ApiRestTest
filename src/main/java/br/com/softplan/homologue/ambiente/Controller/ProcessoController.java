package br.com.softplan.homologue.ambiente.Controller;

import br.com.softplan.homologue.ambiente.Model.Processo;
import br.com.softplan.homologue.ambiente.Service.ProcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class ProcessoController {

    @Autowired
    private ProcessoService service;

    @GetMapping("/processId={id}")
    public Optional<Processo> processById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/allProcess")
    public List<Processo> allProcess(){
        return service.findAll();
    }

}
