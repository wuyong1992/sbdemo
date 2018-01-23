package com.wuyong.sbdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 日志测试
 */

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class LogTest {


    @Test
    public void test1() {
        log.trace("===TRACE===");
        log.debug("===debug===");
        log.warn("===warn===");
        log.info("===info===");
        log.error("===error===");
    }
}
