import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Chen
 * Date: 13-12-2
 * Time: 下午4:28
 * To change this template use File | Settings | File Templates.
 */
public class Provider {


    public static void main(String[] args) throws Exception {
    	  AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:D:\\workspace\\x1-magazine-provider\\target\\classes\\applicationContext*.xml");
        context.start();
        synchronized (Provider.class) {
            while (true)
                try {
                    System.out.print("service is start");
                    Provider.class.wait();
                }
                catch (Throwable e)
                {
                	e.printStackTrace();
                }
        }

    }
}
