package applicationName.jconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2017/7/19 0019.
 */
@Configuration
@PropertySource("classpath:properties/demoproject.properties")
@ComponentScan({"applicationName.zdm.controller"})
@Import(DataSourceConfig.class)
public class DemoApplicationConfig {


}
