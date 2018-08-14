package config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mjh
 * @date 2018/8/14 21:56
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue testQueue() {
        return new Queue("rabbitTestMsg");
    }
}
