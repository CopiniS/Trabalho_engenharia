
package entity.controller;

import entity.view.AplicationView;

public class Main {
    public static Controller c1;
    public static void main(String[] args) {
        AplicationView view = new AplicationView();
        
        c1 = new Controller(view);
        c1.start();
    }
}
