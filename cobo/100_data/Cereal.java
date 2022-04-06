public class Cereal {
  private String name, type;
  private int calories, protein, fat, sodium, sugar, potassium, vitamins, shelf;
  private double fiber, carbohydrates, weight, cups, rating;

  public Cereal(String name, String type, int calories, int protein, int fat, int sodium,
                int fiber, int carbohydrates, int sugar, int potassium,
                int vitamins, int shelf, int weight, double cups, double rating)
  {
    this.name = name;
    this.type = type;
    this.calories = calories;
    this.protein = protein;
    this.fat = fat;
    this.sodium = sodium;
    this.fiber = fiber;
    this.carbohydrates = carbohydrates;
    this.sugar = sugar;
    this.potassium = potassium;
    this.vitamins = vitamins;
    this.potassium = potassium;
    this.shelf = shelf;
    this.weight = weight;
    this.cups = cups;
    this.rating = rating;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getCalories() {
    return calories;
  }

  public int getProtein() {
    return protein;
  }

  public int getFat() {
    return fat;
  }

  public int getSodium() {
    return sodium;
  }

  public int getSugar() {
    return sugar;
  }

  public int getPotassium() {
    return potassium;
  }

  public int getVitamins() {
    return vitamins;
  }

  public int getShelf() {
    return shelf;
  }

  public double getWeight() {
    return weight;
  }

  public double getCups() {
    return cups;
  }

  public double getRating() {
    return rating;
  }

  public double getCarbohydrates() {
    return carbohydrates;
  }

  public double getFiber() {
    return fiber;
  }

  public String toString() {
    String retStr = "-----\n";
    retStr = retStr + "NAME:" + name + "\nTYPE:" + type + "\nCALORIES:" + calories + "\nPROTEIN:" +
             protein + "\nFAT:" + fat + "\nCarbohydrates" + carbohydrates + "\nSugar:" + sugar +
             "\nPotassium:" + potassium + "\nVitamins:" + vitamins + "\nShelf:" + shelf + "\nWeight:" +
             weight + "\nCups:" + cups + "\nRating:" + rating;
    return retStr;
  }

  public static void main(String[] args) {
    Cereal allbran = new Cereal("All-Bran", "C", 70, 4, 1, 260, 9, 7, 5, 320, 25, 3, 1, 0.33, 59.43);
    Cereal allbranwithextrafiber = new Cereal("All-Bran with Extra Fiber", "C", 70, 4, 1, 260, 9, 7, 5, 320, 25, 3, 1, .33, 93.70);
    Cereal capncrunch = new Cereal("Cap'n'Crunch", "C", 120, 1, 2, 220, 0, 12, 12, 35, 25, 2, 1, .75, 18.04);
    Cereal cheerios = new Cereal("Cheerios", "C", 110, 6, 2, 290, 2, 17, 1, 105, 25, 1, 1, 1.25, 50.76);
    Cereal cinnamontoastcrunch = new Cereal("Cinnamon Toast Crunch", "C", 120, 1, 3, 210, 0, 13, 9, 45, 25, 2, 1, 0.75, 19.82);
    Cereal cocoapuffs = new Cereal("Cocoa Puffs", "C", 110, 1, 1, 180, 0, 12, 13, 55, 25, 2, 1, 1, 22.74);

    System.out.println(allbran);
    System.out.println(allbranwithextrafiber);
    System.out.println(capncrunch);
    System.out.println(cheerios);
    System.out.println(cinnamontoastcrunch);
    System.out.println(cocoapuffs);

  }

}
