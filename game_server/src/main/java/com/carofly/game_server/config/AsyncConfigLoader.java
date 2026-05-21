//WID(12/5/2026)(Sarthak Mittal)(DegamieSign)#1.1/1s.1.1.1.1,1.1.1.1.1
package com.carofly.game_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
//import shaded_package.io.netty.util.concurrent.ThreadPoolTaskExecutor;


@Component
@EnableAsync
public class AsyncConfigLoader {
    @Bean(name="taskExecutor")
    public ThreadPoolTaskExecutor Asyncexecutor (ThreadPoolTaskExecutor executor){//ThreadPoolExector Method declare
        executor.initialize();//initializing executor
        executor.setThreadNamePrefix("AsyncThreadName-");//setting  executor's ThreadNamePrefix
        //Queue Capacity ,max and core poolSize declare
        executor.setQueueCapacity(150);

        executor.setMaxPoolSize(100);
        executor.setCorePoolSize(5);
        return executor;
    }

    public AsyncConfigLoader(AsyncConfigLoader asyncConfigLoader){
        this.asyncConfigLoader=asyncConfigLoader;
    }
    public  AsyncConfigLoader getAsyncConfigLoader(AsyncConfigLoader asyncConfigLoader) {

        return asyncConfigLoader;
    }

    public void setAsyncConfigLoader(AsyncConfigLoader asyncConfigLoader){this.asyncConfigLoader=asyncConfigLoader;}//binding AsyncConfig Loader in App
    public AsyncConfigLoader asyncConfigLoader;
//    public void updateByAsyncConfigLoader(AsyncConfigLoader asyncConfigLoader){
//        getAsyncConfigLoader(asyncConfigLoader)+setAsyncConfigLoader(asyncConfigLoader)+1;
//    }





}
//    public AsyncConfigLoader(ThreadPoolTaskExecutor Asyncexecutor) {
//        this.Asyncexecutor=Asyncexecutor;
//    }
//
//    public ThreadPoolTaskExecutor getAsyncexecutor(Object o) {
//        return Asyncexecutor;
//    }
//
//    public void setExecutor(ThreadPoolTaskExecutor executor){this.executor=executor;}//Binding Executor in App
//    public static ThreadPoolTaskExecutor executor;
//    public void existsByexecutor(ThreadPoolTaskExecutor executor){
//        if(executor.isRunning()!=false)getAsyncexecutor(null);
//        else getAsyncexecutor(null);
//    }

