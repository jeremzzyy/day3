package Enums;

public enum InstrumentType {
    COMPUTER;

    public String toString() {
        switch(this) {
            case COMPUTER:   return "电脑整机";
            default:       return "Unspecified";
        }
    }
}
