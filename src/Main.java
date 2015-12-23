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

        printStats(studentScores, studentNames);
    }

        public static void printStats(double[][] studentScores, String[] studentNames) {
        double[][] assignmentScores = colsToRows(studentScores);

        // PRINT STUDENT RESULTS
        int i = 0;
        for(double[] score : studentScores) {
            System.out.println(studentNames[i]);
            System.out.println("Highest score = " + max(score));
            System.out.println("Lowest score = " + min(score));
            System.out.println("Mean = " + mean(score) + " Grade:" + gradeLetter(mean(score)));
            System.out.println("Mean (lowest dropped) = " + meanLowDrop(score));
            System.out.println("-------------------------------------");
            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println();

        // PRINT ASSIGNMENT RESULTS
        int j = 1;
        for (double[] aScore : assignmentScores) {
            System.out.println("Assignment: " + j);
            System.out.println("Highest score = " + max(aScore));
            System.out.println("Lowest score = " + min(aScore));
            System.out.println("Mean = " + mean(aScore) + " Grade:" + gradeLetter(mean(aScore)));
            System.out.println("Mean (lowest dropped) = " + meanLowDrop(aScore));
            System.out.println("-------------------------------------");
            j++;
        }
    }

    /**
     * get the largest number from an array of numbers.
     * @param numbers array.
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
     * get the smallest number from an array of numbers.
     * @param numbers array.
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
     * get the mean of all the numbers in the array.
     * @param numbers array.
     * @return double.
     */
    public static double mean(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static double meanLowDrop(double[] numbers) {
        double lowestGrade = min(numbers);
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return (sum - lowestGrade) / (numbers.length - 1);
    }

    /**
     * return a grade letter based on the student's mean grade.
     * @param mean double.
     * @return char.
     */
    public static char gradeLetter(double mean) {
        char result;
        if (mean >= 90) {
            result = 'A';
        } else if (mean >= 80) {
            result = 'B';
        } else if (mean >= 70) {
            result = 'C';
        } else if (mean >= 65) {
            result = 'D';
        } else {
            result = 'F';
        }
        return result;
    }

    /**
     * access columns of a 2d array and return them as rows in an array.
     * @param arr 2d array
     * @return array
     */
    public static double[][] colsToRows(double[][] arr) {
        double[][] transposed = new double[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transposed[i][j] = arr[j][i];
            }
        }
        return transposed;
    }
}
