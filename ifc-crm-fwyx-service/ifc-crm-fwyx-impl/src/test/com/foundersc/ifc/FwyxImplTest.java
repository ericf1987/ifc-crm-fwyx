package com.foundersc.ifc;

import com.foundersc.ifc.base.FwyxImplApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author fengye
 * @Date 2020/3/25
 * @Time 15:32
 * @Desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = FwyxImplApplication.class)
@TestPropertySource(locations = "classpath:application-base.yml")
@Slf4j
public class FwyxImplTest {
}
