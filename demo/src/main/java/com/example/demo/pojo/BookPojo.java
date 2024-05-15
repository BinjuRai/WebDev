package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.aspectj.bridge.IMessage;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookPojo {
    private Integer id;
    @NotEmpty(message = "Date is required")
    private String bookDate;
    @NotEmpty(message = "Time is required")
    private String bookTime;
    @NotEmpty(message = "Booking Status is required")
    private String bookStatus;
    @NotNull(message="Ground ID is required")
    private Integer ground_id;
    @NotNull(message = "User is required")
    private Integer user_id;
}
