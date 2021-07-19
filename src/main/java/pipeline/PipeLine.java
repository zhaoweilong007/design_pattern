package pipeline;

/**
 * @author ZhaoWeiLong
 * @since 2021/7/16
 */
public class PipeLine<I, O> {

  private final Handler<I, O> currentHandler;

  PipeLine(Handler<I, O> handler) {
    this.currentHandler = handler;
  }

  <K> PipeLine<I, K> addHandler(Handler<O, K> newHandler) {
    return new PipeLine<>(input -> newHandler.process(currentHandler.process(input)));
  }

  O execute(I input) {
    return currentHandler.process(input);
  }
}
