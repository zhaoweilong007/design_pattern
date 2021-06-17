package template;

/**
 * @author zhao_wei_long
 * @since 2021/6/17
 **/
public class Coffee extends Drinks {

  @Override
  public void brew() {
    System.out.println("冲咖啡");
  }

  @Override
  public void addCondiment() {
    System.out.println("加糖");
  }
}
