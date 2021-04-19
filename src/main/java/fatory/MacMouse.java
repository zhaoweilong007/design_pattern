package fatory;

/**
 * 具体产品
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class MacMouse implements Mouse {

  @Override
  public void click() {
    System.out.println("mac专用鼠标");
  }
}
