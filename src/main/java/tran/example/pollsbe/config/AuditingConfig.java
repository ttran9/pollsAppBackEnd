package tran.example.pollsbe.config;

import tran.example.pollsbe.security.UserPrincipal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class AuditingConfig {
    @Bean
    public AuditorAware<Long> auditorProvider() {
        return new SpringSecurityAuditAwareImpl();
    }
}
