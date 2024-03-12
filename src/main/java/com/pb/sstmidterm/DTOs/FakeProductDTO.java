package com.pb.sstmidterm.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProductDTO {
    private long id;
    private long userId;
    private String date;
    private Product[] products;
}
