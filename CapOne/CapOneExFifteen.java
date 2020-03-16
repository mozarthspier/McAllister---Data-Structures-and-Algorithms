import java.util.Scanner;

public class CapOneExFifteen {

    public static int timesToFind(int targetInt, int[] myArray) {

        int times = 0;
        int mini = 0;
        int maxi = myArray.length - 1;
        int toCheck = (mini + maxi) / 2;

        while (targetInt != myArray[toCheck] && mini != maxi) {

            times += 1;

            if (myArray[toCheck] > targetInt) {
                maxi = toCheck - 1;
            } else {
                mini = toCheck + 1;
            }

            toCheck = (maxi + mini) / 2;

        }

        return times;
    }

    public static void main(String[] args) {

        int[] myArray = new int[65000];
        int targetInt, times;
        int average = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 65000; i++) {
            myArray[i] = i + 1;
        }

        System.out.println("Choose number of searches: ");
        times = sc.nextInt();
        
        for (int i = 0; i < times; i++) {
            targetInt = 1 + (int) (Math.random() * 65000);
            average += timesToFind(targetInt, myArray);
        }

        System.out.println(average / times);
        System.out.println(Math.log(65000)/Math.log(2));
        double helper = Math.log(65000)/Math.log(2);
        System.out.println((Math.log(65000)/Math.log(2)) + 1 - (Math.pow(2, helper) - Math.log(65000)/Math.log(2) - 2)/65000);
        
    }

}