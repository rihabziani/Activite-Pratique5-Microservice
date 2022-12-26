package com.example.cqrseventsourcing.queries.dto;

import com.example.cqrseventsourcing.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class AccountOperationResponseDTO {
    private Long id;
    private Date operationDate;
    private BigDecimal amount;
    private OperationType type;
}