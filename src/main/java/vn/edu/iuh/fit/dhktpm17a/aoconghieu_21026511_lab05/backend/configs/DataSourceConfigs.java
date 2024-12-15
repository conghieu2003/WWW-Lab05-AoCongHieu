package vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.configs;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.session.JdbcSessionProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(JdbcSessionProperties.class)
public class DataSourceConfigs {
@Bean
@Primary
@ConfigurationProperties("spring.datasource")
@Qualifier("dataSource")
public DataSourceProperties dataSourceProperties() {
    return new DataSourceProperties();
}

@Bean
@Primary
public DataSource primaryDataSource(@Qualifier("dataSource") DataSourceProperties dataSourceProperties) {
    return dataSourceProperties
            .initializeDataSourceBuilder()
            .type(HikariDataSource.class)
            .build();
}

}
