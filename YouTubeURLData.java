/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubeurldata;

/**
 *
 * @author somak
 */
public class YouTubeURLData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "https://www.youtube.com/watch?v=GOOAA";
        YouTubeURLDataManager youtubeManager = new YouTubeURLDataManager();
        if (youtubeManager.printVideoData(url) == false){
            System.out.println("Not a valid URL");
        }
    }
    
}
