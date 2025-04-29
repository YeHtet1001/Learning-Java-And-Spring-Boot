package org.example.securitycontextdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    /**
     * need to write userDetail and passwordEncoder in security config of spring boot
     */

    @Bean
    public UserDetailsService userDetailsService() {
        var user1 = User.withUsername("Admin")
                .password("12345").authorities("READ")
                .build();

        var user2 = User.withUsername("User")
                .password("12345").authorities("WRITE")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);

    }

    @Bean
    public PasswordEncoder passwordEncoder() {

        return NoOpPasswordEncoder.getInstance();

    }

}
