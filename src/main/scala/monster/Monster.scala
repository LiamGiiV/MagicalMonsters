package monster

import custom_types.{IdNumber, Name}
import habitat.{Biome, Habitat}
import monster.systems.BaseStatistics

class Monster(
    nameIn: String,
    bodyPartsIn: List[BodyPart],
    biomeIn: Biome,
    minimumTemperatureInCelsiusIn: Float,
    maximumTemperatureInCelsiusIn: Float,
    baseStatisticsIn: BaseStatistics,
    locationIn: Location
) extends BodyType
    with Name {
  val idNumber: IdNumber = new IdNumber()
  val location: Location = locationIn
  def theName: String = nameIn // % seems busted
  override def requiredBodyParts: List[BodyPart] = bodyPartsIn
  override def preferredBiome: Biome = biomeIn
  def minimumTemperatureInCelsius: Float = minimumTemperatureInCelsiusIn
  def maximumTemperatureInCelsius: Float = maximumTemperatureInCelsiusIn

  override def toString: String =
    "The Monster " + theName + " prefers the " + preferredBiome + " biome."
}
