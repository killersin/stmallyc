package stmallyc.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmallyc.infra.AbstractEvent;

@Data
public class ShippingReturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String productName;
    private Integer qty;
    private Date deliveyDt;
    private String status;
}
