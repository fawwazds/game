package game;

public class game {
    public static void main(String[] args) {
        Player hero = new Player();
        Player enemy = new Player();
        Player ochobot = new Player();

        hero.name = "Ochobot";
        hero.speed = 60;
        hero.damage = 20;
        hero.armor = 10;
        hero.healthPoint = 100;

        enemy.name = "Nopal";
        enemy.speed = 20;
        enemy.damage = 10;
        enemy.armor = 5;
        enemy.healthPoint = 90;

        // menjalankan program

        hero.attack(enemy.name);
        if (hero.isDead()) {
            System.out.println("Game Over :(");
        }

    }

}
                         