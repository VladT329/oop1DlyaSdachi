public class Hogwarts {
    public static void main(String[] args) {
        Ravenclaw ravenclawStudents[] = {
                new Ravenclaw("Zhou Chang", 50, 32, 12, 45, 78, 45),
                new Ravenclaw("Padma Patil", 62, 51, 12, 63, 23, 32),
                new Ravenclaw("Marcus Belby", 95, 64, 51, 23, 32, 41),
        };
        Functions.showRavenclawInformation(ravenclawStudents);
        Functions.compareRavenclawAbilities(ravenclawStudents[1],ravenclawStudents[2]);
        System.out.println();

        Griffindor griffindorStudents[] = {
                new Griffindor("Harry Potter", 100, 100, 100, 100, 100),
                new Griffindor("Hermione Granger", 90, 90, 90, 90, 90),
                new Griffindor("Ron Weasley", 80, 80, 80, 80, 80),
        };
        Functions.showGriffindorInformation(griffindorStudents);
        Functions.compareGriffindorAbilities(griffindorStudents[1], griffindorStudents[2]);
        System.out.println();

        Slytherin slytherinStudents[] = {
                new Slytherin("Draco Malfoy", 90, 90, 90, 90, 90, 90, 90),
                new Slytherin("Graham Montague", 80, 80, 80, 80, 80,80,80),
                new Slytherin("Gregory Goyle", 70, 70, 70, 70, 70,70,70),
        };
        Functions.showSlytherinInformation(slytherinStudents);
        Functions.compareSlytherinAbilities(slytherinStudents[1],slytherinStudents[2]);
        System.out.println();


        Hufflepuff hufflepuffStudents[] = {
                new Hufflepuff("Zachariah Smith", 70, 70, 70, 70, 70),
                new Hufflepuff("Cedric Diggory", 60, 60, 60, 60, 60),
                new Hufflepuff("Justin Finch-Fletchley", 50, 50, 50, 50, 50),
        };
        Functions.showHufflepuffInformation(hufflepuffStudents);
        Functions.compareHufflepuffAbilities(hufflepuffStudents[1],hufflepuffStudents[2]);
        System.out.println();

        Functions.compareBasicSkills(griffindorStudents[1], hufflepuffStudents[2]);
    }
}
