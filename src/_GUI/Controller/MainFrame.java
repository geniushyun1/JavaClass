package _GUI.Controller;

import _GUI.View.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
  public static final int FRAME_WIDTH = 600;

  public static final int FRAME_HEIGHT = 500;

  public static  int FRAME_X=600;

  public static  int FRAME_Y=300;

    public MainFrame() {
        super("검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        double screenWidth=screenSize.getWidth();
        double screenHeight=screenSize.getHeight();

        int frameX=(int)((0.5)*screenWidth-FRAME_X);
        int frameY=(int)((0.5)*screenHeight-FRAME_Y);

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView);



        setLocation(frameX,frameY);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);



    }

    public static void main(String[] args) {
        new MainFrame();

    }
}
