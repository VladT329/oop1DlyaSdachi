public class Ravenclaw extends BasicOptions {
    private int smart;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int magicPower, int transgressionRage, int smart, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionRage);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int sumSkillsRavenclaw(){
        int sum;
        sum = getSmart() + getWisdom() + getWit() + getCreation();
        return sum;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + "Name = " + getName() + " magic power = " + getMagicPower() + " transgression range = " + getTransgressionRage() +
                " smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }
}
