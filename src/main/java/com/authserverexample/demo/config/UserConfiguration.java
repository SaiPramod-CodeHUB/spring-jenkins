package com.authserverexample.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("sai").password("webpass").roles("USER","ADMIN")
                .authorities("CAN_READ","CAN_WRITE").and().withUser("ashok").password("pass").roles("MANGER")
                .authorities("CAN_READ","CAN_WRITE");
    }

}
