class Main {
  public static void main(String[] args) {
  }
  public static class RpgGames {
    private String thing;
    public RpgGames(String startThing) {
      thing = startThing;
    }
    public void setThing(String newThing) {
      thing = newThing;
    }
    public String getThing() {
      return thing;
    }
  }
  public static class SoulsBorne extends RpgGames {
    private String thingSoulsBorne;
    public SoulsBorne(String startThingSoulsBorne) {
      super("this");
      thingSoulsBorne = startThingSoulsBorne;
    }
    public void setThingSoulsBorne(String newThingSoulsBorne) {
      thingSoulsBorne = newThingSoulsBorne;
    }
    public String getThingSoulsBorne() {
      return thingSoulsBorne;
    }
  }
  public static class Zelda extends RpgGames {
    private String thingZelda;
    public Zelda(String startThingZelda) {
      super("this");
      thingZelda = startThingZelda;
    }
    public void setThingZelda(String newThingZelda) {
      thingZelda = newThingZelda;
    }
    public String getThingZelda() {
      return thingZelda;
    }
  }
  public static class KingdomHearts extends RpgGames {
    private String thingKingdomHearts;
    public KingdomHearts(String startThingKingdomHearts) {
      super("this");
      thingKingdomHearts = startThingKingdomHearts;
    }
    public void setThingKingdomHearts(String newThingKingdomHearts) {
      thingKingdomHearts = newThingKingdomHearts;
    }
    public String getThingKingdomHearts() {
      return thingKingdomHearts;
    }
  }
}