package com.huobanbengkui.controller;

import com.huobanbengkui.properties.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @PostMapping("/addGirls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }

        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());


        return ResultUtil.success(girlRepository.save(girl));
    }

    @GetMapping("/getGirl/{id}")
    public Girl findGirl(@PathVariable Integer id) {
        return girlRepository.findByAge(id).get(0);
    }

//    public Girl girlUpdate(@PathVariable("id") Integer id,
//                           @RequestParam("cupSize") String cupSize,
//                           @RequestParam("age") Integer age) {

}
