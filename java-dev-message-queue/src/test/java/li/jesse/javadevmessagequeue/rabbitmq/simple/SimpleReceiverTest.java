package li.jesse.javadevmessagequeue.rabbitmq.simple;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RabbitListener(queuesToDeclare = @Queue("ww"))
@Component
public class SimpleReceiverTest {

    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
        System.out.println("wow");
    }

}
