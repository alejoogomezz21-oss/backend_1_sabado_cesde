import java.util.ArrayList;
import java.util.List;

public class Main {
    final static int CURRENT_YEAR = 2026;
    static List<Integer> ageStudentsList = new ArrayList<>();

    public static void main(String[] args) {
        final String GREETING_MESSAGE = "Saludo estudiantes de java";

        String[] namesStudents = {"Alejo" , "Juan" , "Isabela" , "Camilo" , "Laura"};
        int[] birthYears = {2000, 1998, 2002, 1995, 2001} ;

        showMessage(GREETING_MESSAGE);
        listStudents(namesStudents, fillAgesList(birthYears));

    }
    static void showMessage(String message){
        System.out.println(message);
    }

    static int calculateAge(int birthYear){
        return CURRENT_YEAR - birthYear;
    }
    static  List<Integer> fillAgesList(int[] birthYears){

        for (int birthYear : birthYears){
            int age = calculateAge(birthYear);
            ageStudentsList.add(age);
        }
        return ageStudentsList;
    }

    static void listStudents(String[] namesStudents, List<Integer> agesStudents) {
        showMessage("Lista de estudiantes: ");
        for (int i = 0; i < namesStudents.length; i++){
            showMessage(namesStudents[i] + " - Edad: " + agesStudents.get(i));
        }
    }
}


