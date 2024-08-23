package stmallyc.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallyc.domain.*;
import stmallyc.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockIncresed extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;
    private Date registerDt;
    private String status;

    public StockIncresed(Inventory aggregate) {
        super(aggregate);
    }

    public StockIncresed() {
        super();
    }
}
//>>> DDD / Domain Event
