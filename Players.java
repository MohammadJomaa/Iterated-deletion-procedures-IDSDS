/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author jmhd
 */
public class Players {
    int [] players_array ;
    
     public Players( int players_number){
         players_array = new int [players_number];
     }
     
     public int Get(int player_number){
         return players_array[player_number];
     }
     
     public void Set(int utility_value , int player_number){
          players_array[player_number] = utility_value;
     }
}
