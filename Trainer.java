
import java.util.ArrayList;

class Trainer {
    private String name;
    private int id;
    private int level;
    private ArrayList<String> medals;
    private ArrayList<Pochimon> team;

    public Trainer(String name, int id, int level, ArrayList<String> medals, ArrayList<Pochimon> team) {
        this.name = name;
        this.id = id;
        this.level = level;
        this.medals = medals;
        this.team = team;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<String> getMedals() {
        return medals;
    }

    public void setMedals(ArrayList<String> medals) {
        this.medals = medals;
    }

    public ArrayList<Pochimon> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Pochimon> team) {
        this.team = team;
    }

    // Métodos vacíos
    public Trainer levelUp(Trainer trainer) {
        return null;
    }

    public Trainer getExp(Trainer trainer) {
        return null;
    }

    public void takeOutPochimon() {
    }
}
