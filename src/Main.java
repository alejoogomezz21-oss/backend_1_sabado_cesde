import java.util.ArrayList;
import java.util.List;

public class Main {
    final static int CURRENT_YEAR = 2026;
    public static void main(String[] args) {
        final String GREETING_MESSAGE = "Saludo estudiantes de java";

        String[] namesStudents = {"Alejo" , "Juan" , "Isabela" , "Camilo" , "Laura"};
        int[] birthYears = {2000, 1998, 2002, 1995, 2001} ;

        List<int[]> ageStudentsList = new ArrayList<>();

        showMessage(GREETING_MESSAGE);

    }
    static void showMessage(String message){
        System.out.println(message);
    }

    static int calculateAge(int birthYear){
        return CURRENT_YEAR - birthYear;
    }


}