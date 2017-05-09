package xzfm.core;

import org.springframework.context.annotation.Import;
import xzfm.core.handler.init.InitializationConfigurationCenterToCache;
import xzfm.core.handler.task.AutoTaskFetchCache;
import xzfm.core.handler.task.AutoTaskUpdateCache;
import xzfm.core.handler.task.InitializationAutoTask;

import java.lang.annotation.*;

/**
 * Created by wangxizhong on 2017/5/8.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({
        InitializationConfigurationCenterToCache.class,
        InitializationAutoTask.class
})
public @interface EnableConfigurationCenterClient {

    boolean refresh() default true;//主动刷新

    int interval() default 3600;//second
}
