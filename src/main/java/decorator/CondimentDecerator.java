package decorator;

/**
 * 包装器 实现对普通煎饼的包装
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public abstract class CondimentDecerator extends Pancake{

  Pancake pancake;

  public CondimentDecerator(Pancake pancake){
    this.pancake = pancake;
  }

  @Override
  public abstract String getDesc();
}
