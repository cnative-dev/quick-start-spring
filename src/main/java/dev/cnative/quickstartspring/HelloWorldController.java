package dev.cnative.quickstartspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jingsi <lookisliu@gmail.com>
 * Created on 2022-08-10
 */
@Controller
public class HelloWorldController {
    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "hello cnative";
    }
}
