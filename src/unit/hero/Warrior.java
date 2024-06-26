package unit.hero;

import unit.enemy.Enemy;

public class Warrior extends Hero{

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
        System.out.printf("%s attacks with a sword\n", this.getName());
    }
}
