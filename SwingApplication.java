import javax.swing.*;          
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class SwingApplication {

    private final static String LABEL_TEXT = "Enter 3 Numbers: ";
    private final static String BUTTON_TEXT = "Calculate";
    private final static String FRAME_TEXT = "Box Volume &Area";
    private int numClicks = 0;


    public Component createComponents() {

        JLabel label = new JLabel(LABEL_TEXT);
        JLabel width=new JLabel("width:");
        JLabel h=new JLabel(("height:"));
        JLabel length= new JLabel("lenght:");
        final JTextField textField = new JTextField(String.valueOf(numClicks));
        JButton button = new JButton(BUTTON_TEXT);

        //createComponents().setPreferredSize(new Dimension(80,23));
        JFrame frame = new JFrame("MyFlowLayout");
        frame.getContentPane().add(button);
        //שלוש תיבות טקסט להזנת נתונים
        JTextField myTextField1 = new JTextField("width");
        myTextField1.setPreferredSize(new Dimension(80,23));
        frame.getContentPane().add(myTextField1);
        int w=0;
        myTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner inputw=new Scanner(System.in);
                int w1=inputw.nextInt();
            }
        });

        JTextField myTextField2 = new JTextField("height");
        myTextField2.setPreferredSize(new Dimension(80,23));
        frame.getContentPane().add(myTextField2);

        JTextField myTextField3 = new JTextField("lengh");
        myTextField3.setPreferredSize(new Dimension(80,23));
        frame.getContentPane().add(myTextField3);

        button.setMnemonic(KeyEvent.VK_G);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numClicks++;
                textField.setText(String.valueOf(numClicks));
            }
        });
        JPanel pane = new JPanel();
        pane.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));           
        pane.setLayout(new GridLayout(0, 1));        
        pane.add(button);
        pane.add(label);
        pane.add(width);
        pane.add(myTextField1);

        pane.add(h);
        pane.add(myTextField2);
        pane.add(length);
        pane.add(textField);

        pane.add(myTextField3);

        return pane;
    }

    public static void main(String[] args) {
       
        JFrame frame = new JFrame(FRAME_TEXT);
        SwingApplication app = new SwingApplication();
        Component contents = app.createComponents();
        frame.getContentPane().add(contents, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setSize(280,150);
        frame.setVisible(true);
    }
}
