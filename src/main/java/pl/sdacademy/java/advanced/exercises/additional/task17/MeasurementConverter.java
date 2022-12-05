package pl.sdacademy.java.advanced.exercises.additional.task17;

public class MeasurementConverter {

    public float convert(float value, ConversionType conversionType) {
        // 5 cm to ile cali?
        // 0,39 -> input(value) * przelicznik -> 5 cm * 0,39
        return value * conversionType.getValue();
    }

    public float convert(float value, ConversionTypeWithFunction conversionType) {
        return conversionType.getConversion().apply(value);
    }
}
