package com.example.janghakmoney.scholarship;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class ScholarshipRegionId implements Serializable {
    private Long scholarship;
    private int region;
}