package com.furkan.springframework.qualifier4class;

@QualifierMultiple2(EMultipleAlternative.FIRST)
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM FIRST: " + data;
    }
}
