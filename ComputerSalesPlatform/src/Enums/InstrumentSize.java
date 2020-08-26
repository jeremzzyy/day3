package Enums;

public enum InstrumentSize {
    ELEVEN, ELEVENPSIX, FOURTEENPONE ,FIFTEEN ,FIFTEENPFOUR ,SIXTEEN;

    public String toString() {
        switch(this) {
            case ELEVEN: return "11英寸及以下";
            case ELEVENPSIX: return "11.6英寸";
            case FOURTEENPONE: return "14.1英寸";
            case FIFTEEN: return "15英寸";
            case FIFTEENPFOUR: return "15.4英寸";
            case SIXTEEN: return "16英寸";
            default:       return "unspecified";
        }
    }
}