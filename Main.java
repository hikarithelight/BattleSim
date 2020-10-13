// im gonna change the character sections into seperate classes
//Game Stoy:
//You are a traveler looking for the most rare items in the land. To do so you must defeat the most evil of villians. during your journey you find that some villians are too strong and evil and must be defeated to protect the land.
//sorry if its bad. i rushed the story a little. Edit at your own leisure.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //calls classes

    new Attack();
    new Character();
    new Item();

  }
  public static void initializeBandit() {
    Bandit bandit = new Bandit();
    double banHealth = health(bandit.health);
    double banCoin = coins(bandit.coins);
    double banAtk = atkPoints(bandit.atkPoints);  
  }
  public static void initializeThief() {
    Thief thief = new Thief();
    double thiefHealth = health(thief.health);
    double thiefCoin = coins(thief.coins);
    double thiefAtk = atkPoints(thief.atkPoints);
  }
  public static void initializeMurderer() {
    
  }
  public static double health(double health) {
    double heath = Math.random();

    heath*=health;

    return heath;
  }
  public static double coins(double coins) {
    double coin = Math.random();

    coin*=coins;

    return coin;
  }
  public static double atkPoints(double atks) {
    double atk = Math.random();

    atk*=atks;

    return atk;
  }
  public static void start() {
    initializeBandit();
    initializeMurderer();
    initializeThief();
    //Add to if conditions

    String ban = "Bandit";

    System.out.print("Who would you like to fightn/Bandit/nThief/nMuderer");
    Scanner ask = new Scanner(System.in);
    String asking = ask.nextLine();
    if (asking == ban) {
      
    }


  }
}



