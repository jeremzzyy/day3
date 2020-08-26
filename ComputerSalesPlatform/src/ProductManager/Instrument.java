package ProductManager;
//此处体现SRP
public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

    String getDescription() {
        String brand = getOrDefault(spec.getBrand());
        String instrumentClass = getOrDefault(spec.getInstrumentClass());
        String instrumentSize = getOrDefault(spec.getInstrumentSize());
        String instrumentType = getOrDefault(spec.getInstrumentType());
        return brand + " " + instrumentClass +" "+instrumentSize+
                " " + instrumentType;
    }

    private String getOrDefault(Enum item) {
        return item == null ? "" : (item.toString() + " ");
    }

    String getPriceInfo() {
        return "  You can have this " +
                getOrDefault(spec.getBrand()) +
                getOrDefault(spec.getInstrumentClass()) +
                getOrDefault(spec.getInstrumentSize()) +
                getOrDefault(spec.getInstrumentType()) + "for $" +
                getPrice() + "\n---";
    }

    private String getIntro() {
        return this.getDescription() + "\n" +
                this.getPriceInfo();
    }

    public void printIntro() {
        System.out.println(getIntro());
    }
}
