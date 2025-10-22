package com.transaction.strategy.factory;

import com.transaction.strategy.strategy.OperationStrategy;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Component;

@Component
public class OperationFactory {

  private final Map<String, OperationStrategy> strategies;

  public OperationFactory(
      Map<String, OperationStrategy> strategies) {
    this.strategies = strategies;
  }


  public OperationStrategy getStrategy(String operationType) {
    System.out.println("test-operationType: " + operationType);
    OperationStrategy strategy = strategies.get(operationType);
    if (Objects.isNull(strategy)){
      throw new IllegalArgumentException("Operación no soportada: " + operationType);
    }
    return strategy;
  }
}
