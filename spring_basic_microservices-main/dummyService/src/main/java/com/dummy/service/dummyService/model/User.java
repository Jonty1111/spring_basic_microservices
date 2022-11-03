package com.dummy.service.dummyService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//dummy kind of thing with all member with no need of table annotation
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
}
