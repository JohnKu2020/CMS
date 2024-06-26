/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import cms.Config;
import interfaces.MenuInterface;
import users.User;

/**
 * @author  Yevhen K
 */


public class AbstractMenu implements MenuInterface {
/**
* Abstract Class is to implement different menu UI
*/
    
    public String currentItem;
    public User currentUser = null;
    public Config app;
    
    @Override
    public void showMenu() {
        // Show menu
    }

    @Override
    public void hideMenu() {
        // Hide menu
    }        
}
