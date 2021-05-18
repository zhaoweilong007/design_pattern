package state;

/**
 * 状态实现类A
 * @author ZhaoWeiLong
 * @date 2021/5/18
 **/
public class ConcreateStateA extends State{

  /**
   * 处理
   */
  @Override
  public void handler1() {
    System.out.println("handler1 执行。。。。");
  }

  /**
   * 切换状态到B,执行B的任务
   */
  @Override
  public void handler2() {
    super.contextState.setCurrentState(ContextState.CONCREATE_STATE_B);
    super.contextState.handler2();
  }
}
