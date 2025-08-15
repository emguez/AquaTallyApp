# AquaTallyApp (Java Desktop)

> **Note:** The AquaTallyApp is currently bundled with a temporary OpenWeather API key so weather features work immediately after cloning.
> This key will be removed in the near future — after that, you'll need to create your own free OpenWeather account and update `config.properties`.

A useful fishing utility desktop app built in pure Java (Swing).
It will fetch weather info and lets you log catches and fishing spots locally (coming soon).

## Requirements
- Java 17+ (tested with 21)
- Internet connection for API lookups
- SQLite JDBC embedded (no separate DB install needed)

## Quick Start
```bash
./gradlew run
