/*

double[][] studentScores ={{90,85,75,85,95},
{85,60,65,95,65},
{75,70,80,85,90},
{95,70,75,80,100},
{75,45,80,60,70}};

String[] studentNames = {"Jakob Baloski",
"Lucinda Pavlov",
"Daniele Hanston",
"Yusef Goldstein",
"Leona Rhee"
};

studentScores is a 2 dimensional array of doubles,  where each row represents an array with a single student's scores.

The 1st element in a row is that student's score on Assignment #1, the next element  in that row is that student's
score on Assignment #2, etc.

studentNames is a 1 dimensional array of Strings. The 1st element  is the name of the student whose scores are in the
1st row ofstudentScores.
The 2nd element  is the name of the student whose scores are in the 2nd row of studentScores, etc.

Your app is going to generate the following output to the console:

Jakob Baloski
Highest Score = 95.0
Lowest Score = 75.0
Mean = 86.0 Grade:B
Mean (lowest dropped) = 88.75
-------------------------------------
Lucinda Pavlov
Highest Score = 95.0
Lowest Score = 60.0
Mean = 74.0 Grade:C
Mean (lowest dropped) = 77.5
-------------------------------------
Daniele Hanston
Highest Score = 90.0
Lowest Score = 70.0
Mean = 80.0 Grade:B
Mean (lowest dropped) = 82.5
-------------------------------------
Yusef Goldstein
Highest Score = 100.0
Lowest Score = 70.0
Mean = 84.0 Grade:B
Mean (lowest dropped) = 87.5
-------------------------------------
Leona Rhee
Highest Score = 80.0
Lowest Score = 45.0
Mean = 66.0 Grade:D
Mean (lowest dropped) = 71.25
-------------------------------------


++++++++++++++++++++++++++++++++++++++++++++


Assignment  1
Highest Score = 95.0
Lowest Score = 75.0
Mean = 84.0 Grade:B
Mean (lowest dropped) = 86.25
-------------------------------------
Assignment  2
Highest Score = 85.0
Lowest Score = 45.0
Mean = 66.0 Grade:D
Mean (lowest dropped) = 71.25
-------------------------------------
Assignment 3
Highest Score = 80.0
Lowest Score = 65.0
Mean = 75.0 Grade:C
Mean (lowest dropped) = 77.5
-------------------------------------
Assignment 4
Highest Score = 95.0
Lowest Score = 60.0
Mean = 81.0 Grade:B
Mean (lowest dropped) = 86.25
-------------------------------------
Assignment 5
Highest Score = 100.0
Lowest Score = 65.0
Mean = 84.0 Grade:B
Mean (lowest dropped) = 88.75
-------------------------------------
 * Created by Rafeh on 12/17/15.
 */

public class Main {

    public static void main(String[] args) {
        double[][] studentScores = {
                {90, 85, 75, 85, 95},
                {85, 60, 65, 95, 65},
                {75, 70, 80, 85, 90},
                {95, 70, 75, 80, 100},
                {75, 45, 80, 60, 70}
        };

        String[] studentNames = {
                "Jakob Baloski",
                "Lucinda Pavlov",
                "Daniele Hanston",
                "Yusef Goldstein",
                "Leona Rhee"
        };

        int i = 0;
        for(double[] score : studentScores) {
            System.out.println(studentNames[i]);
            System.out.println("Highest score = " + max(score));
            System.out.println("Lowest score = " + min(score));
            System.out.println("Mean = " + mean(score));
            System.out.println("-------------------------------------");
            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println();
    }


    /**
     * get the largest number from a list of numbers.
     * @param numbers list.
     * @return double.
     */
    public static double max(double[] numbers) {
        double result = numbers[0];
        for (double number : numbers) {
            if (number > result) {
                result = number;
            }
        }
        return result;
    }

    /**
     * get the smallest number from a list of numbers.
     * @param numbers list.
     * @return double.
     */
    public static double min(double[] numbers) {
        double result = numbers[0];
        for (double number : numbers) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }

    /**
     * get the mean of all the numbers in the list.
     * @param numbers list.
     * @return double.
     */
    public static double mean(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}



