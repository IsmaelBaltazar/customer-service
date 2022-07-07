package com.nttdata.customer.model.document.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Data
@AllArgsConstructor
public class HoldersEnterprise {
    @Transient
    public static final String SEQUENCE_NAME = "holders_sequence";
    @Id
    private Long id;
    private String name;
    private String lastname;
    private String dni;
}
