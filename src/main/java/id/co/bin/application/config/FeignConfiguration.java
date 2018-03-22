package id.co.bin.application.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "id.co.bin.application")
public class FeignConfiguration {

}
