package observer.display

import observer.data.WeatherData
import observer.observer.Observer

class CurrentConditionalDisplay(
    var weatherData: WeatherData
) : DisplayElement, Observer {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity% humidity")
    }

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.humidity
        display()
    }
}