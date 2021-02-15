package com.lceciliacifpfbmoll.programing.toyWars.controller;

import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.*;
import com.lceciliacifpfbmoll.programing.toyWars.service.GameService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/rest")
public class RestToyWarsAplication {
    @PostMapping("/getActions")
    public void getActionsRest() {

    }

    @PostMapping("/new")
    public void newRest(@ModelAttribute Toy toy) {
        addFullToy(toy);
        toy.resetear();
    }

    @PostMapping("/render")
    public void renderRest() {

    }

    @PostMapping("/do/{action}")  //rest/do/{action}
    public String doRest(@PathVariable Action action) {
        /*return gameService.getUserActions();*/
        return gameService.doAction(action);
    }
    @GetMapping("/getCurrentStatus")
    public void getCurrentStatusRest() {
    }

    @PostMapping("/getStats")
    public List<Estatus> getStatsRest() {
        return null;
    }



    /*@PostMapping("/newUser")
    public List<User> addFullUser() {

    }*/


    /*@PostMapping("/newCliente")
    public List<Cliente> setFullCliente(@ModelAttribute Cliente cliente) {
        if (cliente != null) {
            serviceJavaClassesSecondEvaluationUnitFifth.addCliente(cliente);
        }
        return serviceJavaClassesSecondEvaluationUnitFifth.getClientes();
    }*/
}
