public class Protagonist {
  public String name;
  public Boolean isAlive = true;
  public int hp = 100;
  public int dmg;

  public Protagonist(String GivenName) {
    name = GivenName;
  }
  public String getName() {
    return name;
  }
  public Boolean isAlive() {
    return isAlive;
  }

  public void normalize() {
    dmg = (int) (Math.random() * 20);
  }

  public void specialize() {
    dmg = (int) (Math.random() * 20 * 1.5);
  }

  public int attack(Monster target) {
    target.hp -= dmg;
    return dmg;
  }

}

