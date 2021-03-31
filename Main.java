import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////
//
//  Function name : lRotaion
//  Input : intger
//  Output :  intger
//  Description :   It is used to a left rotation operation on an array.
//  Autor : Omkar Vijay Bhagawat
//  Date :  31-03-2021
//
//////////////////////////////////////////////////////////////
class Demo {
    void lRotaion(int iNo1, int iNo2) {
        int Arr[] = new int[iNo1];
        int Temp = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Element");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }

        for (int i = 0; i < iNo2; i++) {
            int First = 0, j = 0;
            First = Arr[0];
            for (j = 0; j < Arr.length - 1; j++) {

                Arr[j] = Arr[j + 1];

            }
            Arr[j] = First;
        }
        for (int Val : Arr) {
            System.out.print(Val + " ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Eneter Number of Integer & the number of left rotations you must perform.");
        int iNo1 = sobj.nextInt();
        int iNo2 = sobj.nextInt();
        Demo dobj = new Demo();
        dobj.lRotaion(iNo1, iNo2);

    }
}