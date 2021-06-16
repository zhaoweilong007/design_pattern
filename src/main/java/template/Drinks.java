package template;

/**
 * @author zhao_wei_long
 * @since 2021/6/16
 **/
public abstract class Drinks {

 public void boiledWater() {
    System.out.println("煮沸");
  }

  public void pourInCup() {
    System.out.println("倒进被子");
  }

  public abstract void brew();

  public abstract void addCondiment();

  public final void markDrinks() {
    boiledWater();

    brew();

    pourInCup();

    addCondiment();
  }
}
