package cap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(Model model) {
        model.addAttribute("data", "SpringMVc 我是通过post提交的参数");
        return "test";
    }

    @RequestMapping("/test2")
    public void test2(Model model) {
        model.addAttribute("data", "SpringMVC Test2 我爱学习 我爱学习");
    }

    @RequestMapping("/test3")
    public ModelAndView test3() {
        ModelAndView modelAndView = new ModelAndView("test3");
        //modelAndView.setViewName("welcome");
        modelAndView.addObject("data", "SpringMVC Test3 我爱学习 我爱学习");
        return modelAndView;
    }

    @RequestMapping("/test4")
    public Map test4() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "这是第一条数据");
        map.put("key2", "这是第二条数据");
        return map;
    }


}
