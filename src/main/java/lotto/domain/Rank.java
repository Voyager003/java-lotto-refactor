package lotto.domain;

import java.util.Arrays;

public enum Rank {

    NOTHING(0,0,0),
    FIFTH(3,0,5000),
    FOURTH(4,0,50000),
    THIRD(5,0,1500000),
    SECOND(5,1,30000000),
    FIRST(6,0,2000000000);

    private final int quantity;
    private final int bonusquantity;
    private final int price;

    Rank(int quantity, int bonusquantity, int price) {
        this.quantity = quantity;
        this.bonusquantity = bonusquantity;
        this.price = price;
    }

}
