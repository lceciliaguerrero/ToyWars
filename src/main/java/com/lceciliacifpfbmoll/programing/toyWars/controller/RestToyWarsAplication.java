package com.lceciliacifpfbmoll.programing.toyWars.controller;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.*;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Action;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.RenderType;
import com.lceciliacifpfbmoll.programing.toyWars.service.GameService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//application.properties
//spring.mvc.view.suffix=.html

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


/*    @GetMapping("/openNewUserToy")
    public List<User> addUserToy(
            @RequestParam(name = "addUserNameToyUser", required = false, value = "nameToyUser", defaultValue = "Bulbasaur") String nameToyUserRest,
            @RequestParam(name = "addUserGenderToyUser", required = false, value = "genderToyUser", defaultValue = "masculino") String genderToyUserRest,
            @RequestParam(name = "addUserToysTypeToyUser", required = false, value = "toysTypeToyUser", defaultValue = "pokemon") String toysTypeToyUserRest) {
        gameService.setUserRest(new User(nameToyUserRest, genderToyUserRest, toysTypeToyUserRest));
        return gameService.getUsersRest();
    }*/

    //addFullUser();
    @PostMapping("/newUser")
    public boolean addFullUser(@ModelAttribute User user) {
       /* if (user == null || StringUtils.isEmpty(user.getFirstNamePersona()) ||
                StringUtils.isEmpty(user.getLastNamePersona()) ||
                user.getAgePersona().equals
                StringUtils.isEmpty(user.)
                //StringUtils.isEmpty(user.getMobilePhoneNumberPersona()) ||
                //StringUtils.isEmpty(user.getEmailPersona()) ||
                //StringUtils.isEmpty(user.getGeneroPersona().toString()) ||
                //StringUtils.isEmpty(user.getKeyUser())
        ) {
            return false;
        }*/

        ToyWars.USERS_LINKED_LIST.add(user);
        gameService.setUserRest(user);
        return true;
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
    @GetMapping("/openNewToyAction")
    public List<Toy> addToyAction(
            @RequestParam(name = "addToyAction", required = false, value = "action", defaultValue = "pokemon") String actionRest) {
        gameService.setToyActionRest(new Toy(actionRest));
        return gameService.getToysRest();
    }

    //addFullToy();
    @PostMapping("/newToy")
    public boolean addFullToy(@ModelAttribute Toy toy) {
        /*if (toy == null ||
                StringUtils.isEmpty(toy.getGender().toString()) ||
                StringUtils.isEmpty(toy.getName()) ||
                StringUtils.isEmpty(toy.getToysType().toString()) ||
                StringUtils.isEmpty(toy.getAction().toString())) {
            return false;
        }*/
        ToyWars.TOYS_LINKED_LIST.add(toy);
        gameService.setToyRest(toy);
        gameService.getToysRest();
        return true;
    }

    @PostMapping("/newToyAction")
    public boolean addFullToyAction(@ModelAttribute Toy toy) {
        /*if (toy == null ||
                StringUtils.isEmpty(toy.getGender().toString()) ||
                StringUtils.isEmpty(toy.getName()) ||
                StringUtils.isEmpty(toy.getToysType().toString()) ||
                StringUtils.isEmpty(toy.getAction().toString())) {
            return false;
        }*/
        ToyWars.TOYS_LINKED_LIST.add(toy);
        gameService.setToyActionRest(toy);
        gameService.getToysRest();
        return true;
    }




    //Methods printData
    //getUsers()
    @GetMapping("/listUsers")
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



    //-----------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    // para acceder a los datos


    @GetMapping("/getAction")
    public List<Action> getActionsRest() {
        return gameService.getActionRest();
    }/**/

    @PostMapping("/new")
    public void newRest(@ModelAttribute Toy toy) {
        addFullToy(toy);
        toy.resetear();
    }
     // /rest/render/JSON
   /* @GetMapping("/render/{mode}")
    public String renderRest(@PathVariable RenderType renderType) {
        return renderType.toString();
    }*/

    @GetMapping("/render/{mode}")
    public void renderRest(@PathVariable RenderType mode) {
        gameService.getToy().doRender(mode);
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
    public Estatus getCurrentStatusRest() {
        return gameService.getStatus();
    }

    @GetMapping("/getStats")
    public List<Estatus> getStatsRest() {
        return gameService.getEstatusesRest();
    }
    //JSON, HTML, CONSOLE, ERROR =DINAMICOS ¿COMO DECIRLE? ANOTACIÓN@PATHVARIABLE RENDERTYPE RENDER

}
