package com.ruixun.bootstudy.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

@ControllerAdvice("com.ruixun.bootstudy.controller")
public class GlobleException {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String globleEx(Exception ex){
        String message = ex.getMessage();
        return message;
    }
}
