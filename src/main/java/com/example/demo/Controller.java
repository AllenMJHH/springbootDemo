package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/controller")
public class Controller {

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test() {
        System.out.println("hello");
        return "hello";
    }
    @RequestMapping(value = "mapTest")
    public void mapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aa");
        map.put("b", "bb");
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, Map<String, String>> mapMap = new HashMap<>();
        list.add(map);
        mapMap.put("aaa", map);
        Map<String, String> aaa = mapMap.get("aaa");
        aaa.put("a", "cc");
        System.out.println(map.toString());
        System.out.println(list.toString());
        System.out.println(mapMap.toString());
    }
}
