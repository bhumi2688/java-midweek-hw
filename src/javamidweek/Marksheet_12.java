package javamidweek;

public class Marksheet_12 {

    public static void main(String[] args) {      //Main Method

        // Declare Variable as float because it will come in decimal
        float total, percentage, average;

        //Local Variable
        int Eng =70;
        int Maths = 95;
        int Science = 85;
        int Physics = 78;
        int Biology = 38;


        //Method
        System.out.println("Central Board of Primary and Secondary Education");

        System.out.println("             12th Marksheet                     ");

        System.out.println("          School Name: H.M.B School             ");

        System.out.println("Stream: Science");

        System.out.println("Exam Number :2323232");

        System.out.println(" Name = Bhumika Patel");

        System.out.println("Subjects        Obtained Marks  Passing Marks     Maximum Marks        Pass/Fail");
        System.out.println("Eng                   70             40                 100                Pass  ");
        System.out.println("Maths                 95             40                 100                Pass  ");
        System.out.println("Science               85             40                 100                Pass  ");
        System.out.println("Physics               78             40                 100                Pass  ");
        System.out.println("Biology               38             40                 100                Fail  ");

        //Total Marks Added
        total=Eng + Maths + Science + Physics + Biology;
        System.out.println("Total :" + total);

        //Getting Average
        average = (total/5);
        System.out.println("average is :" + average);

        //Taking Percentage Out
        percentage = (total/500) *100;
        System.out.println("percentage :" + percentage);


    }
}


