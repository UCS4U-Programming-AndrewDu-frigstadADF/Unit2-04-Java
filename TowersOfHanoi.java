/** doing more recursion stuff with towers of Hanoi
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-04-19
**/

// imports
import java.io.IOException;
import java.util.Scanner;

public class TowersOfHanoi {

    public static void TowerOfHanoi(int diskNumInt, char fromRod, char toRod, char auxRod) {

        if (diskNumInt <= 0) {
            return;
        } else {
            // finding the optimal sequence
            TowerOfHanoi(diskNumInt - 1, fromRod, auxRod, toRod);
            System.out.println(" move disk " + diskNumInt + " from rod " + fromRod + " to rod " + toRod);
            TowerOfHanoi(diskNumInt - 1, auxRod, toRod, fromRod);
        }
    }

    public static void main(String[] args) throws IOException {

        int diskNumInt = 0;

        Scanner myObj = new Scanner(System.in);

        // get user input
        while (true) {
            System.out.println("How many disks do you want?");
            String diskNumString = myObj.nextLine();

            // try catch for inputs that are not positive numbers or strings
            try {
                diskNumInt = Integer.parseInt(diskNumString);
                if (diskNumInt >= 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid input");
            }

        }

        // calling function
        TowerOfHanoi(diskNumInt, 'A', 'C', 'B');

    }

}
