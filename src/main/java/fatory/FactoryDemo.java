package fatory;

/**
 * 工厂模式
 *
 * <p>简单工厂、、工厂方法、抽象工厂
 *
 * <p>只演示了抽象工厂的实现
 *
 * @author ZhaoWeiLong
 * @date 2021/1/8
 */
public class FactoryDemo {

  public static void main(String[] args) {

    MacFactory macFactory = new MacFactory();
    KeyBoard keyBoard = macFactory.createkeyBoard();
    Mouse mouse = macFactory.createMouse();

    keyBoard.input();
    mouse.click();

    WinFactory winFactory = new WinFactory();
    winFactory.createkeyBoard().input();
    winFactory.createMouse().click();
  }
}
