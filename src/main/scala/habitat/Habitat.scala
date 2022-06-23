package habitat

import custom_types.Name

class Habitat(
    nameIn: String,
    biomeIn: Biome,
    areaInKM2In: Float,
    averageTemperatureInCelsiusIn: Float,
    highTemperatureInCelsiusIn: Float,
    lowTemperatureInCelsiusIn: Float
) extends Name {
  def theName: String = nameIn
  def biome: Biome = biomeIn
  def areaInKM2: Float = areaInKM2In
  def averageTemperatureInCelsius: Float = averageTemperatureInCelsiusIn
  def highTemperatureInCelsius: Float = highTemperatureInCelsiusIn
  def lowTemperatureInCelsius: Float = lowTemperatureInCelsiusIn
}

enum Biome:
  case City, Forest, Lake, Mountain, Ocean, Plateau, River, Tundra, Volcano
