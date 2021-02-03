import javax.swing.*;
import java.awt.*;


public class Login extends JFrame {
    private JLabel jbl1,jbl2,jbl0;
    private JPanel pl1,pl2;
    private JPasswordField ps;
    private   JTextField txt;
    private  Container cn;
    private JButton jb1,jb2;
    private ImageIcon img;
    Font fn1,fn2;

    Login()
    {
        log();
        setVisible(true);
    }
    public void log()
    {

        fn1=new Font("Arial",Font.BOLD,12);
        fn2=new Font("Arial",Font.BOLD,14);
        cn=this.getContentPane();
        //cn.setBackground(Color.LIGHT_GRAY);
        this.setTitle("Student Information System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        this.setLayout(null);
        img=new ImageIcon("student.png");
        jbl0=new JLabel(img);
        jbl0.setBounds(50,30,img.getIconWidth(),img.getIconHeight());
        jbl1=new JLabel("   Username");
        jbl2=new JLabel("   Passward");
        jbl1.setFont(fn1);
        jbl2.setFont(fn1);
        jbl1.setBounds(300,65,100,40);
        jbl2.setBounds(300,155,100,40);
        jbl1.setBackground(Color.GREEN);
        jbl2.setBackground(Color.YELLOW);
        jbl1.setOpaque(true);
        jbl2.setOpaque(true);
        txt=new JTextField(40);
        txt.setBounds(450,60,200,45);
        txt.setBackground(Color.WHITE);
        txt.setOpaque(true);
        txt.setFont(fn1);
        ps=new JPasswordField(15);
        ps.setBounds(450,150,200,45);
        ps.setBackground(Color.WHITE);
        ps.setFont(fn2);
        ps.setOpaque(true);
        ps.setEchoChar('*');
        jb1=new JButton("User Login");
        jb2=new JButton("Administrator Login");
        jb1.setFont(fn2);
        jb2.setFont(fn2);
        jb1.setBounds(80,350,150,50);
        jb2.setBounds(420,350,190,50);
        jb1.setBackground(Color.BLUE);
        jb1.setOpaque(true);
        jb2.setBackground(Color.RED);
        jb2.setForeground(Color.WHITE);
        jb2.setOpaque(true);
        jb1.setForeground(Color.WHITE);
        jb1.setOpaque(true);
        jb2.setOpaque(true);
        cn.add(jbl0);
        cn.add(jbl1);
        cn.add(jbl2);

        cn.add(txt);
        cn.add(ps);
        cn.add(jb1);
        cn.add(jb2);

    }


}
