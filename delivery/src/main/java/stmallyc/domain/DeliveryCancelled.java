package stmallyc.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallyc.domain.*;
import stmallyc.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String productName;
    private Integer qty;
    private Date deliveyDt;
    private String status;

    public DeliveryCancelled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
