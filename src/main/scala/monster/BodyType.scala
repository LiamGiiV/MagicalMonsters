package monster

import habitat.Biome
import monster.BodyPart

trait BodyType {
  def requiredBodyParts: List[BodyPart]
  def preferredBiome: Biome
}
