import java.util.Arrays;

public class Functions {
    public static void compareGriffindorAbilities(Griffindor a, Griffindor b){
        System.out.println("Сумма очков способностей студента " + a.getName() + " = " + a.sumSkillsGriffindor());
        System.out.println("Сумма очков способностей студента " + b.getName() + " = " + b.sumSkillsGriffindor());
        if (a.sumSkillsGriffindor()> b.sumSkillsGriffindor()){
            System.out.println(a.getName() + " сильнее, чем " + b.getName());
        } else if (a.sumSkillsGriffindor() == b.sumSkillsGriffindor()){
            System.out.println(a.getName() + " и " + b.getName() + " одинаково сильниы");
        } else {
            System.out.println(b.getName() + " сильнее, чем " + a.getName());
        }
    }

    public static void compareHufflepuffAbilities(Hufflepuff a, Hufflepuff b){
        System.out.println("Сумма очков способностей студента " + a.getName() + " = " + a.sumSkillsHufflepuff());
        System.out.println("Сумма очков способностей студента " + b.getName() + " = " + b.sumSkillsHufflepuff());
        if (a.sumSkillsHufflepuff()> b.sumSkillsHufflepuff()){
            System.out.println(a.getName() + " сильнее, чем " + b.getName());
        } else if (a.sumSkillsHufflepuff() == b.sumSkillsHufflepuff()){
            System.out.println(a.getName() + " и " + b.getName() + " одинаково сильниы");
        } else {
            System.out.println(b.getName() + " сильнее, чем " + a.getName());
        }
    }

    public static void compareRavenclawAbilities(Ravenclaw a, Ravenclaw b){
        System.out.println("Сумма очков способностей студента " + a.getName() + " = " + a.sumSkillsRavenclaw());
        System.out.println("Сумма очков способностей студента " + b.getName() + " = " + b.sumSkillsRavenclaw());
        if (a.sumSkillsRavenclaw()> b.sumSkillsRavenclaw()){
            System.out.println(a.getName() + " сильнее, чем " + b.getName());
        } else if (a.sumSkillsRavenclaw() == b.sumSkillsRavenclaw()){
            System.out.println(a.getName() + " и " + b.getName() + " одинаково сильниы");
        } else {
            System.out.println(b.getName() + " сильнее, чем " + a.getName());
        }
    }

    public static void compareSlytherinAbilities(Slytherin a, Slytherin b){
        System.out.println("Сумма очков способностей студента " + a.getName() + " = " + a.sumSkillsSlytherin());
        System.out.println("Сумма очков способностей студента " + b.getName() + " = " + b.sumSkillsSlytherin());
        if (a.sumSkillsSlytherin()> b.sumSkillsSlytherin()){
            System.out.println(a.getName() + " сильнее, чем " + b.getName());
        } else if (a.sumSkillsSlytherin() == b.sumSkillsSlytherin()){
            System.out.println(a.getName() + " и " + b.getName() + " одинаково сильниы");
        } else {
            System.out.println(b.getName() + " сильнее, чем " + a.getName());
        }
    }

    public static void showRavenclawInformation (Ravenclaw [] ravenclawStudents){
        System.out.println("Количество студентов на факультете \"Когтевран\" = " + ravenclawStudents.length);
        for (int i = 0; i < ravenclawStudents.length; i++) {
            Ravenclaw student = ravenclawStudents[i];
            System.out.println("Студент " + (i+1) + ": " + student.showStudentInformation());
        }
    }

    public static void showGriffindorInformation (Griffindor [] griffindorStudents){
        System.out.println("Количество студентов на факультете \"Гриффиндор\" = " + griffindorStudents.length);
        for (int i = 0; i < griffindorStudents.length; i++) {
            Griffindor student = griffindorStudents[i];
            System.out.println("Студент " + (i+1) + ": " + student.showStudentInformation());
        }
    }

    public static void showSlytherinInformation (Slytherin [] slytherinStudents){
        System.out.println("Количество студентов на факультете \"Слизерин\" = " + slytherinStudents.length);
        for (int i = 0; i < slytherinStudents.length; i++) {
            Slytherin student = slytherinStudents[i];
            System.out.println("Студент " + (i+1) + ": " + student.showStudentInformation());
        }
    }

    public static void showHufflepuffInformation (Hufflepuff [] hufflepuffStudents){
        System.out.println("Количество студентов на факультете \"Пуффендуй\" = " + hufflepuffStudents.length);
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            Hufflepuff student = hufflepuffStudents[i];
            System.out.println("Студент " + (i+1) + ": " + student.showStudentInformation());
        }
    }

    public static void compareBasicSkills(Griffindor griffindorStudent, Hufflepuff hufflepuffStudent){
        System.out.println("Сумма очков базовых способностей студента " + griffindorStudent.getName() + " = " + griffindorStudent.sumBasicSkills());
        System.out.println("Сумма очков базовых способностей студента " + hufflepuffStudent.getName() + " = " + hufflepuffStudent.sumBasicSkills());
        if (griffindorStudent.sumBasicSkills()> hufflepuffStudent.sumBasicSkills()){
            System.out.println(griffindorStudent.getName() + " сильнее, чем " + hufflepuffStudent.getName());
        } else if (griffindorStudent.sumBasicSkills() == hufflepuffStudent.sumBasicSkills()){
            System.out.println(griffindorStudent.getName() + " и " + hufflepuffStudent.getName() + " одинаково сильниы");
        } else {
            System.out.println(hufflepuffStudent.getName() + " сильнее, чем " + griffindorStudent.getName());
        }
    }
}
