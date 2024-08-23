package stmallyc.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmallyc.infra.AbstractEvent;

@Data
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
