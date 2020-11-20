/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenty;

import java.awt.*;
import javax.swing.*;

public class FaceBean extends JComponent {
    private int mMouthWidth = 90;
    private boolean mColor = true;
    private boolean mSmile = true;
    private int er = 4;
    private boolean onOff;
    private boolean labelOnOff;
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        // Face
        int w = getWidth();
        int h = getHeight();
        int pad = 12;
        int cw = w - pad * 2;
        int ch = h - pad * 2;
        //g2.setColor(getBackground());
        if(mColor == true)
        {
            g2.setColor(Color.GREEN);
        }
        else
        {
            g2.setColor(Color.RED);
        }
        g2.fillArc(pad, pad, cw, ch, 0, 360);
        g2.setColor(getForeground());
        g2.drawArc(pad, pad, cw, ch, 0, 360);
        // Mouth
        int sw = cw / 2;
        int sh = ch / 2;
      
        if (mSmile == true){
            g2.drawArc(w / 2 - sw / 2, h / 2 - sh / 2, sw, sh, 270 - mMouthWidth / 2, mMouthWidth);
        }else{
            g2.drawArc(w / 2 - sw / 2, h / 2 + sh / 3, sw, sh, 90 - mMouthWidth / 2, mMouthWidth);
        }
        // Eyes
        
        g2.fillArc(w / 2 - cw * 1 / 8 - er / 2, h / 2 - ch / 4 - er, er, er, 0, 360);
        g2.fillArc(w / 2 + cw * 1 / 8 - er / 2, h / 2 - ch / 4 - er, er, er, 0, 360);
        

    }
    
    public int er(){
        return er;
    }
    
    
    public int getMouthWidth() {
        return mMouthWidth;
    }
    
    public void setMouthWidth(int mw) {
        mMouthWidth = mw;
        repaint();
    }
   
    public boolean getOnOff()
    {
        return onOff;
    }
       
      public void faceColor(){
        mColor = !mColor;
        repaint();
    }
      
    public void smile() {
        mSmile = !mSmile;
        repaint();
    }
    
  
    
    public void excitment(){
        if(er >= 6){
            er = 3;
        }
        else
            er = 10;
        repaint();
    }
    
    public void setEyes(int mw) { 
         er = mw;
         repaint();
    }

    private void repaint(Color RED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

