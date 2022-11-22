/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model.action;

import java.awt.geom.Point2D;
import mvc.model.Model;
import mvc.model.shape.MyShape;

/**
 *
 * @author Баян
 */
public enum  ActionDeleteBehavior {
    Clear{
        @Override
        public MyShape clearPress(Model model, Point2D[] p) {
            return model.clearPressMove(p);
        }
    };
    
    public abstract MyShape clearPress(Model model,Point2D []p);
}
