package Strategy;

/**
 * @author ZhaoWeiLong
 * @date 2021/4/26
 **/
public class StrategyDemo {

  public static void main(String[] args) {
    StrategyImplA strategyImplA = new StrategyImplA();
    StrategyImplB strategyImplB = new StrategyImplB();

    Context context = new Context(strategyImplA);
    context.doStrategy();
    context.setStrategy(strategyImplB);
    context.doStrategy();

  }
}
