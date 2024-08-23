package stmallyc.domain;

import java.util.*;
import lombok.*;
import stmallyc.domain.*;
import stmallyc.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private String productid;
    private Integer qty;
    private Date orderDt;
    private String status;
    private String userId;
    private String address;
}
