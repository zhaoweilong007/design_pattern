package test;

/**
 * 装饰器模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/8
 */
public class DecoratorTest {

  public abstract class Pancake {

    {
      System.out.println("执行普通煎饼的初始化代码块");
    }

    public String description = "普通煎饼";

    public String getDescription() {
      return description;
    }

    public abstract double cost();
  }

  public class Battercake extends Pancake {
    {
      System.out.println("执行煎饼果子的代码块");
    }

    @Override
    public double cost() {
      return 8;
    }

    public Battercake() {
      description = "煎饼果子";
    }
  }

  public abstract class CondimentDecerator extends Pancake {

    {
      System.out.println("执行调味料的代码块");
    }

    protected Pancake pancake;

    public CondimentDecerator(Pancake pancake) {
      System.out.println("执行调味料的构造方法：");
      this.pancake = pancake;
    }

    @Override
    public abstract String getDescription();
  }

  public class Egg extends CondimentDecerator {

    {
      System.out.println("执行加鸡蛋的代码块");
    }

    public Egg(Pancake pancake) {
      super(pancake);
      System.out.println("执行加鸡蛋的构造方法");
    }

    @Override
    public double cost() {
      return pancake.cost() + 1;
    }

    @Override
    public String getDescription() {
      return pancake.getDescription() + "加鸡蛋";
    }
  }

  public class SauSage extends CondimentDecerator {

    {
      System.out.println("执行加火腿的代码块");
    }

    public SauSage(Pancake pancake) {
      super(pancake);
      System.out.println("执行加火腿的构造方法");
    }

    @Override
    public double cost() {
      return pancake.cost() + 2;
    }

    @Override
    public String getDescription() {
      return pancake.getDescription() + "加火腿";
    }
  }

  public static void main(String[] args) {
    DecoratorTest test = new DecoratorTest();
  }

  {
    System.out.println("初始化执行");

    // 买一个普通 的煎饼
    Pancake battercake = new Battercake();
    System.out.println(battercake.getDescription() + "花费：" + battercake.cost());
    System.out.println("=======================");
    // 买一个加鸡蛋的煎饼果子
    Pancake doubleEgg = new Battercake();
    doubleEgg = new Egg(doubleEgg);
    System.out.println("=======================");
    doubleEgg = new Egg(doubleEgg);
    System.out.println(doubleEgg.getDescription() + ",花费：" + doubleEgg.cost());
    System.out.println("=======================");

    // 加火腿和鸡蛋煎饼
    Pancake battercekePlus = new Battercake();
    battercekePlus = new Egg(battercekePlus);
    battercekePlus = new SauSage(battercekePlus);
    System.out.println(battercekePlus.getDescription() + ",花费：" + battercekePlus.cost());
  }
}
