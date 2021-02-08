package com.lceciliacifpfbmoll.programing.toyWars.controller;

import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Estatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RestToyWarsAplication {
    @PostMapping("/getActions")
    public void getActionsRest() {
    }

    @PostMapping("/new")
    public void newRest() {
    }

    @PostMapping("/render")
    public void renderRest() {

    }

    @PostMapping("/do/[action]")
    public void doRest() {
    }

    @PostMapping("/getCurrentStatus")
    public void getCurrentStatusRest() {
    }

    @PostMapping("/getStats")
    public List<Estatus> getStatsRest() {
    }

}
