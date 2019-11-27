import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class STTestMain extends JFrame{
    STDrawingArea drawingArea = new STDrawingArea();
    public STTestMain()
    {
        //JFrame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Spelling Trainer");
        setResizable(false);
        setVisible(true);


        //Panel of buttons
        JPanel buttonContainer = new JPanel();
        JButton btnRedPen = new JButton("Red Pen");
        JButton btnGreenPen = new JButton("Green Pen");
        JButton btnBluePen = new JButton("Blue Pen");
        JButton btnClear = new JButton("Clear");
        buttonContainer.add(btnRedPen);
        buttonContainer.add(btnGreenPen);
        buttonContainer.add(btnBluePen);
        buttonContainer.add(btnClear);

        //Drawing Area instantiation

        //Adding things to JFrame
        getContentPane().add(drawingArea);
        getContentPane().add(buttonContainer,BorderLayout.PAGE_END);
        pack();


        //button listener
        btnRedPen.addActionListener(new ActionListener() {                      // RED

            Boolean toggleRed = false;
            Boolean toggleGreen = false;
            Boolean toggleBlue = false;
        
            public void actionPerformed(ActionEvent e) {
                toggleRed = !toggleRed;
                toggleGreen =false;                
                toggleBlue = false;
                if(toggleRed) {
                    drawingArea.setCurrentColor(Color.RED);
                    btnRedPen.setForeground(Color.RED);
                    btnGreenPen.setForeground(Color.BLACK);
                    btnBluePen.setForeground(Color.BLACK);
                }
                else {
                    drawingArea.setCurrentColor(Color.BLACK);
                    btnRedPen.setForeground(Color.BLACK);
                }
            }
        });

        btnGreenPen.addActionListener(new ActionListener() {                    // GREEN

            Boolean toggleGreen =  false;
            Boolean toggleBlue = false;
            Boolean toggleRed = false;

            public void actionPerformed(ActionEvent e) {
                toggleGreen =!toggleGreen;
                toggleBlue = false;
                toggleRed = false;
                if(toggleGreen) {
                    drawingArea.setCurrentColor(Color.GREEN);
                    btnGreenPen.setForeground(Color.GREEN);
                    btnRedPen.setForeground(Color.BLACK);
                    btnBluePen.setForeground(Color.BLACK);
                }
                else {
                    drawingArea.setCurrentColor(Color.BLACK);
                    btnGreenPen.setForeground(Color.BLACK);
                }
            }
        });
        btnBluePen.addActionListener(new ActionListener() {                      // BLUE
            Boolean toggleBlue = false;
            Boolean toggleGreen =  false;
            Boolean toggleRed = false;

            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                toggleRed =false;
                toggleGreen = false;
                toggleBlue = !toggleBlue;
                if(toggleBlue) {
                    drawingArea.setCurrentColor(Color.BLUE);
                    btnBluePen.setForeground(Color.BLUE);
                    btnGreenPen.setForeground(Color.BLACK);
                    btnRedPen.setForeground(Color.BLACK);
                }
                else {
                    drawingArea.setCurrentColor(Color.BLACK);
                    btnBluePen.setForeground(Color.BLACK);
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                drawingArea.clearDrawings();
            }
        });
    }


    public static void main(String args[])
    {
        STTestMain test = new STTestMain();
    }

}
