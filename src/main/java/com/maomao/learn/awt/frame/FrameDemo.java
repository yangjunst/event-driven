package com.maomao.learn.awt.frame;

import java.awt.*;
import java.awt.event.*;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/10 14:01
 * Program Goal:
 *********************************************/
public class FrameDemo {
    public static void main(final String[] args) {
        Frame frame=new Frame("my frame");
        frame.setSize(500,400);
        Button button=new Button("my button");
        frame.setLocation(400,200);
        frame.add(button);
        frame.setLayout(new FlowLayout());
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("window closing...");
                System.exit(0);
            }

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("孔雀开屏..."+e.getClass().getName());
            }
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){
                    System.out.println("mouse double click..."+e.getClass().getName());
                }
            }
        });











        frame.setVisible(true);
        System.out.println("over");
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
////                System.exit(0);
//                for (int i = 0; i <4 ; i++) {
//                    for (int j = 0; j <5 ; j++) {
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//                System.out.println("over");
//            }
//        });







//        System.out.println("over");

    }
}
