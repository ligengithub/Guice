package com.demo.inject.app;

import com.demo.inject.log.LogImpl;
import com.demo.inject.user.UserServiceImpl;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * @author ligen
 * @title: ApplicationImpl
 * @projectName ingect
 * @description:
 * @date 2019/12/1617:28
 */
public class ApplicationImpl implements Application {

    @Inject
    private UserServiceImpl userService;

    @Inject
    private LogImpl log;

    private static Injector injector;


//    @Inject
//    public void myApp(UserServiceImpl userService,LogImpl log){
//        this.userService = userService;
//        this.log = log;
//    }


    public void test() {
        userService.sayHello();

        UserServiceImpl userService2 = new UserServiceImpl();
        userService2.sayHello();

        log.writeLog();
    }
}
