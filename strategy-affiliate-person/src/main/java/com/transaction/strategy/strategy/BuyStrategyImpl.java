package com.transaction.strategy.strategy;

import org.springframework.stereotype.Component;

@Component("BUYING")
public class BuyStrategyImpl implements OperationStrategy{
  @Override
  public String execute(String ruc) {
    return "Realizando la compra";
  }
}
