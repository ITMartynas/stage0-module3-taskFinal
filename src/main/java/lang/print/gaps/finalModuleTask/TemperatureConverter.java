package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){

        float temperatureFahrenheit = ((float)temperatureCelsius*9F/5F) + 32F;

        System.out.println(temperatureFahrenheit);
    }
}
