package com.example.payloads.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericBusinessResponse<T> {

    private String rc;
    private String msg;
    private T obj;
    private String processedAt;
}
