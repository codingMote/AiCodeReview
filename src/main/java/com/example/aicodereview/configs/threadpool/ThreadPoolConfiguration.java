package com.example.aicodereview.configs.threadpool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import com.example.aicodereview.common.ThreadPoolCommon.*;

/**
 * 线程池配置
 * 构建项目中所需的线程池
 */
@Configuration
public class ThreadPoolConfiguration {

    /**
     * llm聊天线程池
     * @return
     */
    @Bean(ThreadPoolName.CHAT_POOL_EXECUTOR)
    public ThreadPoolExecutor chatPoolExecutor(){

        //暂时工厂和拒绝策略用默认
        return new ThreadPoolExecutor(
                2,
                4,
                60L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue(5)
        );
    }
}
