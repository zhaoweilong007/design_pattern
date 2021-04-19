package fatory;

/**
 * 具体工厂实现
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class WinFactory implements Harduare{

  @Override
  public KeyBoard createkeyBoard() {
    return new WinKeyBorad();
  }

  @Override
  public Mouse createMouse() {
    return new WinMouse();
  }
}
