package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()  // Configura o que pode ser acessado
                .antMatchers("/", "/h2-console/**").permitAll()  // Permite o acesso à página inicial e ao console H2
                .anyRequest().authenticated()  // Exige login para outras páginas (se necessário)
                .and()
                .csrf().disable()  // Desabilita a proteção CSRF para permitir o acesso ao H2 Console
                .headers().frameOptions().disable();  // Permite o uso de frames (necessário para o H2 Console)

        return http.build();
    }
}
