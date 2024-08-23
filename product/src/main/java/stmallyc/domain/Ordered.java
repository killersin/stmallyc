package stmallyc.domain;

import java.util.*;
import lombok.*;
import stmallyc.domain.*;
import stmallyc.infra.AbstractEvent;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer qty;
    private String productName;
    private String productid;
    private Date orderDt;
    private String status;
    private String address;
    private String userId;
}
