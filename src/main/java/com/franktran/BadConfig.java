package com.franktran;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DBConfig.class, LogConfig.class, QueueConfig.class})
public class BadConfig {
}
