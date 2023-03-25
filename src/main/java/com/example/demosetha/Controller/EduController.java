package com.example.demosetha.Controller;

import com.example.demosetha.Model.EduModel;
import com.example.demosetha.Service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EduController {
    @Autowired
    private EduService eduService;
    @GetMapping("/eduinfo")
    public String eduInfo(Model model){
        List<EduModel> listEdu = eduService.getEduList();
        model.addAttribute("listedu",listEdu);
        return "/eduinfo";
    }
    @PostMapping("/save-edu")
    public String saveedu(@ModelAttribute("NEW_EDU") EduModel eduModel) {
        System.out.println("new edu is : "+eduModel);
        eduService.updateOrSaveEdu(eduModel);
        return "redirect:/eduinfo";
    }
    @GetMapping("/newedu")
    public String newedu(Model model){
        EduModel eduModel = new EduModel();
        model.addAttribute("NEW_EDU",eduModel);
        return "/newedu";
    }

    @GetMapping("/editedu/{id}")
    public ModelAndView editEdu(@PathVariable("id") long eduId) {
        //System.out.println("edit user by id "+id);
        EduModel EDIT = eduService.getEduById(eduId);
        ModelAndView mv = new ModelAndView("/editedu");
        mv.addObject("EDIT_EDU", EDIT);
        return mv;
    }
    @GetMapping("/deleteedu/{eduId}")
    public String deleteEdu(@PathVariable("eduId") long eduId) {
        eduService.deleteEduId(eduId);
            return "redirect:/eduinfo";
    }
//    @DeleteMapping("/edu/{id}")
//    public void delete(@PathVariable("id") long eduId) {
//        eduService.deleteEduId(eduId);
//    }

    @PostMapping("/updateedu")
    public String updateUser(@ModelAttribute("EDIT_EDU") EduModel eduModel){
        eduService.updateOrSaveEdu(eduModel);
        return "redirect:eduinfo";
    }

}
