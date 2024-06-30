public class BasicOptions {
    private String name;
    private int magicPower;
    private int transgressionRage;

    public BasicOptions(String name, int magicPower, int transgressionRage) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionRage = transgressionRage;
    }

    public int sumBasicSkills(){
        int sum;
        sum = getMagicPower()+getTransgressionRage();
        return sum;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionRage() {
        return transgressionRage;
    }

    @Override
    public String toString() {
        return "BasicOptions{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionRage=" + transgressionRage +
                '}';
    }
}
