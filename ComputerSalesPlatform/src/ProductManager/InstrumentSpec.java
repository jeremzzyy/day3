package ProductManager;

import Enums.Brand;
import Enums.InstrumentClass;
import Enums.InstrumentSize;
import Enums.InstrumentType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
//此处体现SRP
public class InstrumentSpec {
    private Map<String, Object> properties = new HashMap<>();

    public InstrumentSpec() {

    }

    public Map<String, Object> getProperties() {
        return properties;
    }
    public Brand getBrand() {
        return (Brand) get("Brand");
    }

    public InstrumentSpec setBrand(Brand brand) {
        put(brand);
        return this;
    }

    public InstrumentType getInstrumentType() {
        return (InstrumentType) get("InstrumentType");
    }

    public InstrumentSpec setInstrumentType(InstrumentType instrumentType) {
        put(instrumentType);
        return this;
    }
    public InstrumentSize getInstrumentSize() {
        return (InstrumentSize) get("InstrumentSize");
    }

    public InstrumentSpec setInstrumentSize(InstrumentSize instrumentSize) {
        put(instrumentSize);
        return this;
    }

    public InstrumentClass getInstrumentClass() {
        return (InstrumentClass) get("InstrumentClass");
    }

    public InstrumentSpec setInstrumentClass(InstrumentClass instrumentClass) {
        put(instrumentClass);
        return this;
    }

    private String getNameOf(Object property) {
        return property.getClass().getSimpleName();
    }

    Object get(String key) {
        return properties.get(key);
    }

    private void put(Object value) {
        properties.put(getNameOf(value), value);
    }

    boolean matches(InstrumentSpec otherSpec) {
        return otherSpec.properties
                .keySet()
                .stream()
                .allMatch(valuesMatch(otherSpec));
    }

    private Predicate<String> valuesMatch(InstrumentSpec otherSpec) {
        return otherKey -> otherSpec.get(otherKey).equals(properties.get(otherKey));
    }
}
