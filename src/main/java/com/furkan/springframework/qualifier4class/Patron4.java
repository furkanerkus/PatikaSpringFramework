package com.furkan.springframework.qualifier4class;

@QualifierMultiple2(EMultipleAlternative.THIRD)
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM THIRD: " + data;
    }
}
