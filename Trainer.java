package online_quiz;

public class Trainer {
    private String name;
    private String t_id;

    public Trainer(String name, String t_id) {
        this.name = name;
        this.t_id = t_id;
    }

    public String getName() {
        return this.name;
    }

    public String getT_id() {
        return this.t_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }
}
