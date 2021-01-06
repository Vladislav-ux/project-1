package ru.spring.training;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component("classicalMusic")

public class ClassicalMusic implements Music{
    private List<String> classicalList = new ArrayList<>();
    {
        classicalList.add("Hungarian Rhapsody");
        classicalList.add("Symphony no. 5 in C Minor, op. 67");
        classicalList.add("Night on Bald Mountain");
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("init");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("dest");
    }
    @Override
    public List<String> getSong() {
        return classicalList;
    }

}
