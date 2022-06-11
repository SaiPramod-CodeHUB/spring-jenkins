package lk.codelabs.rentcloud.rentservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EntityScan(basePackages = "lk.codelabs.rentcloud.model.rent")
public class RentServiceApplication {
    public static Logger Logger = LoggerFactory.getLogger(RentServiceApplication.class);
    @PostConstruct
    public void into(){
        Logger.info("Application Started...");
    }
    public static void main(String[] args) {
        Logger.info("Application executed...");
        SpringApplication.run(RentServiceApplication.class, args);
    }

}
