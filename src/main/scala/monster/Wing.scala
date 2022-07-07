package monster

import custom_types.Name

class Wing(
    colourIn: String,
    lengthIn: Float,
    nameIn: String,
    weightIn: Float,
    materialIn: BodyPartMaterialType
) extends BodyPart {
  override def colour: String = colourIn
  override def length: Float = lengthIn
  override def name: String = nameIn
  override def weight: Float = weightIn
  override def material: BodyPartMaterialType = materialIn
  def fly(): Unit = ???
}
