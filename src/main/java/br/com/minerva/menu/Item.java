package br.com.minerva.menu;

import java.math.BigDecimal;

public class Item {
    private final String name;
    private final double value;

    public Item(String name, double value) {
        if(isNameInvalid(name)) throw new ItemNameNotFilledException("Nome do produto deve ser preenchido");
        if(value <= BigDecimal.ZERO.doubleValue()) throw new ItemValueNotFilledException("Valor do produto não pode ser menor ou igual a Zero");
        this.name = name;
        this.value = value;
    }

    private boolean isNameInvalid(String name) {
        return name == null || name.isBlank();
    }

    public String getName() {
        return name;
    }
}
