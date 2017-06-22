package cn.itcast.zeus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by tmh0214 on 17/6/21.
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ZeusApplication.class);
    }
}
