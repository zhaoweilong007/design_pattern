package Strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author ZhaoWeiLong
 * @date 2021/4/26
 */
@AllArgsConstructor
public class Context {

  @Setter private Strategy strategy;

  public void doStrategy() {
    strategy.strategyImplementation();
  }
}
