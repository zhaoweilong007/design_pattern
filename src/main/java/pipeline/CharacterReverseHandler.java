package pipeline;

/**
 * @author ZhaoWeiLong
 * @since 2021/7/16
 **/
public class CharacterReverseHandler implements Handler<String,String>{

  @Override
  public String process(String input) {
    System.out.println("===反转字符串===");
    return new StringBuilder(input).reverse().toString();
  }
}
