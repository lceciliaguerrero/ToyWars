package com.lceciliacifpfbmoll.programing.toyWars.controller;

import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.*;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Action;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.RenderType;
import com.lceciliacifpfbmoll.programing.toyWars.service.GameService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/get/{uuid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class RestToyWarsAplication {
    // antes de los get
    //Atributo
    GameService gameService;

    //Constructores (alt+insertar)
    public RestToyWarsAplication(GameService gameService) {
        this.gameService = gameService;
    }


    //-----------------------------------------------------------------------------------------------------------------
    //----------------------------------->> Methods package dataClass GameService <<-----------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //Methods insertData
    //---->> user <<----
    //addUser();
    @GetMapping("/openNewUser")
    public List<User> addUser(
            @RequestParam(name = "addUserFirstNamePersona", required = false, value = "firstNamePersona", defaultValue = "Laura") String firstNamePersonaRest,
            @RequestParam(name = "addUserLastNamePersona", required = false, value = "lastNamePersona", defaultValue = "Cecilia Guerrero") String lastNamePersonaRest,
            @RequestParam(name = "addUserAgePersona", required = false, value = "egePersona", defaultValue = "20") String agePersonaRest,
            @RequestParam(name = "addUserMobilePhoneNumberPersona", required = false, value = "mobilePhoneNumberPersona", defaultValue = "111111111") String mobilePhoneNumberPersonaRest,
            @RequestParam(name = "addUserEmailPersona", required = false, value = "emailPersona", defaultValue = "laura@ejemplo.com") String emailPersonaRest,
            @RequestParam(name = "addUserGeneroPersona", required = false, value = "generoPersona", defaultValue = "femenino") String generoPersonaRest,
            @RequestParam(name = "addUserKeyUser", required = false, value = "keyUser", defaultValue = "laura2021") String keyUserRest,
            @RequestParam(name = "addUserNameToyUser", required = false, value = "nameToyUser", defaultValue = "Bulbasaur") String nameToyUserRest,
            @RequestParam(name = "addUserGenderToyUser", required = false, value = "genderToyUser", defaultValue = "masculino") String genderToyUserRest,
            @RequestParam(name = "addUserToysTypeToyUser", required = false, value = "toysTypeToyUser", defaultValue = "pokemon") String toysTypeToyUserRest) {
        gameService.setUserRest(new User(firstNamePersonaRest, lastNamePersonaRest,
                agePersonaRest, mobilePhoneNumberPersonaRest, emailPersonaRest,
                generoPersonaRest, keyUserRest, nameToyUserRest, genderToyUserRest, toysTypeToyUserRest));
        return gameService.getUsersRest();
    }

    //addFullUser();
    @PostMapping("/newUser")
    public List<User> addFullUser(@ModelAttribute User user) {
        if (user != null) {
            gameService.setUserRest(user);
        }
        return gameService.getUsersRest();
    }


    //---->> toy <<----
    //addToy();
    @GetMapping("/openNewToy")
    public List<Toy> addToy(
            @RequestParam(name = "addToyName", required = false, value = "name", defaultValue = "Bulbasaur") String nameRest,
            @RequestParam(name = "addToyGender", required = false, value = "gender", defaultValue = "masculino") String genderRest,
            @RequestParam(name = "addToyToysType", required = false, value = "toysType", defaultValue = "pokemon") String toysTypeRest) {
        gameService.setToyRest(new Toy(nameRest, genderRest, toysTypeRest));
        return gameService.getToysRest();
    }

    //addToyAction();
    @GetMapping("/openNewToy")
    public List<Toy> addToyAction(
            @RequestParam(name = "addToyAction", required = false, value = "action", defaultValue = "pokemon") String actionRest) {
        gameService.setToyRest(new Toy(actionRest));
        return gameService.getToysRest();
    }

    //addFullToy();
    @PostMapping("/newToy")
    public List<Toy> addFullToy(@ModelAttribute Toy toy) {
        if (toy != null) {
            gameService.setToyRest(toy);
        }
        return gameService.getToysRest();
    }




    //Methods printData
    //getUsers()
    public List<User> getUsers() {
        return gameService.getUsersRest();
    }

    //getToys();
    @GetMapping("/listToys")
    public List<Toy> getToys() {
        return gameService.getToysRest();
    }

    //getUserActions();
    @GetMapping("/listUserActions")
    public List<UserAction> getUserActions() {
        return gameService.getUserActionsRest();
    }

    //getEstatuses();
    @GetMapping("/listEstatuses")
    public List<Estatus> getEstatuses() {
        return gameService.getEstatusesRest();
    }



    // para acceder a los datos


    /*@GetMapping("/getAction")
    public List<Action> getActionsRest() {
        Toy toy = new Toy();
        return toy.getAction();
    }*/

    @PostMapping("/new")
    public void newRest(@ModelAttribute Toy toy) {
        addFullToy(toy);
        toy.resetear();
    }
     // /rest/render/JSON
    @GetMapping("/render/{mode}")
    public String renderRest(@PathVariable RenderType renderType) {
        return renderType.toString();
    }

    /*@PostMapping("/do/{action}")  //rest/do/{action}
    public String doRest(@PathVariable Action action) {
        //return gameService.getUserActions();
        return gameService.doAction(action);
    }*/

    @PostMapping("/do/{action}")  //rest/do/{action}
    public void doRest(@PathVariable Action action) {
        /*return gameService.getUserActions();*/
        gameService.doAction(action);
    }

    @GetMapping("/getCurrentStatus")
    public void getCurrentStatusRest() {
    }

    @GetMapping("/getStats")
    public List<Estatus> getStatsRest() {
        return null;
    }

//JSON, HTML, CONSOLE, ERROR =DINAMICOS ¿COMO DECIRLE? ANOTACIÓN@PATHVARIABLE RENDERTYPE RENDER

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
