public class Hufflepuff extends BasicOptions {
    private int hardworking;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionRage, int hardworking, int loyalty, int honest) {
        super(name, magicPower, transgressionRage);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int sumSkillsHufflepuff(){
        int sum;
        sum = getHardworking()+getLoyalty()+getHonest();
        return sum;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + "Name = " + getName() + " magic power = " + getMagicPower() + " transgression range = " + getTransgressionRage() +
                " hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honest=" + honest +
                '}';
    }
}
