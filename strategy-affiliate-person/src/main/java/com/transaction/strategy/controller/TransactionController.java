package com.transaction.strategy.controller;


import com.transaction.strategy.model.Request;
import com.transaction.strategy.service.TransactionStrategyContext;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/manage")
public class TransactionController {

  private final TransactionStrategyContext strategyContext;

  @PostMapping("/transaction")
  public String operation(@RequestBody Request request){
    System.out.println("request-body: " + request);
    return strategyContext.procesarOperacion(request);
  }


}
