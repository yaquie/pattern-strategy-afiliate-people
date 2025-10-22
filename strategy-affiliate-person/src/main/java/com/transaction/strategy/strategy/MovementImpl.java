package com.transaction.strategy.strategy;

import org.springframework.stereotype.Component;

@Component("MOVEMENT")
public class MovementImpl implements OperationStrategy{
  @Override
  public String execute(String ruc) {
    return "Ver detalle de factura";
  }
}
