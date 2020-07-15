package com.jojoldu.book.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // 메인클래스에 있던 JPA Auditing 활성화를 여기서 실행
public class JpaConfig {
}
