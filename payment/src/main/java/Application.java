import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;
import sun.misc.BASE64Decoder;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:Arvin.Wang@hrx.ai">Arvin Wang</a>
 * @version  05/01/2018 12:03
 */
@EnableAutoConfiguration
@ComponentScan("com.huirongxing")
public class Application {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * main.
   *
   * @param   args  String[]
   *
   * @throws  Exception  exception
   */
  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);

  }
}
