package custom_types

import scala.collection.mutable.ArrayBuffer

package object UsedIdNumbers {
  val usedIdNumbers: ArrayBuffer[IdNumber] = ArrayBuffer.empty[IdNumber]
}
