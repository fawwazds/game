package game;
public class Player {
        String name ;
        int speed, healthPoint, damage, armor; //variabel global

        void run(){
            System.out.println(name + " is running...");
            System.out.println("Speed : " + speed);
        }
        
        void defend(){
            System.out.println(name + " is defending...");
            System.out.println("Armor : " + armor);
        }

        void attack(String a){
            System.out.println(name + " is attacking..." + a);
            System.out.println("Damage : " + damage);
        }

        boolean isDead(){
            if(healthPoint <= 0) return true;
            return false;

        }



}