package pipeline;

/**
 * @author ZhaoWeiLong
 * @since 2021/7/16
 */
public class ClientTest {

  public static void main(String[] args) {
    PipeLine<String, String> pipeLine =
        new PipeLine<String, String>(new FileProcessHandler())
            .addHandler(new CharacterFilterHandler())
            .addHandler(new CharacterReverseHandler());

    String execute = pipeLine.execute("C:\\Users\\37424\\Documents\\demo.txt");

    System.out.println(execute);

  }
}
