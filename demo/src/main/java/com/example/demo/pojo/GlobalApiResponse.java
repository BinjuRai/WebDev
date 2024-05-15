package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GlobalApiResponse {
    private Integer status;
    private String message;
    private String data;
}
