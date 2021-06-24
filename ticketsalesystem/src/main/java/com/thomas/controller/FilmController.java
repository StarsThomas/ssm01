package com.thomas.controller;


import com.thomas.service.FilmService;
import com.thomas.vo.FilmDetailVo;
import com.thomas.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping("home")
    public String filmList(Model model){
        List<FilmVo> list = filmService.selectAll();
        model.addAttribute("filmList",list);
        return "home";
    }

    @RequestMapping("filmDetail")
    public String filmDetail(String film_id,Model model){
        FilmDetailVo detailVo = filmService.selectFilmById(film_id);
        model.addAttribute("detailVo",detailVo);
        return "detail";
    }


}
