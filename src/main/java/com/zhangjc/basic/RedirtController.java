package com.zhangjc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by YJ on 2018/1/10.
 */
@Controller
public class RedirtController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","张建冲");
        return "index";
    }

}
