package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WEIR
 * @date 12/2/2022 - 20:30
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    //路径中的占位符
    @RequestMapping(value = "/test/{id}")
    public String test01(@PathVariable("id")String id){
        System.out.println("id="+id);
        return "success";
    }
}
