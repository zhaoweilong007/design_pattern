package pipeline;

/**
 * @author ZhaoWeiLong
 * @since 2021/7/16
 */
@FunctionalInterface
public interface Handler<I, O> {

  O process(I input);
}
