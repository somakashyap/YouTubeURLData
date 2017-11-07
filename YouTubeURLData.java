/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubeurldata;

import java.util.Scanner;

/**
 *
 * @author somak
 */
public class YouTubeURLData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans = "Y";
        String url = "https://www.youtube.com/watch?v=GOOAAqe63Pg&t=840s";
        YouTubeURLDataManager youtubeManager = new YouTubeURLDataManager();
        while (ans.equals("Y")){
            if (youtubeManager.inputURL(url) == false){
                System.out.println("Not a valid URL");
                System.out.println("Do you want to enter URL (Y/N) :");
                ans = scanner.next();
                if (ans.equals("Y")){
                    System.exit(0);
                }
            }
            else {
                ans = "N";
            }
        }
        System.out.println("The video data corresponding to URL is");
        youtubeManager.printVideoData();
        System.out.println("--------------------------------------------------------------------------");
        
        System.out.println("Do you want to see related videos corresponding to above video (Y/N)");
        
        ans = scanner.next();
        if (ans.equals("Y")){
            youtubeManager.getRelatedVideos();
        }
        
        while (ans.equals("Y")){
            System.out.println ("Select video serial number if you need data about it.");
            int choice = scanner.nextInt();
            if (youtubeManager.printVideoDatafromRelatedVideoOption(choice) == false){
                System.out.println("Incorrect choice or insufficent data.");
            }
            else {
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Do you want to see related videos corresponding to above video (Y/N)");
                ans = scanner.next();
                if (ans.equals("Y")){
                    youtubeManager.getRelatedVideoFromLastRelatedVideoChoice();
                }
            }
        }
    }
    
}
