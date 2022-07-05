package monster.systems.discovery

import scala.collection.mutable.ArrayBuffer
import custom_types.IdNumber

package object DiscoveredMonsters {
  val discoveredMonsters: ArrayBuffer[IdNumber] = ArrayBuffer.empty[IdNumber]
}
