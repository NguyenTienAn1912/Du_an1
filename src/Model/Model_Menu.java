/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ADMIN
 */
public class Model_Menu {
    private String icon;
    private String name;
    private MenuType Type;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return Type;
    }

    public void setType(MenuType Type) {
        this.Type = Type;
    }

    public Model_Menu() {
    }

    public Model_Menu(String icon, String name, MenuType Type) {
        this.icon = icon;
        this.name = name;
        this.Type = Type;
    }
    public Icon toIcon(){
        
        return new ImageIcon(getClass().getResource("/ICON"+icon+".png"));
    }
   public static enum MenuType{
       Title, Menu, Emty
   }
}
