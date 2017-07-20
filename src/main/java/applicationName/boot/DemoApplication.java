package applicationName.boot;

import applicationName.jconfig.DemoApplicationConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * The Labrador Manage API Application
 * Created by Dai Wentao on 2017/5/10.
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
@EnableWebMvc
//使得此类可以被访问，而且是直接返回字符串
@RestController
//@Import(DatabaseConfig.class)


@Import(DemoApplicationConfig.class)
public class DemoApplication {
    //@Value${}可以从配置文件中取值
    @Value("${name}")
    private String a;
    @Value("${person.age}")
    private String b;


    @RequestMapping("/")
    public String home(){
        return "Hello:"+a+":"+b;
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.run(args);
    }

}
