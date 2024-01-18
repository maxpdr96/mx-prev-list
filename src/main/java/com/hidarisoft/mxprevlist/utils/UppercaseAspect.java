package com.hidarisoft.mxprevlist.utils;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.CodeSignature;
import java.lang.reflect.Field;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UppercaseAspect {
    //TODO FIX THIS ANNOTATION
    @Before("@annotation(com.hidarisoft.mxprevlist.utils.IUppercaseAnnotation)")
    public void convertToUppercase(JoinPoint joinPoint) throws IllegalAccessException {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg != null) {
                for (Field field : arg.getClass().getDeclaredFields()) {
                    if (field.isAnnotationPresent(IUppercaseAnnotation.class) && field.getType().equals(String.class)) {
                        field.setAccessible(true);
                        String originalValue = (String) field.get(arg);
                        if (originalValue != null) {
                            field.set(arg, originalValue.toUpperCase());
                        }
                    }
                }
            }
        }
    }
}