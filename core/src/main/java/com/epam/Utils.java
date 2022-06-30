package com.epam;

import com.norbert.UtilApp.StringUtils;

import java.util.Arrays;

class Utils {

    Utils() {
    }

    public static boolean isAllPositiveNumbers(String... text) {
//        for (String symbol : text) {
//            if (!StringUtils.isPositiveNumber(symbol)) {
//                return false;
//            }
//        }
//        return true;
        return Arrays.stream(text).allMatch(StringUtils::isPositiveNumber);

    }
}
