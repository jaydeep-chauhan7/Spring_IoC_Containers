package com.infy.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

//this class is configuration class which provide spring bean and where to locate bean in project
//


@Configuration
@ComponentScan(basePackages="com.infy.bean")
public class SpringConfig {

}