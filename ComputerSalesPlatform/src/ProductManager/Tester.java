package ProductManager;

import Enums.Brand;
import Enums.InstrumentClass;
import Enums.InstrumentSize;
import Enums.InstrumentType;

public class Tester {
    public static void main(String[] args) {
        // 建立产品仓库
        initializeInventory();

        //设置搜索条件
        InstrumentSpec whatBryanLikes = new InstrumentSpec()
                .setInstrumentClass(InstrumentClass.SERVER)
                .setBrand(Brand.HP);


        //搜索
        Inventory.searchFor(whatBryanLikes);

    }

    private static Inventory initializeInventory() {
        Inventory inventory = new Inventory();

        InstrumentSpec aDesktop = getSampleDesktop();
        inventory.addInstrument("11277", 3999.95, aDesktop);

        InstrumentSpec anotherInstrument = getAnotherInstrument();
        inventory.addInstrument("V95693", 1499.95, anotherInstrument);

        InstrumentSpec instrument1 = getAnotherInstrument(InstrumentClass.SERVER);
        inventory.addInstrument("70108276", 2295.95, instrument1);

        return inventory;
    }

    private static InstrumentSpec getAnotherInstrument() {
        return new InstrumentSpec()
                .setBrand(Brand.DELL)
                .setInstrumentType(InstrumentType.COMPUTER)
                .setInstrumentSize(InstrumentSize.FIFTEENPFOUR)
                .setInstrumentClass(InstrumentClass.LAPTOP);
    }

    private static InstrumentSpec getAnotherInstrument(InstrumentClass instrumentclass) {
        return new InstrumentSpec()
                .setBrand(Brand.HP)
                .setInstrumentType(InstrumentType.COMPUTER)
                .setInstrumentSize(InstrumentSize.SIXTEEN)
                .setInstrumentClass(InstrumentClass.SERVER);
    }

    private static InstrumentSpec getSampleDesktop() {
        return new InstrumentSpec()
                .setBrand(Brand.MSI)
                .setInstrumentType(InstrumentType.COMPUTER)
                .setInstrumentSize(InstrumentSize.FOURTEENPONE)
                .setInstrumentClass(InstrumentClass.DESKTOP);
    }
}
