package template;

/**
 * @author zhao_wei_long
 * @since 2021/6/17
 **/
public class Tea extends Drinks {

  @Override
  public void brew() {
    System.out.println("冲茶叶");
  }

  @Override
  public void addCondiment() {
    System.out.println("加柠檬片");
  }
}
