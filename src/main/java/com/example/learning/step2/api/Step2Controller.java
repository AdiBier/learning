package com.example.learning.step2.api;

import com.example.learning.model.MultiplicationDto;
import com.example.learning.step2.service.Step2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/step2")
public class Step2Controller {

  @Autowired
  private Step2Service step2Service;

  @RequestMapping(value = "/testMe", method = RequestMethod.GET)
  public String testMe() {
    return step2Service.testMe();
  }

  @RequestMapping(value = "add", method = RequestMethod.GET)
  public Integer add(@RequestParam("valA") Integer valA, @RequestParam("valB") Integer valB) {
    return step2Service.add(valA, valB);
  }

  @RequestMapping(value = "/square/{valA}", method = RequestMethod.GET)
  public Integer square(@PathVariable("valA") Integer valA) {
    return step2Service.square(valA);
  }

  @RequestMapping(value = "/multiply", method = RequestMethod.POST)
  public MultiplicationDto multiply(@RequestBody MultiplicationDto multiplicationDto) {
    step2Service.multiply(multiplicationDto);
    return multiplicationDto;
  }
}
