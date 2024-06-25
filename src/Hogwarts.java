public class Hogwarts {
    public static void main(String[] args) {
        Ravenclaw ravenclawStudents[] = {
                new Ravenclaw("Zhou Chang", 50, 32, 12, 45, 78, 45),
                new Ravenclaw("Padma Patil", 62, 51, 12, 63, 23, 32),
                new Ravenclaw("Marcus Belby", 95, 64, 51, 23, 32, 41),
        };
        System.out.println("number of students = " + ravenclawStudents.length);
        for (int i = 0; i < ravenclawStudents.length; i++) {
            Ravenclaw student = ravenclawStudents[i];
            System.out.println("student " + (i+1) + " = " + student);
        }

        System.out.println("ravenclawStudents[1].sumSkillsRavenclaw() = " + ravenclawStudents[1].sumSkillsRavenclaw());
        System.out.println("ravenclawStudents[2].sumSkillsRavenclaw() = " + ravenclawStudents[2].sumSkillsRavenclaw());
        if (ravenclawStudents[1].sumSkillsRavenclaw()>ravenclawStudents[2].sumSkillsRavenclaw()){
            System.out.println(ravenclawStudents[1].getName() + " сильнее " + ravenclawStudents[2].getName());
        } else {
            System.out.println(ravenclawStudents[2].getName() + " сильнее " + ravenclawStudents[1].getName());
        }

        System.out.println();

        Griffindor griffindorStudents[] = {
                new Griffindor("Harry Potter", 100, 100, 100, 100, 100),
                new Griffindor("Hermione Granger", 90, 90, 90, 90, 90),
                new Griffindor("Ron Weasley", 80, 80, 80, 80, 80),
        };
        System.out.println("number of students = " + griffindorStudents.length);
        for (int i = 0; i < griffindorStudents.length; i++) {
            Griffindor student = griffindorStudents[i];
            System.out.println("student " + (i+1) + " = " + student);
        }

        System.out.println("griffindorStudents[1].sumSkillsGriffindor() = " + griffindorStudents[1].sumSkillsGriffindor());
        System.out.println("griffindorStudents[2].sumSkillsGriffindor() = " + griffindorStudents[2].sumSkillsGriffindor());
        if (griffindorStudents[1].sumSkillsGriffindor()>griffindorStudents[2].sumSkillsGriffindor()){
            System.out.println(griffindorStudents[1].getName() + " сильнее " + griffindorStudents[2].getName());
        } else {
            System.out.println(griffindorStudents[2].getName() + " сильнее " + griffindorStudents[1].getName());
        }

        System.out.println();

        Slytherin slytherinStudents[] = {
                new Slytherin("Draco Malfoy", 90, 90, 90, 90, 90, 90, 90),
                new Slytherin("Graham Montague", 80, 80, 80, 80, 80,80,80),
                new Slytherin("Gregory Goyle", 70, 70, 70, 70, 70,70,70),
        };
        System.out.println("number of students = " + slytherinStudents.length);
        for (int i = 0; i < slytherinStudents.length; i++) {
            Slytherin student = slytherinStudents[i];
            System.out.println("student " + (i+1) + " = " + student);
        }

        System.out.println("slytherinStudents[1].sumSkillsSlytherin() = " + slytherinStudents[1].sumSkillsSlytherin());
        System.out.println("slytherinStudents[2].sumSkillsSlytherin() = " + slytherinStudents[2].sumSkillsSlytherin());
        if (slytherinStudents[1].sumSkillsSlytherin()>slytherinStudents[2].sumSkillsSlytherin()){
            System.out.println(griffindorStudents[1].getName() + " сильнее " + slytherinStudents[2].getName());
        } else {
            System.out.println(slytherinStudents[2].getName() + " сильнее " + slytherinStudents[1].getName());
        }

        System.out.println();


        Hufflepuff hufflepuffStudents[] = {
                new Hufflepuff("Zachariah Smith", 70, 70, 70, 70, 70),
                new Hufflepuff("Cedric Diggory", 60, 60, 60, 60, 60),
                new Hufflepuff("Justin Finch-Fletchley", 50, 50, 50, 50, 50),
        };
        System.out.println("number of students = " + hufflepuffStudents.length);
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            Hufflepuff student = hufflepuffStudents[i];
            System.out.println("student " + (i+1) + " = " + student);
        }

        System.out.println("hufflepuffStudents[1].sumSkillsHufflepuff() = " + hufflepuffStudents[1].sumSkillsHufflepuff());
        System.out.println("hufflepuffStudents[2].sumSkillsHufflepuff() = " + hufflepuffStudents[2].sumSkillsHufflepuff());
        if (hufflepuffStudents[1].sumSkillsHufflepuff()>hufflepuffStudents[2].sumSkillsHufflepuff()){
            System.out.println(hufflepuffStudents[1].getName() + " сильнее " + hufflepuffStudents[2].getName());
        } else {
            System.out.println(hufflepuffStudents[2].getName() + " сильнее " + hufflepuffStudents[1].getName());
        }

        System.out.println();

        System.out.println("hufflepuffStudents[1].sumBasicSkills() = " + hufflepuffStudents[1].sumBasicSkills());
        System.out.println("griffindorStudents[1].sumBasicSkills() = " + griffindorStudents[1].sumBasicSkills());
        if (hufflepuffStudents[1].sumBasicSkills()>griffindorStudents[1].sumBasicSkills()){
            System.out.println(hufflepuffStudents[1].getName() + " сильнее " + griffindorStudents[1].getName());
        } else {
            System.out.println(griffindorStudents[1].getName() + " сильнее " + hufflepuffStudents[1].getName());
        }
    }
}
