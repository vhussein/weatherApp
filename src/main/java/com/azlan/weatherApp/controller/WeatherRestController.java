package com.azlan.weatherApp.controller;

import com.azlan.weatherApp.model.User;
import com.azlan.weatherApp.model.Weather;
import com.azlan.weatherApp.service.UserService;
import com.azlan.weatherApp.service.WeatherService;
import com.azlan.weatherApp.service.WeatherServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class WeatherRestController {

    private static final Logger logger = LoggerFactory.getLogger(WeatherRestController.class);
 
//    @Autowired
//    UserService userService;  //Service which will do all data retrieval/manipulation work

    @Autowired
    WeatherService weatherService;  //Service to get the weather details from the API

    @RequestMapping(value = "/weather/{cityName}", method = RequestMethod.GET)
    public ResponseEntity<Weather> getWeatherDetails(@PathVariable("cityName") String cityName)
    {
        logger.info("Calling getWeatherDetails() method with " + cityName + " as param");
        Weather weather = weatherService.getWeather(cityName);

        if(weather.getCurrentObservation() == null)
        {
            logger.debug("NULL DATA RETURNED");
            return new ResponseEntity<Weather>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Weather>(weather, HttpStatus.OK);
    }
     
//    //-------------------Retrieve All Users--------------------------------------------------------
//
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    public ResponseEntity<List<User>> listAllUsers() {
//        List<User> users = userService.findAllUsers();
//        if(users.isEmpty()){
//            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
//        }
//        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//    }
//
//
//    //-------------------Retrieve Single User--------------------------------------------------------
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
//        System.out.println("Fetching User with id " + id);
//        User user = userService.findById(id);
//        if (user == null) {
//            System.out.println("User with id " + id + " not found");
//            return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
//        }
//        return new ResponseEntity<User>(user, HttpStatus.OK);
//    }
//
//
//
//    //-------------------Create a User--------------------------------------------------------
//
//    @RequestMapping(value = "/user/", method = RequestMethod.POST)
//    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
//        System.out.println("Creating User " + user.getName());
//
//        if (userService.isUserExist(user)) {
//            System.out.println("A User with name " + user.getName() + " already exist");
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }
//
//        userService.saveUser(user);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
//        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//    }
//
//
//    //------------------- Update a User --------------------------------------------------------
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user) {
//        System.out.println("Updating User " + id);
//
//        User currentUser = userService.findById(id);
//
//        if (currentUser==null) {
//            System.out.println("User with id " + id + " not found");
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
//
//        currentUser.setName(user.getName());
//        currentUser.setAge(user.getAge());
//        currentUser.setSalary(user.getSalary());
//
//        userService.updateUser(currentUser);
//        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
//    }
//
//    //------------------- Delete a User --------------------------------------------------------
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
//        System.out.println("Fetching & Deleting User with id " + id);
//
//        User user = userService.findById(id);
//        if (user == null) {
//            System.out.println("Unable to delete. User with id " + id + " not found");
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
//
//        userService.deleteUserById(id);
//        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
//    }
//
//
//    //------------------- Delete All Users --------------------------------------------------------
//
//    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
//    public ResponseEntity<User> deleteAllUsers() {
//        System.out.println("Deleting All Users");
//
//        userService.deleteAllUsers();
//        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
//    }
 
}