package cn.itcast.zeus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by tmh0214 on 17/6/21.
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cn.itcast.zeus.dao.mapper") // 自动扫描  mapper
public class ZeusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeusApplication.class, args);
    }
}


