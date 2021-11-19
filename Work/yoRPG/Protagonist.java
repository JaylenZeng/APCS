public class Protagonist {
  private String name;
  private Boolean isAlive = true;
  private int hp = 100;

  public Protagonist(String GivenName) {
    name = GivenName;
  }
  public String getName() {
    return name;
  }
  public Boolean isAlive() {
    return isAlive;
  }
  public int attack(Monster target) {
    
  }

}
