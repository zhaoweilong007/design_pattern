package decorator;

/**
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class Battercake extends Pancake{


  public Battercake(){
    desc = "煎饼果子";
  }

  @Override
  public Double cost() {
    return 8.0;
  }
}
