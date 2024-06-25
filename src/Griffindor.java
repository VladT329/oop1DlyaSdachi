public class Griffindor extends BasicOptions {
    private int nobility;
    private int honor;
    private int brave;

    public Griffindor(String name, int magicPower, int transgressionRage, int nobility, int honor, int brave) {
        super(name, magicPower, transgressionRage);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int sumSkillsGriffindor(){
        int sum;
        sum = getNobility() + getHonor() + getBrave();
        return sum;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBrave() {
        return brave;
    }

    @Override
    public String toString() {
        return "Griffindor{" + "Name = " + getName() + " magic power = " + getMagicPower() + " transgression range = " + getTransgressionRage() +
                " nobility=" + nobility +
                ", honor=" + honor +
                ", brave=" + brave +
                '}';
    }
}
