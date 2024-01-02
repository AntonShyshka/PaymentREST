package com.kronus.paymentrest.OpenFeing.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.kronus.openfeing.proxy")
public class ProxyConfig {
}
