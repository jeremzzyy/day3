package Enums;

public enum Brand {
    LENOVO, THINKPAD, HUAWEI, DELL, HP, MICROSOFT, HASEE, MSI;

    public String toString() {
        switch(this) {
            case LENOVO:   return "联想";
            case THINKPAD:   return "ThinkPad";
            case HUAWEI:   return "华为";
            case DELL: return "戴尔";
            case HP:    return "惠普";
            case MICROSOFT:     return "微软";
            case HASEE :     return "神舟";
            case MSI :     return "微星";
            default:       return "Unspecified";
        }
    }
}
