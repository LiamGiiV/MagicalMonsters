package monster

import custom_types.{Name, IdNumber}
import habitat.{Habitat, Biome}

class Monster(
    nameIn: String,
    bodyPartsIn: List[BodyPart],
    biomeIn: Biome,
    minimumTemperatureInCelsiusIn: Float,
    maximumTemperatureInCelsiusIn: Float,
    baseStatisticsIn: BaseStatistics,
    loacationIn: Location
) extends BodyType
    with Name {
  val idNumber: IdNumber = new IdNumber()
  def theName: String = nameIn // % seems busted
  override def requiredBodyParts: List[BodyPart] = bodyPartsIn
  override def preferredBiome: Biome = biomeIn
  def minimumTemperatureInCelsius: Float = minimumTemperatureInCelsiusIn
  def maximumTemperatureInCelsius: Float = maximumTemperatureInCelsiusIn

  override def toString: String =
    "The Monster " + theName + " prefers the " + preferredBiome + " biome."
}
