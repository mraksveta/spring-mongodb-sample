package com.github.mraksveta.mongodb.demo.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Order {
    @Id
    private String id;
    private LocalDateTime localDateTime;
    private List<Item> items;
}
