package ProductManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    private static List<Instrument> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }
//此处体现SRP
    public void addInstrument(String serialNumber, double price,
                              InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    public Instrument getBySerialNumber(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    private static List<Instrument> search(InstrumentSpec searchSpec) {
        return inventory.stream()
                .filter(instrument -> instrument.getSpec().matches(searchSpec))
                .collect(Collectors.toList());
    }
//此处体现SRP
    public static void searchFor(InstrumentSpec inputSpec) {

        List<Instrument> matchingInstruments = search(inputSpec);

        if (matchingInstruments.isEmpty()) {
            System.out.println("对不起，您想要的电脑这里没有.");
            return;
        }

        System.out.println("以下商品符合您的要求:");
        matchingInstruments.forEach(Instrument::printIntro);
    }
}
