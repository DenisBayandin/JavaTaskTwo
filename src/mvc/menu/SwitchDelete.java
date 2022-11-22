/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.menu;

import mvc.model.action.ActionDeleteBehavior;
import mvc.state.*;

/**
 *
 * @author Баян
 */
public class SwitchDelete implements Command{
    ActionDeleteBehavior delete_ab;
    State state;
    
    public SwitchDelete(ActionDeleteBehavior delete_ab, State state){
        this.delete_ab = delete_ab;
        this.state = state;   
    }

    @Override
    public void execute() {
        state.setActionDelete(delete_ab);
    }
}
