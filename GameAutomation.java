package gameautomation;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
/**
 *
 * @author Sanket Amin
 */
public class GameAutomation{
    
    public static void main(String[] args) {
        //x=717
        int  x = 730,y = 300,width = 430,height = 360;
//Y=620,H=1
        Rectangle rect = new Rectangle(x,620,width,1);
        Rectangle rect1 = new Rectangle(x,y,width,655);
        try{
           Robot robot = new Robot();
           int acc = 0;  
           int score = 0;
//           long current = System.currentTimeMillis();
            while(true){        
//              System.out.println(bi.getHeight() +" " +bi.getWidth());
//                if(score/6<=10){
                    BufferedImage bi = robot.createScreenCapture(rect);
//                  for(int i = 0 ; i < bi.getWidth() ; i++){
                    for(int i = 0 ; i < 4 ; i++){
//                      Color c = new Color(bi.getRGB(i,0));
                        Color c = new Color(bi.getRGB(i*115,0));
                        if(c.equals(Color.BLACK)){
//                        System.out.print("found black pixel!!!\n");
//                        System.out.println(MouseInfo.getPointerInfo().getLocation());
//                        robot.mouseMove((x+i+50), 695+acc);
                            robot.mouseMove((x+(i*115)+50), 695+acc);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(10);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            acc += 0.08;
//                            score++;                            
                            break;
                        }
                    }
//                    System.out.println("less" + score/6);
//                }
//                else{
//                    BufferedImage bi = robot.createScreenCapture(rect1);
//                    for(int j = 0 ; j < 4 ; j++){
//                        for(int i = 0 ; i < 4 ; i++){
//                            Color c = new Color(bi.getRGB(i*115,75+(j*192)));
//                            if(c.equals(Color.BLACK)){
//                                robot.mouseMove((x+(i*115)+50), y+150+(j*192)+acc);
//                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//                                robot.delay(0);
//                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//                                acc += 0.08;
//                                break;
//                            }
//                        }
//                    }
//                    System.out.println("else");
//                }
//            System.out.println((System.currentTimeMillis()-current));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
