

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class StringUtils {
    private String word;
    private String searched;
    
    
    public static boolean included(String word, String searched){
        String check = word.trim().toUpperCase();
        String search = searched.trim().toUpperCase();
        if(check.contains(search)){
            return true;
        }
        return false;
    }
}
