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
            TowerOfHanoi(diskNumInt - 1, fromRod, toRod, auxRod);
            System.out.println(" move disk " + diskNumInt + " from rod " + fromRod + " to rod " + toRod);
            TowerOfHanoi(diskNumInt - 1, fromRod, toRod, auxRod);
        }

    }

    public static void main(String[] args) throws IOException {

        int diskNumInt = 0;

        Scanner myObj = new Scanner(System.in);

        System.out.println("How many disks do you want?");
        String diskNumString = myObj.nextLine();

        try {
            diskNumInt = Integer.parseInt(diskNumString);
        } catch (NumberFormatException e) {
            System.out.println("Please input a number greater than 0");
            diskNumString = myObj.nextLine();
        }

        TowerOfHanoi(diskNumInt, 'A', 'B', 'C');

    }

}
