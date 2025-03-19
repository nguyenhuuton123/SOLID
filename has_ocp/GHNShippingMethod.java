package com.codegym.has_ocp;

public class GHNShippingMethod implements Shipping{
    @Override
    public long calculateShippingFee() {
        return 6;
    }
}
