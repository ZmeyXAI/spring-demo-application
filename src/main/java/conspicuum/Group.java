package conspicuum;

public class Group {
    protected String name;

    @Override
    public String toString() {
        return "Group{" + "name=" + name + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
