
package textbasedrpg;

public class Spell {
    String spellType, deliveryMethod, spellName, spellDesc;
    int spellMagnitude, manaCost;
    
    Spell[] spellList = {};
    
    
//    public void addSpell(Spell i) { //Use this to add spells once a player buys them from the goy or recieves a scroll from an item drop
//        System.out.printf("You have learned %s!", spellName);
//        for(int j = 0; j < Player.spellInventory.length && Player.spellInventory[j] != null; j++) {
//            Player.spellInventory[j] = i;
//        }
//    }
//    
//    public void removeSpell(Spell i) {  //Use this to get rid of spells so the player has room for another one
//        for(int j = 0; j < Player.spellInventory.length; j++) {
//            if(Player.spellInventory[j].spellName.equals(i.spellName)) {    //identify the spell to be removed by using the spell name
//                Player.spellInventory[j] = null;
//            }
//        }
//    }
    
    public Spell selectRandom() {   //Select a random spell from the list WHY AM I DOING THIS IN HERE OH LORD
        Spell i = null;
        return i;
    }
}

//SPELL LIST HERE BOYE

//Healing spells
class Mend extends Spell {
    
}
