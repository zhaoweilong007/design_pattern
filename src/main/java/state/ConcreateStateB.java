package state;

/**
 * 状态实现类B
 *
 * @author ZhaoWeiLong
 * @date 2021/5/18
 */
public class ConcreateStateB extends State {

  @Override
  public void handler1() {
    super.contextState.setCurrentState(ContextState.CONCREATE_STATE_A);
    super.contextState.handler1();
  }

  @Override
  public void handler2() {
    System.out.println("handler2 执行。。。。");
  }
}
