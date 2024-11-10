/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

import Model.Model_Menu;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ADMIN
 */
public class ListMenu<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    public ListMenu(){
        model = new DefaultListModel();
        setModel(model);
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Model.Model_Menu data;
            if (value instanceof Model.Model_Menu){
                data=(Model_Menu)value;
                
            }else{
                data = new Model.Model_Menu("",value +"",Model_Menu.MenuType.Emty);
            }
            MenuItem item = new MenuItem(data);
            return item;
            }
            
        };
    }
    public void addItem(Model_Menu data ){
        model.addElement(data);
    }
    
}
