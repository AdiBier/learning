package com.example.learning.step2.service;

import com.example.learning.model.MultiplicationDto;
import org.springframework.stereotype.Service;

@Service
public class Step2Service {

  public String testMe() {
    return "I've been tested!";
  }

  public Integer add(Integer valA, Integer valB) {
    return valA + valB;
  }

  public Integer square(Integer valA) {
    return valA * valA;
  }

  public void multiply(MultiplicationDto multiplicationDto){
    multiplicationDto.setResult(multiplicationDto.getValA() * multiplicationDto.getValB());
  }
  // UWAGA: zauwaz, ze metoda nic nie zwraca, ale jednak dziala
  // JAVA ma 2 sposoby przekazywania danych: przez wartosc i referencje
  // Przez wartosc przekazywane sa dane dla typow prymitywnych i prostych (int, Integer, String, etc)
  // Przez referencje przekazywane sa obiekty inne niz typy proste, czyli w tym przypadku powyzsze DTO
  // Przy przekazaniu przez referencje nie jest przesylany tak na prawde caly obiekt, tylko jego
  // adres w pamieci. Kazda operacja nastepnie jest wykonywana na tej samej instancji obiektu w pamieci.
  // Dlatego pomimo braku returna zmiany w multiplicationDto widac tez na zewnatrz
}
