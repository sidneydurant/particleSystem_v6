package particlesystem_v7;

import java.awt.Canvas;
import javax.swing.*;

// TODO: make resizeable when paused (have getPaused method in renderClass
// and if true setUndecorated(false);, and vice versa

public class ParticleSystem_v7 extends Canvas {
  
  public static final int WIDTH = 1920;
  public static final int HEIGHT = 1200;
  public static final int TICK = 16;
  
  public static boolean paused = false;

  public static void main(String[] args) {

    final JFrame frame = new JFrame("");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WIDTH, HEIGHT);
    frame.setUndecorated(true);
    frame.setResizable(false);
    frame.setFocusable(true);

    final RenderClass_v7 ren = new RenderClass_v7(WIDTH, HEIGHT);
    frame.add(ren);

    frame.setVisible(true);
    
    Thread runThread = new Thread(new Runnable() {
      public void run() {
        while (true) {
          long time = System.currentTimeMillis();
          
          if( !ren.getPaused() && paused){
            frame.setOpacity(1f);
          }
          
          paused = ren.getPaused();
          
          if( !paused ){
            //ren.tick();
            ren.repaint();
          } else {
            frame.setOpacity(.5f);
          }
          
          long endtime = System.currentTimeMillis();
          try {
            Thread.sleep( - (endtime - time));
          } catch (Exception e) {
            System.out.println("cannot sleep");
          }
        }
      }
    });

    runThread.start();

  }
}