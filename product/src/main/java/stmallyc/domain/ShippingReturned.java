package stmallyc.domain;

import java.util.*;
import lombok.*;
import stmallyc.domain.*;
import stmallyc.infra.AbstractEvent;

@Data
@ToString
public class ShippingReturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String productName;
    private Integer qty;
    private Date deliveyDt;
    private String status;
}
