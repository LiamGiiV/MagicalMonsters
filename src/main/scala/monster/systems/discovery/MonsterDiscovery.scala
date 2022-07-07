package monster.systems.discovery

import custom_types.IdNumber
import monster.systems.discovery.DiscoveredMonsters
import monster.Monster

def testForReoccurringMonster(monsterId: IdNumber): Boolean = {
  DiscoveredMonsters.discoveredMonsters contains monsterId
}

def monsterAppearanceString(monster: Monster): String = {
  val commonString =
    monster.theName + " the monster was seen at " + monster.location.toString
  if (testForReoccurringMonster(monster.idNumber)) {
    val reoccurringString = commonString + " for the first time!"
  }
  commonString
}
