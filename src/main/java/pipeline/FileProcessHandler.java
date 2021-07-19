package pipeline;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author ZhaoWeiLong
 * @since 2021/7/16
 */
public class FileProcessHandler implements Handler<String, String> {

  @Override
  public String process(String path) {
    System.out.println("==========文件处理==========");
    try {
      return Files.readString(Paths.get(path), StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
