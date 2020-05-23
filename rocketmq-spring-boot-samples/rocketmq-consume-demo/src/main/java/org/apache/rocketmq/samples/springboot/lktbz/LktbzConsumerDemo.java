package org.apache.rocketmq.samples.springboot.lktbz;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(topic = "${lktbz.rocketmq.topic}",consumerGroup="lktbz-string")
public class LktbzConsumerDemo  implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("消费端接收到的消息是"+s);
    }
}
