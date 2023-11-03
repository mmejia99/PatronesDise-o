import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature, humidity, pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add( o );
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf( o );
        if( i>=0  )
            observers.remove( o );
    }

    @Override
    public void notifyObserver() {
        for ( Observer o: observers )
            o.update( temperature, humidity, pressure );

    }

    public void measurementsChanged() {
        //más acciones
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
