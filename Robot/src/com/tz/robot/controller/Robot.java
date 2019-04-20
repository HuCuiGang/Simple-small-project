package com.tz.robot.controller;



import com.tz.robot.service.QueryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Robot {
    @Autowired
    private QueryImpl query;

    @RequestMapping(value = "robot",method = RequestMethod.POST)
    @ResponseBody
    public String getResult(@RequestParam(value = "message") String message){
        String result = query.getMessage(message);
        System.out.println(message);
        System.out.println(result);
        return result;
    }

}
