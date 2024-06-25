public class Slytherin extends BasicOptions {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionRage, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionRage);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int sumSkillsSlytherin(){
        int sum;
        sum = getCunning()+getDetermination()+getAmbition()+getResourcefulness()+getLustForPower();
        return sum;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" + "Name = " + getName() + " magic power = " + getMagicPower() + " transgression range = " + getTransgressionRage() +
                " cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
