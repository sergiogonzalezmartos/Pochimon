
import java.util.ArrayList;
import java.util.HashMap;

class Pochimon {
    private String name;
    private String especie;
    private String desc;
    private boolean shiny;
    private boolean wild;
    private ArrayList<String> type;
    private HashMap<String, Integer> stats;

    public Pochimon(String name, String especie, String desc, boolean shiny, boolean wild, ArrayList<String> type, HashMap<String, Integer> stats) {
        this.name = name;
        this.especie = especie;
        this.desc = desc;
        this.shiny = shiny;
        this.wild = wild;
        this.type = type;
        this.stats = stats;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isShiny() {
        return shiny;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<String, Integer> stats) {
        this.stats = stats;
    }

    // Métodos vacíos
    public Pochimon attack(Pochimon enemy) {
        return null;
    }

    public void getDamage() {
    }

    public Pochimon heal(Pochimon pochimon) {
        return null;
    }

    public Pochimon levelUp(Pochimon pochimon) {
        return null;
    }

    public Pochimon evolve(Pochimon pochimon) {
        return null;
    }
}
