/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedrpg;
import java.util.Random;

/**
 *
 * @author Michael Brady
 */
public class Monster {
    public double mHealth, mMaxHealth;
    public double mMana, mMaxMana;
    public String mName;
    public String mDesc;
    public int reward;
    public int mAttack;
    public int mDefence;
    public int mMagicalMight;
    public int mMagicalWarding;
    
    public int mStrength;
    public int mWisdom;
    public int mAgility;
    Random rand = new Random();
    
    public void RNGAttack() {
        switch(rand.nextInt(1)) {
            case 1: case 0:
                int i = RegularAttack();
                Player.health -= i;
                break;
            case 2:
                
                break;
        }
    }
    
    public int RegularAttack() {
        int damage = this.mAttack + this.mStrength + rand.nextInt(5);
        return damage;
    }
    public double CrazyAttack(double dmgMult) {
        double damage = Player.attack * dmgMult * rand.nextInt(5);
        System.out.println("HOLY FUCK THIS SHIT'S GONE FUCKING CRAZY RUN NIGGER");
        return damage;
    }
   
    public double getHealth() {
        return this.mHealth;
    }
    public void setHealth(double i) {
        this.mHealth = i;
    }
    public double getMana() {
        return this.mMana;
    }
    public void setMana(double i){
        this.mMana = i;
    }
    public double getMaxHealth() {
        return this.mMaxHealth;
    }
    public void setMaxHealth(double i) {
        this.mMaxHealth = i;
    }
    public double getMaxMana(){
        return this.mMaxMana;
    }
}

class Skeleton extends Monster {
}

class Minotaur extends Monster {
    
}
