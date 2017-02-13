package textbasedrpg;
import java.util.Scanner;
import java.util.Random;
import konrad.game.Game;

/**
 * @author Michael Brady
 */
public class TextBasedRPG {

static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
//        System.out.println("Grizzly's Wild Adventure in Tariq Abdul Bumbaclot the Third's Afghan Wonderland 2: Rising Revegeance: Remastered");
//        System.out.println("");
//        CreateCharacter();
//        HubMenu();
    Game g = new Game(400, 400, 60);
    g.run();
    g.draw();
    }
    
    public static void CreateCharacter() {
        System.out.printf("Create your character:%nName: ");
        Player.name = input.nextLine();
        System.out.printf("Now distribute %s's skill points. ", Player.name);
        System.out.printf("%s has three major stats. Strength, wisdom and agility.%nStrength affects the amount of damage"
                + " you will do in battle, and your starting health.%n"
                + "Wisdom affects your starting mana, and the amount of damage your spells will do.%n"
                + "Agility affects your chance of dodging an attack, as well as your chance of delivering a critical hit for massive damage.%n%n", Player.name);
                
                String reallocate = "Y";
                for(Player.skillPoints = 30; Player.skillPoints > 0 && reallocate.charAt(0) == 'y' || reallocate.charAt(0) == 'Y';) {
                    Player.skillPoints = 30;
                    System.out.printf("You have %d skill points remaining. How many would you like to invest into strength? ", Player.skillPoints);
                    Player.strength = input.nextInt();
                    Player.skillPoints -= Player.strength;
                    System.out.printf("You have %d skill points remaining. How many would you like to invest into wisdom? ", Player.skillPoints);
                    Player.wisdom = input.nextInt();
                    Player.skillPoints -= Player.wisdom;
                    System.out.printf("You have %d skill points remaining. They will be invested in agility.%n", Player.skillPoints);
                    Player.agility = Player.skillPoints;
                    //Player.skillPoints -= Player.agility;
                    //System.out.println(Player.skillPoints);
                    if(Player.skillPoints <= 0) {
                        System.out.println("You have allocated more skill points than you actually have. Reallocate them.");
                    }
                    else {
                        System.out.println("Your skill points have been allocated. Would you like to reallocate them or move on? Y/N");
                        input.nextLine();
                        reallocate = input.nextLine();
                    }
                }	
        ClearScreen();
        //Calculate starting health and mana
        Player.health = 100 * (Player.strength / 5);
        Player.mana = 100 * (Player.wisdom / 7);
        
        //Make this base attack 
        Player.attack = Player.strength;
        Player.magicalMight = Player.wisdom;
        System.out.printf("Character sheet %n----------------%n%nName: %s%n%nHealth: %.1f%n"
                + "Mana: %.1f%n%nStrength: %d%nWisdom: %d%nAgility: %d%nAttack: %d%nMagical Might: %d%nDefence: %d%nMagical Warding: %d%n", Player.name, 
                Player.health, Player.mana, Player.strength, Player.wisdom,
                Player.agility, Player.attack, Player.magicalMight, Player.defence, Player.magicalWarding);
    }
    
    public static void ClearScreen() {
        for(int i = 0; i < 20; i++) 
        {
            System.out.println("");
        }
    }
    
    public static void HubMenu() {
        System.out.printf("You are in such and such a town. What will you do?%n1. Hunt for monsters."
                + "%n2. Look for work."
                + "%n3. Browse the shop."
                + "%n4. Rest at the inn."
                + "%n5. Travel to a new town."
                + "%n6. Literally kill yourself."
                + "%n7. Quit the game.");
        switch(input.nextInt()) {
            case 1:
                //Hunt for monsters. Just run a normal encounter here basically.
                Player.EncounterRegular(Player.rand.nextInt());
                break;
            case 2:
                //Look for work. Gives you a bounty to kill a particularly strong monster.
                break;
            case 3:
                //Browse the shop. Lets you buy some stuff.
                break;
            case 4:
                //Rest at the inn. Heals you up fully, for a bit of gold.
                break;
            case 5:
                //Travel to a new town. Exactly as it says on the tin.
                break;
            case 6:
                //kys
                break;
            case 7:
                //Quit
                break;
            default:
                //the fuck are you even doing nigger
                break;
        }
    }
}

class Player {
    static double health;
    static double mana;
    static int gold;
    static int attack;
    static int magicalMight;
    static int defence;
    static int magicalWarding;
    static String name;
    static int skillPoints;
    static int strength;
    static int wisdom;
    static int agility;
    static Random rand = new Random();
    
    public static void EncounterRegular(int monsterType) {
        Monster selectedMonster = new Monster();
        switch(monsterType) {
            case 1:
                Skeleton skelly = new Skeleton();
                selectedMonster = skelly;
                break;
            
        }
        
        //Begin fight
        System.out.printf("A" + selectedMonster + " draws near!");
    }
}


