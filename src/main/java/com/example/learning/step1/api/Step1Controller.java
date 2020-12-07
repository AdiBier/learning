package com.example.learning.step1.api;

import com.example.learning.model.MultiplicationDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/step1")
public class Step1Controller {

  @RequestMapping(value = "/testMe", method = RequestMethod.GET)
  public String testMe() {
    return "I've been tested!";
  }

  @RequestMapping(value = "add", method = RequestMethod.GET)
  public Integer add(@RequestParam("valA") Integer valA, @RequestParam("valB") Integer valB) {
    return valA + valB;
  }

  @RequestMapping(value = "/square/{valA}", method = RequestMethod.GET)
  public Integer square(@PathVariable("valA") Integer valA) {
    return valA * valA;
  }

  @RequestMapping(value = "/multiply", method = RequestMethod.POST)
  public MultiplicationDto multiply(@RequestBody MultiplicationDto multiplicationDto) {
    multiplicationDto.setResult(multiplicationDto.getValA() * multiplicationDto.getValB());
    return multiplicationDto;
  }
}
