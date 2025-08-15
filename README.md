# AquaTallyApp (Java Desktop)

A simple fishing utility desktop app built in pure Java (Swing).  
It fetches current weather information and lets you log catches and fishing spots locally *(logging feature coming soon)*.

---

## Requirements
- **Java** 17+ (tested with 21)
- **Internet connection** for API lookups
- **SQLite JDBC** embedded (no separate DB install required)

---

## Configuration

When the bundled **temporary** OpenWeather API key is removed, you’ll need to provide your own.

1. Sign up for a free account at [OpenWeather](https://openweathermap.org/api).
2. Go to your account dashboard and create an API key.
3. Create a file named `config.properties` in the **project root** or in the `.aquatally` directory.

**Example:**
```properties
# config.properties
openweather.apiKey=YOUR_API_KEY_HERE
weather.city=Toronto
weather.units=imperial
