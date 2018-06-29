/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDSDS;

/**
 *
 * @author jmhd
 */
import java.util.Arrays;
import java.util.Scanner;

public class IDSDS{

    /**
     * @param args the command line arguments
     */
    static Players[][][] Players_Matrix = null;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of players");
        int players_number;
        players_number = reader.nextInt();
        prepare_Matrix(players_number);

    }

    static public void prepare_Matrix(int players_number) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter strategies number of player 1");
        int strategies1;
        strategies1 = reader.nextInt();
        System.out.println("enter strategies number of player 2");
        int strategies2;
        strategies2 = reader.nextInt();
        System.out.println("enter strategies number of player 3");
        int strategies3;
        strategies3 = reader.nextInt();
        Players_Matrix = new Players[strategies1][strategies2][strategies3];
        for (int i = 0; i < strategies1; i++) {
            for (int j = 0; j < strategies2; j++) {
                for (int l = 0; l < strategies3; l++) {
                    Players_Matrix[i][j][l] = new Players(3);
                }
            }
        }

        Players_Matrix[0][0][0].Set(4, 0);
        Players_Matrix[0][0][0].Set(2, 1);
        Players_Matrix[0][0][0].Set(2, 2); //A A A

        Players_Matrix[0][0][1].Set(2, 0);
        Players_Matrix[0][0][1].Set(4, 1);
        Players_Matrix[0][0][1].Set(1, 2); //A A B

        Players_Matrix[0][0][2].Set(2, 0);
        Players_Matrix[0][0][2].Set(5, 1);
        Players_Matrix[0][0][2].Set(1, 2); //A A C   

        Players_Matrix[0][1][0].Set(4, 0);
        Players_Matrix[0][1][0].Set(0, 1);
        Players_Matrix[0][1][0].Set(1, 2); //A B A

        Players_Matrix[0][1][1].Set(1, 0);
        Players_Matrix[0][1][1].Set(1, 1);
        Players_Matrix[0][1][1].Set(2, 2); //A B B

        Players_Matrix[0][1][2].Set(2, 0);
        Players_Matrix[0][1][2].Set(2, 1);
        Players_Matrix[0][1][2].Set(0, 2); //A B c   

        Players_Matrix[0][2][0].Set(2, 0);
        Players_Matrix[0][2][0].Set(0, 1);
        Players_Matrix[0][2][0].Set(1, 2); //A C A 

        Players_Matrix[0][2][1].Set(2, 0);
        Players_Matrix[0][2][1].Set(0, 1);
        Players_Matrix[0][2][1].Set(1, 2); //A C B

        Players_Matrix[0][2][2].Set(2, 0);
        Players_Matrix[0][2][2].Set(4, 1);
        Players_Matrix[0][2][2].Set(0, 2); //A C c   

        Players_Matrix[1][0][0].Set(2, 0);
        Players_Matrix[1][0][0].Set(2, 1);
        Players_Matrix[1][0][0].Set(1, 2); //B A A

        Players_Matrix[1][0][1].Set(0, 0);
        Players_Matrix[1][0][1].Set(2, 1);
        Players_Matrix[1][0][1].Set(2, 2); //B A B

        Players_Matrix[1][0][2].Set(0, 0);
        Players_Matrix[1][0][2].Set(2, 1);
        Players_Matrix[1][0][2].Set(2, 2); //B A C   

        Players_Matrix[1][1][0].Set(0, 0);
        Players_Matrix[1][1][0].Set(1, 1);
        Players_Matrix[1][1][0].Set(2, 2); //B B A

        Players_Matrix[1][1][1].Set(0, 0);
        Players_Matrix[1][1][1].Set(1, 1);
        Players_Matrix[1][1][1].Set(2, 2); //B B B

        Players_Matrix[1][1][2].Set(0, 0);
        Players_Matrix[1][1][2].Set(1, 1);
        Players_Matrix[1][1][2].Set(2, 2); //B B C   

        Players_Matrix[1][2][0].Set(0, 0);
        Players_Matrix[1][2][0].Set(1, 1);
        Players_Matrix[1][2][0].Set(2, 2); //B C A 

        Players_Matrix[1][2][1].Set(0, 0);
        Players_Matrix[1][2][1].Set(1, 1);
        Players_Matrix[1][2][1].Set(2, 2); //B C B

        Players_Matrix[1][2][2].Set(0, 0);
        Players_Matrix[1][2][2].Set(1, 1);
        Players_Matrix[1][2][2].Set(2, 2); //B C C

        Players_Matrix[2][0][0].Set(2, 0);
        Players_Matrix[2][0][0].Set(4, 1);
        Players_Matrix[2][0][0].Set(1, 2); //C A A

        Players_Matrix[2][0][1].Set(1, 0);
        Players_Matrix[2][0][1].Set(4, 1);
        Players_Matrix[2][0][1].Set(0, 2); //C A B

        Players_Matrix[2][0][2].Set(1, 0);
        Players_Matrix[2][0][2].Set(4, 1);
        Players_Matrix[2][0][2].Set(0, 2); //C A C    

        Players_Matrix[2][1][0].Set(1, 0);
        Players_Matrix[2][1][0].Set(2, 1);
        Players_Matrix[2][1][0].Set(0, 2); //C B A

        Players_Matrix[2][1][1].Set(0, 0);
        Players_Matrix[2][1][1].Set(1, 1);
        Players_Matrix[2][1][1].Set(2, 2); //C B B

        Players_Matrix[2][1][2].Set(1, 0);
        Players_Matrix[2][1][2].Set(2, 1);
        Players_Matrix[2][1][2].Set(0, 2); //C B C    

        Players_Matrix[2][2][0].Set(1, 0);
        Players_Matrix[2][2][0].Set(2, 1);
        Players_Matrix[2][2][0].Set(0, 2); //C C A 

        Players_Matrix[2][2][1].Set(1, 0);
        Players_Matrix[2][2][1].Set(2, 1);
        Players_Matrix[2][2][1].Set(0, 2); //C C B

        Players_Matrix[2][2][2].Set(1, 0);
        Players_Matrix[2][2][2].Set(2, 1);
        Players_Matrix[2][2][2].Set(0, 2); //C C C
        print_Matrix(strategies1, strategies2, strategies3);
        int h = 0;
        boolean finish = false;
        while (finish == false) {
            h++;
            System.out.println("iteration number (" + h + ")");
            finish = IDSDS_Matrix(strategies1, strategies2, strategies3);
        }

    }

    static public boolean IDSDS_Matrix(int strategies1, int strategies2, int strategies3) {
        boolean finish = true;
        /*   player 1         */
        for (int i = 0; i < strategies1; i++) {
            if (Players_Matrix[i][0][0].Get(0) == -1) {
                continue;
            }

            boolean stop = false;
            for (int ii = 0; ii < strategies1; ii++) {
                if (Players_Matrix[ii][0][0].Get(0) == -1) {
                    continue;
                }
                int k = 0;
                stop = false;
                int deleteIndex;
                deleteIndex = -1;

                while ((k < strategies2) && (ii != i) && (stop == false)) {

                    int kk = 0;

                    while (kk < strategies3 && (Players_Matrix[i][k][kk].Get(0) != -1) && stop == false) {
                        if (Players_Matrix[i][k][kk].Get(0) < Players_Matrix[ii][k][kk].Get(0)) {
                            stop = true;
                            break; // optimization condition
                        }

                        deleteIndex = ii; //for first iteration
                        kk++;
                    }
                    if (stop == true) {
                        break;   // optimization condition
                    }
                    k++;
                }
                if (stop == false && deleteIndex != -1) {
                    //delete  RowIndex
                    finish = false;

                    for (int l = 0; l < strategies2; l++) {
                        for (int ll = 0; ll < strategies3; ll++) {
                            Players_Matrix[deleteIndex][l][ll].Set(-1, 0);
                            Players_Matrix[deleteIndex][l][ll].Set(-1, 1);
                            Players_Matrix[deleteIndex][l][ll].Set(-1, 2);
                        }
                    }

                }
            }
        }

        print_Matrix(strategies1, strategies2, strategies3);
        /*   end player 1         */

 /*    player   2       */
        for (int i = 0; i < strategies2; i++) {
            if (Players_Matrix[0][i][0].Get(1) == -1) {
                continue;
            }

            boolean stop = false;
            for (int ii = 0; ii < strategies2; ii++) {
                if (Players_Matrix[0][ii][0].Get(1) == -1) {
                    continue;
                }
                int k = 0;
                stop = false;
                int deleteIndex;
                deleteIndex = -1;

                while (k < strategies2 && ii != i && stop == false) {

                    int kk = 0;
                    while (kk < strategies3 && (Players_Matrix[i][k][kk].Get(1) != -1) && stop == false) {
                        if (Players_Matrix[k][i][kk].Get(1) < Players_Matrix[k][ii][kk].Get(1)) {
                            stop = true;
                            break;   // optimization condition
                        }
                        deleteIndex = ii;  //for first iteration

                        kk++;
                    }
                    if (stop == true) {
                        break;   // optimization condition
                    }
                    k++;
                }
                if (stop == false && deleteIndex != -1) {
                    //delete  RowIndex
                    finish = false;

                    for (int l = 0; l < strategies1; l++) {
                        for (int ll = 0; ll < strategies3; ll++) {
                            Players_Matrix[l][deleteIndex][ll].Set(-1, 0);
                            Players_Matrix[l][deleteIndex][ll].Set(-1, 1);
                            Players_Matrix[l][deleteIndex][ll].Set(-1, 2);
                        }
                    }

                }
            }
        }

        print_Matrix(strategies1, strategies2, strategies3);

        /*   end player 2        */
 /*    player   3       */
        for (int i = 0; i < strategies3; i++) {
            if (Players_Matrix[0][0][i].Get(2) == -1) {
                continue;
            }

            boolean stop = false;
            for (int ii = 0; ii < strategies3; ii++) {
                if (Players_Matrix[0][0][ii].Get(2) == -1) {
                    continue;
                }
                int k = 0;
                stop = false;
                int deleteIndex;
                deleteIndex = -1;

                while (k < strategies1 && ii != i && stop == false) {

                    int kk = 0;
                    while (kk < strategies2 && (Players_Matrix[i][k][kk].Get(2) != -1) && stop == false) {
                        if (Players_Matrix[k][kk][i].Get(2) < Players_Matrix[k][kk][ii].Get(2)) {
                            stop = true;
                            break;   // optimization condition
                        }
                        deleteIndex = ii;  //for first iteration

                        kk++;
                    }
                    if (stop == true) {
                        break;   // optimization condition
                    }
                    k++;
                }
                if (stop == false && deleteIndex != -1) {
                    //delete  RowIndex
                    finish = false;

                    for (int l = 0; l < strategies1; l++) {
                        for (int ll = 0; ll < strategies2; ll++) {
                            Players_Matrix[l][ll][deleteIndex].Set(-1, 0);
                            Players_Matrix[l][ll][deleteIndex].Set(-1, 1);
                            Players_Matrix[l][ll][deleteIndex].Set(-1, 2);
                        }
                    }

                }
            }
        }

        print_Matrix(strategies1, strategies2, strategies3);

        /*   end player 3       */
        return finish;
    }

    static public void print_Matrix(int strategies1, int strategies2, int strategies3) {
        for (int i = 0; i < strategies3; i++) {
            for (int j = 0; j < strategies1; j++) {
                for (int l = 0; l < strategies2; l++) {
                    if (Players_Matrix[j][l][i].Get(0) != -1) {
                        System.out.print(" (" + Players_Matrix[j][l][i].Get(0) + " - " + Players_Matrix[j][l][i].Get(1) + " - " + Players_Matrix[j][l][i].Get(2) + ")  ");
                    }
                }
            }
            System.out.println(" ");
        }
        System.out.println("----------------------------------------------------------------------");
    }
}
