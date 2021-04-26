package Strategy;

/**
 * @author ZhaoWeiLong
 * @date 2021/4/26
 **/
public class Context {

  private Strategy strategy=null;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public void doStrategy() {
    strategy.strategyImplementation();
  }
}
