package com.nttdata.customer.model.document;

import com.nttdata.customer.model.document.types.EnterpriseCustomer;
import com.nttdata.customer.model.document.types.PersonalCustomer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.utility.nullability.MaybeNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customers")
@ApiModel
public class Customer {
    @Transient
    public static final String SEQUENCE_NAME = "customer_sequence";
    @Id
    @ApiModelProperty(position = 1)
    private long idCustomer;
    @ApiModelProperty(example = "Lima")
    private String city;
    @ApiModelProperty(example = "false", dataType = "boolean")
    private Boolean deleteState;
    @ApiModelProperty("Av. Example 000 Los Olivos")
    private String address;
    @ApiModelProperty(example = "personal")
    private String type;//personal or enterprise
    @MaybeNull
    private EnterpriseCustomer enterpriseCustomer;
    @MaybeNull
    private PersonalCustomer personalCustomer;

}

