package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xchunzhao on 02/05/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/{empno}", method = RequestMethod.GET)
    public List<City> findByEmpno(@PathVariable int empno) {
        return cityService.findCityByName(empno);
    }

}
