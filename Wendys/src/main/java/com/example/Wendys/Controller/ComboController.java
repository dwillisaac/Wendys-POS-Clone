package com.example.Wendys.Controller;

import com.example.Wendys.DAO.ComboDao;
import com.example.Wendys.Model.ComboItem;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ComboController {
    private final ComboDao comboDao;

    public ComboController(ComboDao comboDao) {
        this.comboDao = comboDao;
    }

    @RequestMapping(path="/combos", method = RequestMethod.GET)
    public List<ComboItem> getAllCombos(){
        return comboDao.getAllCombos();
    }
}
