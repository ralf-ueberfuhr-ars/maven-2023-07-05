package de.ars.schulung.maven;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Car {

    private int year;
    private String type;

}
