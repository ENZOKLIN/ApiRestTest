package br.com.softplan.homologue.ambiente.Controller;

import br.com.softplan.homologue.ambiente.Model.Processo;
import br.com.softplan.homologue.ambiente.Service.ProcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class ProcessoController {

    @Autowired
    private ProcessoService service;

    @GetMapping("/processId={id}")
    @ResponseBody
    public Optional<Processo> processById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/allProcess")
    @ResponseBody
    public List<Processo> allProcess() {
        return service.findAll();
    }

    @GetMapping("/register/process")
    public ModelAndView cadastroProcess() {
        ModelAndView modelAndView = new ModelAndView("add");
        Processo processo = new Processo();
        modelAndView.addObject(processo);
        return modelAndView;
    }

    @PostMapping("/register/process")
    public Object addProcess(Processo processo, BindingResult result, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("messageFailure", "Processo não pode ser cadastrado!");
            return "redirect:/register/process";
        }
        service.saveProcess(processo);
        return "redirect:/register/process";
    }
}
