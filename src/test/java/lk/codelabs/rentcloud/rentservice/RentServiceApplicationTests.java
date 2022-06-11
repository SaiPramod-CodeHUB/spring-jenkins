package lk.codelabs.rentcloud.rentservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RentServiceApplicationTests {

    public static org.slf4j.Logger Logger = LoggerFactory.getLogger(RentServiceApplication.class);

    @Test
    public void contextLoads() {
        Logger.info("Test case  executed...");
        assertEquals(true,true);
    }

}
