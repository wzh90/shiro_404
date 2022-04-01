package app.controller;

import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/none")
@Validated
public class NoneController {
    @GetMapping("/test")
    public String test(@RequestParam @Min(10) Integer age) {
        return "age: " + age;
    }

}
