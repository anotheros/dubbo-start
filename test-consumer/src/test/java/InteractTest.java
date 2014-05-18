import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mf.dubbo.service.TestService;

public class InteractTest {

    public static void main(String[] args) {
        long atime = System.currentTimeMillis();

        InteractTest test = new InteractTest();
        
//         test.testInteractInterface();
        test.testUserFavorite();
        
        long btime = System.currentTimeMillis();
        System.out.println(btime - atime);
    }

    
    private void testUserFavorite() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext_dubbo_test.xml" });
        context.start();
        TestService testService = (TestService) context.getBean("testService");
        testService.sayHello();
        System.out.println( testService.getStr());
       System.out.println(testService.sayWorld()); 
    }

    
}
