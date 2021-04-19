package decorator;

/**
 * 加火腿的包装
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class Sausage extends CondimentDecerator{

  public Sausage(Pancake pancake) {
    super(pancake);
  }

  @Override
  public String getDesc() {
    return pancake.desc+"加火腿";
  }

  @Override
  public Double cost() {
    return pancake.cost()+1;
  }
}
