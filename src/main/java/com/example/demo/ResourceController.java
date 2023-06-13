package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResourceController {

     @Autowired
     CtsEmployeeDetails ctsEmployeeDetails;

     @Autowired
     ComcastEmployeeDetails comcastEmployeeDetails;


    @GetMapping("/addNumbers/{num1}/{num2}")
    public int calculateTwoNumbers(@PathVariable int num1, @PathVariable int num2) {
        int result = num1 + num2;
        System.out.println("result " + result);
        return result;
    }

    @GetMapping("/prime/number/{primeNum}")
    public String primNumberOrNot(@PathVariable int primeNum) {
        return "It's a prime number";
    }

    @GetMapping("Reverse/String/{stringName}")
    public StringBuilder reverseString(@PathVariable String stringName){
        StringBuilder s1 = new StringBuilder(stringName);
        s1.reverse();
        System.out.println("Reversed String:"+" "+s1);
        return s1;
    }

    @GetMapping("/methodaccess")
    public void reverseString1(){
       // CtsEmployeeDetails c1 = new CtsEmployeeDetails();
       // c1.empDetails();
        ctsEmployeeDetails.empDetails();
    }

    @GetMapping("/methodaccess2")
    public void newComcastEmp(){
        comcastEmployeeDetails.empDetails();
    }

    @GetMapping("/stringlength")
    public int empLength(@RequestParam("Stringlength") String Stringlength){
        int result = comcastEmployeeDetails.empLength(Stringlength);
        return result;
    }

    @PostMapping("/students/details")
    public void saveStudent(@RequestBody StudentDetails sJson) {
        System.out.println(sJson.getAge() + " " + sJson.getName());
    }
}
