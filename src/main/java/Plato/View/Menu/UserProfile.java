package Plato.View.Menu;

import Plato.Model.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class UserProfile extends Menu{

    public UserProfile(String name, Menu parentMenu) {
        super(name, parentMenu);
        HashMap<String, Menu> submenus = new HashMap<>();

    }

    private Menu userProfilePage(){
        return new Menu("profile", this) {

        };
    }
    public void viewPersonalInfo(){

    }

    public void changePassword(String currentPass, String newPass){

    }

    public void editField(Object field, Object newValue){

    }

    public void ViewPlatoStatistics(){

    }

    public void gameHistory(){

    }

    public void GameStatistics(String gameName){

    }

    public void logout(){

    }
    //...........................
    public static void showPoints(){

    }

    public static void showFavoriteGame(){

    }

    public static void showPlatoBotMessage(){

    }

    public static void viewLastPlayed(){

    }

    public static void viewAdminSuggestion(){

    }

    public static void addFriend(Player player){
        //get the username of player and request to him
    }


}
