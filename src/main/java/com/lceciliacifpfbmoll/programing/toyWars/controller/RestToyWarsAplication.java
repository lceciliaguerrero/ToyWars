package com.lceciliacifpfbmoll.programing.toyWars.controller;

import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Action;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Estatus;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Toy;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.User;
import com.lceciliacifpfbmoll.programing.toyWars.service.GameService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Laura
 * Todo El método GET --> obtener y El método POST --> enviar
 * ---------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------
 * El método GET --> obtener
 * - GET se utiliza para solicitar datos de un recurso específico.
 * - GET es uno de los métodos HTTP más comunes.
 * ---------------------------------------------------------------------------------------------------------------
 * Algunas otras notas sobre las solicitudes GET:
 * * Las solicitudes GET se pueden almacenar en caché
 * * Las solicitudes GET permanecen en el historial del navegador
 * * Las solicitudes GET se pueden marcar
 * * Las solicitudes GET nunca deben usarse cuando se trata de datos sensibles
 * * Las solicitudes GET tienen restricciones de longitud
 * * Las solicitudes GET solo se utilizan para solicitar datos (no modificar)
 * ---------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------
 * El método POST --> enviar
 * - POST se utiliza para enviar datos a un servidor para crear / actualizar un recurso.
 * - POST es uno de los métodos HTTP más comunes.
 * ---------------------------------------------------------------------------------------------------------------
 * Algunas otras notas sobre las solicitudes POST:
 * * Las solicitudes POST nunca se almacenan en caché
 * * Las solicitudes POST no permanecen en el historial del navegador
 * * Las solicitudes POST no se pueden marcar
 * * Las solicitudes POST no tienen restricciones en la longitud de los datos
 */
@RestController
@RequestMapping(value = "/rest")
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

    @PostMapping("/do/{action}")  ///rest/do/{action}
    public void doRest() {
    }

    @PostMapping("/getCurrentStatus")
    public void getCurrentStatusRest() {
    }

    @PostMapping("/getStats")
    public List<Estatus> getStatsRest() {
        return null;
    }


    @GetMapping("/openNewUser")
    public List<User> addUser(
            @RequestParam(name = "addUserFirstNamePersona", required = false, value = "firstNamePersona", defaultValue = "Laura") String firstNamePersonaRest,
            @RequestParam(name = "addUserLastNamePersona", required = false, value = "lastNamePersona", defaultValue = "Cecilia Guerrero") String lastNamePersonaRest,
            @RequestParam(name = "addUserAgePersona", required = false, value = "egePersona", defaultValue = "20") String agePersonaRest,
            @RequestParam(name = "addUserMobilePhoneNumberPersona", required = false, value = "mobilePhoneNumberPersona", defaultValue = "111111111") String mobilePhoneNumberPersonaRest,
            @RequestParam(name = "addUserEmailPersona", required = false, value = "emailPersona", defaultValue = "laura@ejemplo.com") String emailPersonaRest,
            @RequestParam(name = "addUserGeneroPersona", required = false, value = "generoPersona", defaultValue = "femenino") String generoPersonaRest,
            @RequestParam(name = "addUserPasswordUser", required = false, value = "passwordUser", defaultValue = "laura2021") String passwordUserRest) {
        gameService.addUsser(new User(firstNamePersonaRest, lastNamePersonaRest,
                agePersonaRest, mobilePhoneNumberPersonaRest, emailPersonaRest,
                generoPersonaRest, passwordUserRest));
        return gameService.getUsers();
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
