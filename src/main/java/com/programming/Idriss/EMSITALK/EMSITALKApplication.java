package com.programming.Idriss.EMSITALK;

import com.programming.Idriss.EMSITALK.config.OpenAPIConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(OpenAPIConfiguration.class)
public class EMSITALKApplication {

    public static void main(String[] args) {
        SpringApplication.run(EMSITALKApplication.class, args);
    }

}
