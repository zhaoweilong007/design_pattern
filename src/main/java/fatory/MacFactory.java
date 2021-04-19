package fatory;

/**
 * 具体工厂
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class MacFactory implements Harduare{

  @Override
  public KeyBoard createkeyBoard() {
    return new MacKeyBorad();
  }

  @Override
  public Mouse createMouse() {
    return new MacMouse();
  }
}
