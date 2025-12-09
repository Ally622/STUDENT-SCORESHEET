import java.util.Scanner;

public class javaapplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT SCHOOL DETAILS
        System.out.print("Enter School Name: ");
        String schoolName = input.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = input.nextLine();

        System.out.print("Enter Grade: ");
        String grade = input.nextLine();

        System.out.print("Enter Year: ");
        String year = input.nextLine();

        // STUDENT DETAILS
        int numStudents = 12;

        String[] studentNames = new String[numStudents];
        double[] eng = new double[numStudents];
        double[] mat = new double[numStudents];
        double[] his = new double[numStudents];
        double[] geo = new double[numStudents];
        double[] sci = new double[numStudents];
        double[] prog = new double[numStudents];
        double[] total = new double[numStudents];
        char[] rank = new char[numStudents];

        System.out.println("\nEnter details for 12 students:");

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Name: ");
            studentNames[i] = input.nextLine();  // FIXED

            System.out.print("English: ");
            eng[i] = input.nextDouble();

            System.out.print("Math: ");
            mat[i] = input.nextDouble();

            System.out.print("History: ");
            his[i] = input.nextDouble();

            System.out.print("Geography: ");
            geo[i] = input.nextDouble();

            System.out.print("Science: ");
            sci[i] = input.nextDouble();

            System.out.print("Programming: ");
            prog[i] = input.nextDouble();
            input.nextLine(); 

            // CALCULATE TOTAL
            total[i] = eng[i] + mat[i] + his[i] + geo[i] + sci[i] + prog[i];

            // GRADE SYSTEM
            if (total[i] >= 540)
                rank[i] = 'A';
            else if (total[i] >= 480)
                rank[i] = 'B';
            else if (total[i] >= 420)
                rank[i] = 'C';
            else if (total[i] >= 360)
                rank[i] = 'D';
            else
                rank[i] = 'F';
        }

        // CLASS STATS
        double sumEng = 0, sumMat = 0, sumHis = 0, sumGeo = 0, sumSci = 0, sumProg = 0, sumTotal = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int i = 0; i < numStudents; i++) {
            sumEng += eng[i];
            sumMat += mat[i];
            sumHis += his[i];
            sumGeo += geo[i];
            sumSci += sci[i];
            sumProg += prog[i];
            sumTotal += total[i];

            switch (rank[i]) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
                case 'F': countF++; break;
            }
        }

        // PRINT REPORT
        System.out.println("==========================================================================================================");
        System.out.printf("\t\t\t\t\t\t\t\tSchool Name: %s\n", schoolName);
        System.out.printf("\t\t\t\t\t\t\t\t\t\tTeacher: %s\n", teacherName);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\tGrade: %s\n", grade);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\tYear: %s\n", year);
        System.out.println("==========================================================================================================");

        System.out.printf("%-20s %-8s %-8s %-8s %-10s %-10s %-12s %-10s %-5s\n",
                "Student Name", "English", "Math", "History", "Geography", "Science", "Programming", "Total", "Rank");

        System.out.println("==========================================================================================================");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-20s %-8.2f %-8.2f %-8.2f %-10.2f %-10.2f %-12.2f %-10.2f %-5c\n",
                    studentNames[i], eng[i], mat[i], his[i], geo[i], sci[i], prog[i], total[i], rank[i]);
        }

        System.out.println("==========================================================================================================");

        System.out.printf("%-20s %-8.2f %-8.2f %-8.2f %-10.2f %-10.2f %-12.2f %-10.2f\n",
                "TOTAL", sumEng, sumMat, sumHis, sumGeo, sumSci, sumProg, sumTotal);

        System.out.println("==========================================================================================================");

        System.out.printf("%-20s %-8.2f %-8.2f %-8.2f %-10.2f %-10.2f %-12.2f %-10.2f\n",
                "AVERAGE", sumEng/numStudents, sumMat/numStudents, sumHis/numStudents,
                sumGeo/numStudents, sumSci/numStudents, sumProg/numStudents, sumTotal/numStudents);

        System.out.println("==========================================================================================================");

        System.out.printf("RANKS  A's: %d   B's: %d   C's: %d   D's: %d   F's: %d\n",
                countA, countB, countC, countD, countF);

        System.out.println("==========================================================================================================");
    }
}