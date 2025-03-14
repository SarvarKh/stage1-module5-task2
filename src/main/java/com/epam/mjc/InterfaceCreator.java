package com.epam.mjc;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> list.stream().map(i -> i / divider).collect(Collectors.toList());
    }
}
