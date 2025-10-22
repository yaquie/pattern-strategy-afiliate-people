package com.transaction.strategy.service;

import com.transaction.strategy.factory.OperationFactory;
import com.transaction.strategy.model.Request;
import com.transaction.strategy.strategy.OperationStrategy;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionStrategyContext {

  private final OperationFactory factory;

  public String procesarOperacion(Request request) {
    OperationStrategy strategy = factory.getStrategy(request.getOperation());
    return strategy.execute(request.getRuc());
  }
}
