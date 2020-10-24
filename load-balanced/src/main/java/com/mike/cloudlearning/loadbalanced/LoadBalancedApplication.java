package com.mike.cloudlearning.loadbalanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.mike.cloudlearning.loadbalanced.config.RibbonConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "ping-a-server", configuration = RibbonConfiguration.class)
public class LoadBalancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancedApplication.class, args);
	}
	
	@LoadBalanced
	 @Bean
	 public RestTemplate getRestTemplate(){
	 return new RestTemplate();
	 }

}
