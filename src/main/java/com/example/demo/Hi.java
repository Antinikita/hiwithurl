package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class Hi {
    @GetMapping
    static String Hi(){
        return "Hello World";
    }

    @GetMapping("/q")
    public ArrayList<Integer> gaaaa(@RequestParam int id) {
        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < id; i+=2) {
            int ab = 1;
            ab+=i;
            a.add(ab);
        }
        return a;
    }
    @GetMapping("/random")
    public Double random(@RequestParam int id) {
        double a = Math.random()*id+1;
        while (a>1){
            a/=10;
        }
        return (double)a;
    }
    //0.0 1.0
    @GetMapping("/time")
    public String time() {
        Date date = new Date();
        int a=1;
        int b=0;
        while (a<date.getDate()){
            a+=7;
            b+=1;
        }
        return String.valueOf(b);
    }
    @GetMapping("/Fibo")
    public String fibo(@RequestParam int id) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0,1);
        a.add(1,1);
        for (int i = 2; i<id; i++) {
            int b =a.get(i-2)+a.get(i-1);
            a.add(i,b);
        }
        return String.valueOf(a.get(id-1));
    }
    @GetMapping("/reverse")
    public String reverse(@RequestParam String id) {
        StringBuilder sb = new StringBuilder(id);
        sb.reverse();
        return sb.toString();
    }

}
//hashlist and arraylist and api
