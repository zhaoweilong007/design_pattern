package pipeline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ZhaoWeiLong
 * @since 2021/7/16
 **/
public class CharacterFilterHandler implements Handler<String,String>{

  @Override
  public String process(String input) {
    System.out.println("===字符过滤===");
    List<String> hello = Stream.of(input).filter(s -> s.contains("hello")).collect(Collectors.toList());
    return String.join("",hello);
  }
}
