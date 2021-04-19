package decorator;

/**
 * 装饰器模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/8
 */
public class DecoratorDemo {

  public static void main(String[] args) {
    System.out.println("初始化执行");

    // 买一个普通 的煎饼
    Pancake battercake = new Battercake();
    System.out.println(battercake.getDesc() + "花费：" + battercake.cost());
    System.out.println("=======================");
    // 买一个加两个鸡蛋的煎饼果子
    Pancake doubleEgg = new Battercake();
    doubleEgg = new Egg(doubleEgg);
    doubleEgg = new Egg(doubleEgg);
    System.out.println(doubleEgg.getDesc() + ",花费：" + doubleEgg.cost());
    System.out.println("=======================");

    // 加火腿和鸡蛋煎饼
    Pancake battercekePlus = new Battercake();
    battercekePlus = new Egg(battercekePlus);
    battercekePlus = new Sausage(battercekePlus);
    System.out.println(battercekePlus.getDesc() + ",花费：" + battercekePlus.cost());
  }
}
