package cn.app.controller;

import cn.app.domain.Emp;
import cn.app.service.IEmpService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private IEmpService empService;

    @RequestMapping("/getAllEmp")
    public ModelAndView getAllEmp(HttpServletRequest request, HttpServletResponse response){
        List<Emp> allEmp = empService.getAllEmp();
        String result = JSON.toJSONString(allEmp);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("emp");
        mv.addObject("emp",allEmp.get(0));
        return mv;
    }

    @RequestMapping("/getOneEmp")
    public ModelAndView getOneEmp(short id,HttpServletRequest request, HttpServletResponse response){
        Emp emp = empService.getEmp(id);
        ModelAndView mv = new ModelAndView();
        System.out.println(emp);
        //mv.setViewName("emp");
        mv.addObject("emp",emp);
        mv.setView(new MappingJackson2JsonView());
        return mv;
    }
}
