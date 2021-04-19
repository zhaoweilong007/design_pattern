package responsibility;

/**
 * 责任链模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/11
 */
public class responsibilityDemo {

  public static void main(String[] args) {
    // 责任链模式其实就是一个灵活版的
    // if…else…语句，它就是将这些判定条件的语句放到了各个处理类中，这样做的优点是比较灵活了，
    // 但同样也带来了风险，比如设置处理类前后关系时，一定要特别仔细，
    // 搞对处理类前后逻辑的条件判断关系，并且注意不要在链中出现循环引用的问题
    ConCreateHandler1 handler1 = new ConCreateHandler1(1);
    ConCreateHandler2 handler2 = new ConCreateHandler2(2);
    ConCreateHandler3 handler3 = new ConCreateHandler3(3);

    handler1.setNextHandler(handler2);
    handler2.setNextHandler(handler3);

    handler1.handler(new Request(3));
  }
}
