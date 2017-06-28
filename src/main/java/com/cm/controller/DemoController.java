package com.cm.controller;

import com.cm.pojo.Manager;
import com.cm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by GSY on 2017/6/28.
 */
@Controller
@RequestMapping
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/info",method = RequestMethod.GET )
    public String listManagerView( ModelMap modelMap, HttpSession session){
        List<Manager> data = demoService.getManager();
        //使用转发时使用如下代码
        //modelMap.addAttribute("lxrlist",data);
        //return "vlist";
        //使用重定向或session时使用如下代码
        session.setAttribute("info",data);
        return "redirect:/info.jsp";
    }


    @RequestMapping(value = "/register/{userName}/{upwd}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,String> register(@PathVariable String userName, @PathVariable String upwd){
        Manager myUsers = new Manager(userName,upwd);
        demoService.addUsers(myUsers);
        Map<String,String> data = new HashMap<String,String>();
        data.put("state","200");
        data.put("info","插入成功!");
        return data;
    }

}
