package stmallyc.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "MyPage_table")
@Data
public class MyPage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String orderId;
    private String userId;
    private String productName;
    private String productId;
    private String orderStatus;
    private String deliveryStatus;
    private Integer qty;
    private Date orderDt;
}
