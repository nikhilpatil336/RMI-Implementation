package com.example.RMIServer.config;

import com.example.RMIServer.service.HelloWorldRMI;
import com.example.RMIServer.service.impl.HelloWorldRMIImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class Config {

    @Bean
    RemoteExporter registerRMIExporter(){

        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(2222);
        exporter.setServiceInterface(HelloWorldRMI.class);
        exporter.setServiceName("helloworldrmi");
        exporter.setService(new HelloWorldRMIImpl());
        return exporter;
    }

}
