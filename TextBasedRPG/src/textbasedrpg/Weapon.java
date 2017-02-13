/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedrpg;

/**
 *
 * @author Michael Brady
 */
public class Weapon {
    public int wDamage, wValue;
    public String wDesc;
    public static Weapon CreateFists() {
        Fists i = new Fists();
        return i;
    }
}

class Fists extends Weapon {
    
}