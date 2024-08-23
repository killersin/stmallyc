package stmallyc.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmallyc.config.kafka.KafkaProcessor;
import stmallyc.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StockIncresed'"
    )
    public void wheneverStockIncresed_NotifyToWatingUsers(
        @Payload StockIncresed stockIncresed
    ) {
        StockIncresed event = stockIncresed;
        System.out.println(
            "\n\n##### listener NotifyToWatingUsers : " + stockIncresed + "\n\n"
        );

        // Sample Logic //
        Order.notifyToWatingUsers(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ShippingReturned'"
    )
    public void wheneverShippingReturned_UpdateStatus(
        @Payload ShippingReturned shippingReturned
    ) {
        ShippingReturned event = shippingReturned;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + shippingReturned + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCompleted'"
    )
    public void wheneverDeliveryCompleted_UpdateStatus(
        @Payload DeliveryCompleted deliveryCompleted
    ) {
        DeliveryCompleted event = deliveryCompleted;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + deliveryCompleted + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
