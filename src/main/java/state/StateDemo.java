package state;

/**
 * @author ZhaoWeiLong
 * @date 2021/5/18
 */
public class StateDemo {

  public static void main(String[] args) {

    ContextState contextState = new ContextState();
    ConcreateStateA stateA = new ConcreateStateA();
    contextState.setCurrentState(stateA);

    contextState.handler1();
    contextState.handler2();
  }
}
