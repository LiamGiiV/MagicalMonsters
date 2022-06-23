package monster

import custom_types.Name

trait BodyPart {
  def colour: String
  def length: Float
  def name: String
  def weight: Float
  def material: BodyPartMaterialType
}

enum BodyPartMaterialType:
  case Feathers, Fur, Hair, Leather, Scales, Shell
