package ru.turvendiz.currencyconverter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Quote {

    private String type;

    private Value value;
}
