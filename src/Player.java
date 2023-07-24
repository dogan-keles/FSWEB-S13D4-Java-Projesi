public class Player {

    String name ;
    int healthPercentage ;
    Weapon weapon ;

    public Player(String name,int healthPercentage,Weapon weapon){
        this.name = name ;

        if( healthPercentage>100) {
            this.healthPercentage = 100;
        }
        else if( healthPercentage<0) {
            this.healthPercentage = 0;
        }
        else {this.healthPercentage=healthPercentage;}
        this.weapon=  weapon;


    }
    public int healthRemaining () {
        return healthPercentage;
    }
    public int loseHealth ( int damage){
        int result = healthPercentage-damage ;
        if (result<0){System.out.println(name + " player has been knocked out of game");
        }
        return result ;

    }
    public int restoreHealth(int healthPotion){
        int restoredHealth = healthPotion+healthPercentage ;
        if (restoredHealth>100 ){return 100;}
        else return restoredHealth;
    }
}