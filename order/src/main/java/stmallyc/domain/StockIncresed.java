package stmallyc.domain;

import java.util.*;
import lombok.*;
import stmallyc.domain.*;
import stmallyc.infra.AbstractEvent;

@Data
@ToString
public class StockIncresed extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;
    private Date registerDt;
    private String status;
}
