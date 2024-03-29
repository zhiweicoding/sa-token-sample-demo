package com.pj.config;

import cn.dev33.satoken.config.SaTokenConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author by diaozhiwei on 2022/07/15.
 * @email diaozhiwei2k@163.com
 */
@Configuration
public class StpConfig {

    //方式一 better
//    @Autowired
//    public void configSaToken(SaTokenConfig config) {
//        // config.setTokenName("satoken333");             // token名称 (同时也是cookie名称)
//        // ...
//    }


    //方式二
    // 获取配置Bean (以代码的方式配置Sa-Token, 此配置会覆盖yml中的配置)
//    @Bean
//    @Primary
//    public SaTokenConfig getSaTokenConfigPrimary() {
//        SaTokenConfig config = new SaTokenConfig();
//        config.setTokenName("satoken");             // token名称 (同时也是cookie名称)
//        config.setTimeout(30 * 24 * 60 * 60);       // token有效期，单位s 默认30天
//        config.setActivityTimeout(-1);              // token临时有效期 (指定时间内无操作就视为token过期) 单位: 秒
//        config.setIsConcurrent(true);               // 是否允许同一账号并发登录 (为true时允许一起登录, 为false时新登录挤掉旧登录)
//        config.setIsShare(true);                    // 在多人登录同一账号时，是否共用一个token (为true时所有登录共用一个token, 为false时每次登录新建一个token)
//        config.setTokenStyle("uuid");               // token风格
//        config.setIsLog(false);                     // 是否输出操作日志
//        return config;
//    }
}
