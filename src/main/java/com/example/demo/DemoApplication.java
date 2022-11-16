package com.example.demo;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//plumelog-trace 提供链路日志
@ComponentScan({"com.plumelog","com.example.demo.controller"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * 接入prometheus
	 * @return
	 */
	@Bean
	MeterRegistryCustomizer<MeterRegistry> configure(){
		return registry -> registry.config().commonTags("application","helloPrometheus");
	}

}
