package com.nttdata.customer.model.document.types;

import lombok.Data;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "customers")
public class EnterpriseCustomer{
    @Transient
    public static final String SEQUENCE_NAME = "enterprise_sequence";
    private String businessName;
    private String ruc;
    private List<HoldersEnterprise> holders;
}
