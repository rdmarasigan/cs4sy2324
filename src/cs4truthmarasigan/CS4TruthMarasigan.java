/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthmarasigan;

/**
 *
 * @author TRUTH
 */
public class CS4TruthMarasigan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        String album1Name = "Loveless";
        int album1Year = 1991;
        String album1Artist = "My Bloody Valentine";
        String album1Genre = "Shoegaze";
        String album2Name = "Starz";
        int album2Year = 2020;
        String album2Artist = "Yung Lean";
        String album2Genre = "Cloud Rap";
        int difference;
        
        // print out values
        System.out.println("Album 1");
        System.out.println("Name: " + album1Name);
        System.out.println("Released in: " + album1Year);
        System.out.println("Artist: " + album1Artist);
        System.out.println("Genre: " + album1Genre);
        System.out.println(" ");
        System.out.println("Album 2");
        System.out.println("Name: " + album2Name);
        System.out.println("Released in: " + album2Year);
        System.out.println("Artist: " + album2Artist);
        System.out.println("Genre: " + album2Genre);
        System.out.println(" ");
        
        // evaluation
        if (album1Year < album2Year) {
            difference = album2Year - album1Year;
            System.out.println(album1Name + " was released before " + album2Name + ".");
            System.out.println("It was released " + difference + " years before " + album2Name + ".");
        }
        
        else if (album2Year < album1Year) {
            difference = album1Year - album2Year;
            System.out.println(album2Name + " was released before " + album1Name + ".");
            System.out.println("It was released " + difference + " years before " + album1Name + ".");
        }
        
        if (album1Genre == album2Genre) {
            System.out.println(album1Name + " and " + album2Name + " share the same genre.");
        }
        
        else if (album1Genre != album2Genre) {
            System.out.println(album1Name + " and " + album2Name + " do not share the same genre.");
        }
        
    }
    
}
