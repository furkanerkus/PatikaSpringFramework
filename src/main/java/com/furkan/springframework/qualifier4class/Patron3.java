package com.furkan.springframework.qualifier4class;

@QualifierMultiple2(EMultipleAlternative.SECOND)
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM SECOND: " + data;
    }
}
