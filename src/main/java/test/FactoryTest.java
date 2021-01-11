package test;

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
public class FactoryTest {

  // 抽象产品
  public interface KeyBoard {
    void input();
  }

  public interface Mouse {
    void click();
  }

  // 具体产品
  public class MacKeyBorad implements KeyBoard {

    @Override
    public void input() {
      System.out.println("mac 专用键盘");
    }
  }

  public class MacMouse implements Mouse {

    @Override
    public void click() {
      System.out.println("mac 专用鼠标");
    }
  }

  public class WinKeyBorad implements KeyBoard {

    @Override
    public void input() {
      System.out.println("win 专用键盘");
    }
  }

  public class WinMouse implements Mouse {

    @Override
    public void click() {
      System.out.println("win 专用鼠标");
    }
  }

  public interface Harduare {
    KeyBoard createkeyBoard();

    Mouse createMouse();
  }

  public class MacFactory implements Harduare {

    @Override
    public KeyBoard createkeyBoard() {
      return new MacKeyBorad();
    }

    @Override
    public Mouse createMouse() {
      return new MacMouse();
    }
  }

  public class WinFactory implements Harduare {

    @Override
    public KeyBoard createkeyBoard() {
      return new WinKeyBorad();
    }

    @Override
    public Mouse createMouse() {
      return new WinMouse();
    }
  }

  {
    MacFactory macFactory = new MacFactory();
    KeyBoard keyBoard = macFactory.createkeyBoard();
    Mouse mouse = macFactory.createMouse();

    keyBoard.input();
    mouse.click();

    WinFactory winFactory = new WinFactory();
    winFactory.createkeyBoard().input();
    winFactory.createMouse().click();
  }

  public static void main(String[] args) {
    new FactoryTest();
  }
}
