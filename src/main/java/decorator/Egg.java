package decorator;

/**
 * 加鸡蛋的包装
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class Egg extends CondimentDecerator{

  public Egg(Pancake pancake) {
    super(pancake);
  }

  @Override
  public String getDesc() {
    return pancake.getDesc()+"加鸡蛋";
  }

  @Override
  public Double cost() {
    return pancake.cost()+1;
  }
}
