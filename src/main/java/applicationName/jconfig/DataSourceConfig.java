package applicationName.jconfig;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/7/19 0019.
 */
@Configuration
@ImportResource({
        "classpath:conf/database-hibernate.xml"
})

public class DataSourceConfig {

    @Bean("dataSource")
    public DataSource dataSource(@Value("${applicationName.database.driver}") String driver,
                                 @Value("${applicationName.database.url}") String url,
                                 @Value("${applicationName.database.username}") String username,
                                 @Value("${applicationName.database.password}") String password) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);        dataSource.setUsername(username);

        dataSource.setPassword(password);
        return dataSource;
    }

}
