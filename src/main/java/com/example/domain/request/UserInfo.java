package com.example.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private Integer id;

    private String name;

    private Integer age;
}
