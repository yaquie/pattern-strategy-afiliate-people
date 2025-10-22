package com.transaction.strategy.strategy;

import org.springframework.stereotype.Component;

@Component("INVOICES")
public class InvoicesListImpl implements OperationStrategy{
  @Override
  public String execute(String ruc) {
    return "listando las facturas del ruc: " + ruc;
  }
}
