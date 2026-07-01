package com.smartcommunity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 智慧社区管理系统启动类
 *
 * @author Smart Community Team
 * @since 2024-01-01
 */
@SpringBootApplication
@MapperScan("com.smartcommunity.mapper")
public class SmartCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartCommunityApplication.class, args);
        System.out.println("========================================");
        System.out.println("  智慧社区管理系统启动成功！");
        System.out.println("  访问地址: http://localhost:8087/api");
        System.out.println("========================================");
    }
}