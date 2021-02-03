import com.sun.javafx.geom.transform.BaseTransform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.jar.JarFile;

/**
 * Created by MAMUN on 8/10/2017.
 */
public class Information implements ActionListener{

JFrame loginframe,infoframe;

ArrayList<Students> studentlist=new ArrayList<Students>();
boolean isadmin;
BufferedReader br;
String adminID="00000000001";
String adminPassword="00000000001";
    ///////////////////////////////for login frame
    private JLabel juserid,passward,jbl0;
   // private JPanel pl1,pl2;
    private JPasswordField ps;
    private   JTextField useridtxt;
    private  Container cnlogin;
    private JButton userbttn,adminbtn;
    private ImageIcon imglog;
    Font fn1,fn2,fn0;


    //////////////////////////////for all informaton frame
    ImageIcon img;
    Container cn;
    JPanel panel1,panel2,panel3;
    JLabel back,search,personalinfo,name,batch,id,gender,bloodgroup,birthday,email,contact,parmanentaddress,fathername,mothername,temporaryadress,courselbl,crdtcomplt,image,academiinfo,versityname,department,year,degree,result,loginas;
    JTextField searchtxt1,nametxt2,batchtxt3,idtxt4, bloodgrptxt,birthdaytxt,emailtxt,contacttxt,parmanentaddresstxt,fathernametxt,mothernametxt,temporaryadresstxt,versitynametxt1,versitynametxt2,versitynametxt3,departmenttxt1,departmenttxt2,departmenttxt3,institutenametxt1,institutenametxt2,institutenametxt3,yeartxt1,yeartxt2,yeartxt3,degreetxt1,degreetxt2,degreetxt3,resulttxt1,resulttxt2,resulttxt3;
    JButton logout,reset,save, account_create_hbtn,backpg,btn6,btn7,btn8;
    Font fnt1,fnt2,fnt3;
    JRadioButton male,female;
    ButtonGroup btngrp1;
    JCheckBox spl,dld,data;
    JTextArea coursetxtarea;
    JScrollPane scrl;
    Information()
    {

      //  someStudents();

        log();
        loginframe.setVisible(true);
      // info();
       // infoframe.setVisible(false);


    }
    public void info()

    {

        infoframe = new JFrame();
        infoframe.setSize(1050, 700);
        infoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        infoframe.setTitle("Student Iformation System");
        // img=new ImageIcon(""
        cn = infoframe.getContentPane();
        cn.setLayout(null);
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 1050, 50);
        panel1.setBackground(Color.blue);
        panel1.setLayout(null);
        search = new JLabel(" Search Student by Id");
        fnt1 = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT + Font.PLAIN, 14);
        search.setFont(fnt1);
        search.setBounds(10, 5, 150, 35);
        search.setBackground(Color.BLUE);
        search.setForeground(Color.WHITE);
        search.setOpaque(true);
        searchtxt1 = new JTextField();
        searchtxt1.setBounds(170, 5, 200, 35);
        panel1.add(searchtxt1);
        panel1.add(search);
        cn.add(panel1);
        panel2 = new JPanel();
        panel2.setBounds(0, 50, 1050, 650);
        panel2.setBackground(Color.CYAN);
        panel2.setLayout(null);

        personalinfo = new JLabel(" Personal Information");
        personalinfo.setBounds(0, 5, 140, 30);
        personalinfo.setBackground(Color.YELLOW);
        personalinfo.setForeground(Color.BLACK);
        personalinfo.setOpaque(true);
        loginas = new JLabel("     log in as    "+ useridtxt.getText());
        loginas.setBounds(170, 5, 200, 30);
        loginas.setBackground(Color.MAGENTA);
        loginas.setForeground(Color.BLACK);
        loginas.setOpaque(true);

        name = new JLabel("Name");
        name.setBounds(10, 40, 40, 30);
        nametxt2 = new JTextField();
        nametxt2.setBounds(65, 40, 170, 30);
        panel2.add(nametxt2);
        panel2.add(personalinfo);
        panel2.add(name);
        panel2.add(loginas);

        batch = new JLabel("Batch(Year)");
        batch.setBounds(260, 40, 80, 30);
        batchtxt3 = new JTextField();
        batchtxt3.setBounds(340, 40, 140, 30);
        panel2.add(batchtxt3);
        panel2.add(batch);

        id = new JLabel("   Student ID");
        id.setBounds(530, 40, 80, 30);
        idtxt4 = new JTextField();
        idtxt4.setBounds(620, 40, 140, 30);
        panel2.add(idtxt4);
        panel2.add(id);

        gender = new JLabel("Gender");
        gender.setBounds(10, 100, 50, 30);
        male = new JRadioButton("  Male ");
        male.setBounds(60, 100, 70, 26);
        female = new JRadioButton("Female");
        female.setBounds(160, 100, 70, 26);
        panel2.add(male);
        panel2.add(female);
        panel2.add(gender);
        btngrp1 = new ButtonGroup();
        btngrp1.add(male);
        btngrp1.add(female);

        bloodgroup = new JLabel("Bloood Group");
        bloodgroup.setBounds(260, 100, 80, 30);
        bloodgrptxt = new JTextField();
        bloodgrptxt.setBounds(340, 100, 140, 30);
        panel2.add(bloodgroup);
        panel2.add(bloodgrptxt);

        birthday = new JLabel("Date of Birth");
        birthday.setBounds(540, 100, 80, 30);
        birthdaytxt = new JTextField();
        birthdaytxt.setBounds(620, 100, 140, 30);
        panel2.add(birthday);
        panel2.add(birthdaytxt);

        email = new JLabel("Email");
        email.setBounds(10, 160, 50, 30);
        emailtxt = new JTextField();
        emailtxt.setBounds(65, 160, 170, 30);
        panel2.add(email);
        panel2.add(emailtxt);

        bloodgroup = new JLabel("Bloood Group");
        bloodgroup.setBounds(260, 100, 80, 30);
        bloodgrptxt = new JTextField();
        bloodgrptxt.setBounds(340, 100, 140, 30);
        panel2.add(bloodgroup);
        panel2.add(bloodgrptxt);

        contact = new JLabel("Contact No");
        contact.setBounds(260, 160, 80, 30);
        contacttxt = new JTextField();
        contacttxt.setBounds(340, 160, 140, 30);
        panel2.add(contact);
        panel2.add(contacttxt);

        parmanentaddress = new JLabel("Parmanent Address");
        parmanentaddress.setBounds(500, 160, 120, 30);
        parmanentaddresstxt = new JTextField();
        parmanentaddresstxt.setBounds(620, 160, 140, 30);
        panel2.add(parmanentaddress);
        panel2.add(parmanentaddresstxt);

        fathername = new JLabel("Father name");
        fathername.setBounds(0, 223, 90, 30);
        fathernametxt = new JTextField();
        fathernametxt.setBounds(80, 225, 155, 30);
        panel2.add(fathername);
        panel2.add(fathernametxt);


        mothername = new JLabel("Mother name");
        mothername.setBounds(260, 223, 100, 30);
        mothernametxt = new JTextField();
        mothernametxt.setBounds(340, 225, 140, 30);
        panel2.add(mothername);
        panel2.add(mothernametxt);

        temporaryadress = new JLabel("Temporary Address");
        temporaryadress.setBounds(490, 225, 160, 30);
        temporaryadresstxt = new JTextField();
        temporaryadresstxt.setBounds(620, 228, 140, 30);
        panel2.add(temporaryadress);
        panel2.add(temporaryadresstxt);

        crdtcomplt = new JLabel(" Completed Course List  And Result");
        crdtcomplt.setBounds(800, 35, 200, 30);
        crdtcomplt.setBackground(Color.YELLOW);
        crdtcomplt.setOpaque(true);
        panel2.add(crdtcomplt);

/*
        courselbl = new JLabel();
        courselbl.setBounds(780, 0, 270, 700);
        courselbl.setBackground(Color.blue);
        courselbl.setOpaque(true);
        panel2.add(courselbl);

*/

        coursetxtarea=new JTextArea();
        coursetxtarea.setBounds(860, 100, 160, 700);
        fn0=new Font("arial",Font.LAYOUT_LEFT_TO_RIGHT,16);
        coursetxtarea.setFont(fn0);

        coursetxtarea.setColumns(2);
       // coursetxtarea.setLineWrap(true);
        coursetxtarea.setBackground(Color.blue);
        coursetxtarea.setForeground(Color.white);
        coursetxtarea.setOpaque(true);
    //    coursetxtarea.setWrapStyleWord(true);
        panel2.add(coursetxtarea)
       // scrl=new JScrollPane();
       // scrl.setBounds(800, 100, 20, 20);
     //  scrl.add(coursetxtarea,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    //   panel2.add(scrl);


       /* coursetxt1 = new JTextField();
        coursetxt1.setBounds(200, 410, 120, 30);
       // courselbl.add(coursetxt1);
        coursetxt2 = new JTextField();
        coursetxt2.setBounds(200, 460, 120, 30);
       // courselbl.add(coursetxt2);
        coursetxt3 = new JTextField();
        coursetxt3.setBounds(200, 510, 120, 30);
       // courselbl.add(coursetxt3);


        coursetxt4 = new JTextField();
        coursetxt4.setBounds(200, 410, 120, 30);
        courselbl.add(coursetxt4);
        coursetxt5 = new JTextField();
        coursetxt5.setBounds(200, 460, 120, 30);
        courselbl.add(coursetxt5);
        coursetxt6 = new JTextField();
        coursetxt6.setBounds(200, 510, 120, 30);
        courselbl.add(coursetxt3)*/;


    /*    image = new JLabel("      Imsge");
        image.setBounds(830, 230, 80, 30);
        image.setBackground(Color.MAGENTA);
        image.setOpaque(true);
        panel2.add(image);
*/

        academiinfo = new JLabel("Academic Details");
        academiinfo.setBounds(0, 330, 120, 30);
        academiinfo.setBackground(Color.YELLOW);
        academiinfo.setForeground(Color.BLACK);
        academiinfo.setOpaque(true);
        panel2.add(academiinfo);


        versityname = new JLabel("University / College");
        versityname.setBounds(10, 370, 120, 30);
        versitynametxt1 = new JTextField();
        versitynametxt1.setBounds(10, 410, 160, 30);

        /*running=new JCheckBox("running");
        running.setBounds(125,375,70,20);
        panel2.add(running);*/
        panel2.add(versityname);
        panel2.add(versitynametxt1);


        versitynametxt2 = new JTextField();
        versitynametxt2.setBounds(10, 460, 160, 30);
        panel2.add(versitynametxt2);
        versitynametxt3 = new JTextField();
        versitynametxt3.setBounds(10, 510, 160, 30);
        panel2.add(versitynametxt3);


       /* institutename = new JLabel("Name of Institute");
        institutename.setBounds(200, 370, 120, 30);
        panel2.add(institutename);


        institutenametxt1 = new JTextField();
        institutenametxt1.setBounds(200, 410, 160, 30);

        panel2.add(institutenametxt1);

        institutenametxt2 = new JTextField();
        institutenametxt2.setBounds(200, 460, 160, 30);
        panel2.add(institutenametxt2);
        institutenametxt3 = new JTextField();
        institutenametxt3.setBounds(200, 510, 160, 30);
        panel2.add(institutenametxt3);*/

        department = new JLabel("Department");
        department.setBounds(200, 370, 120, 30);
        panel2.add(department);


        departmenttxt1 = new JTextField();
        departmenttxt1.setBounds(200, 410, 120, 30);

        panel2.add(departmenttxt1);

        departmenttxt2 = new JTextField();
        departmenttxt2.setBounds(200, 460, 120, 30);
        panel2.add(departmenttxt2);
        departmenttxt3 = new JTextField();
        departmenttxt3.setBounds(200, 510, 120, 30);
        panel2.add(departmenttxt3);


        year = new JLabel("Passed Year");
        year.setBounds(350, 370, 120, 30);
        panel2.add(year);


        yeartxt1 = new JTextField();
        yeartxt1.setBounds(350, 410, 120, 30);

        panel2.add(yeartxt1);

        yeartxt2 = new JTextField();
        yeartxt2.setBounds(350, 460, 120, 30);
        panel2.add(yeartxt2);
        yeartxt3 = new JTextField();
        yeartxt3.setBounds(350, 510, 120, 30);
        panel2.add(yeartxt3);

        degree = new JLabel("Degree");
        degree.setBounds(495, 370, 120, 30);
        panel2.add(degree);


        degreetxt1 = new JTextField();
        degreetxt1.setBounds(495, 410, 120, 30);

        panel2.add(degreetxt1);

        degreetxt2 = new JTextField();
        degreetxt2.setBounds(495, 460, 120, 30);
        panel2.add(degreetxt2);
        degreetxt3 = new JTextField();
        degreetxt3.setBounds(495, 510, 120, 30);
        panel2.add(degreetxt3);

        result = new JLabel("Cgpa/Gpa");
        result.setBounds(650, 370, 100, 30);
        panel2.add(result);


        resulttxt1 = new JTextField();
        resulttxt1.setBounds(650, 410, 100, 30);

        panel2.add(resulttxt1);

        resulttxt2 = new JTextField();
        resulttxt2.setBounds(650, 460, 100, 30);
        panel2.add(resulttxt2);
        resulttxt3 = new JTextField();
        resulttxt3.setBounds(650, 510, 100, 30);
        panel2.add(resulttxt3);



        backpg = new JButton("    Back  ");
        backpg.setBounds(10, 550, 120, 35);
        panel2.add(backpg);
        backpg.addActionListener(this);

        logout = new JButton("Logout");
        logout.setBounds(890, 6, 90, 35);
        panel1.add(logout);


        reset = new JButton("Edit information");
        reset.setBounds(590, 6, 140, 35);
        panel1.add(reset);

        save = new JButton("Save Record");
        save.setBounds(750, 6, 120, 35);
        panel1.add(save);

        account_create_hbtn = new JButton("Create a new account");
        account_create_hbtn.setBounds(400, 6, 180, 35);
        panel1.add(account_create_hbtn);


        cn.add(panel2);
         searchtxt1.addActionListener(this);
        logout.addActionListener(this);
        account_create_hbtn.addActionListener(this);
        reset.addActionListener(this);
        save.addActionListener(this);
    }
/////////////////////////////////////////////////////////for login frame
    public void log()
    {
        loginframe =new JFrame();
        fn1=new Font("Arial",Font.BOLD,12);
        fn2=new Font("Arial",Font.BOLD,14);
        cnlogin=loginframe.getContentPane();
        //cn.setBackground(Color.LIGHT_GRAY);
        loginframe.setTitle("Student Information System");
        loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginframe.setSize(700,500);
        loginframe.setLayout(null);
        imglog=new ImageIcon("student.png");
        jbl0=new JLabel(imglog);
        jbl0.setBounds(50,30,imglog.getIconWidth(),imglog.getIconHeight());
        juserid=new JLabel("   User ID");
        passward=new JLabel("   Passward");
        juserid.setFont(fn1);
        passward.setFont(fn1);
        juserid.setBounds(300,65,100,40);
        passward.setBounds(300,155,100,40);
        juserid.setBackground(Color.GREEN);
        passward.setBackground(Color.YELLOW);
        juserid.setOpaque(true);
        passward.setOpaque(true);
        useridtxt=new JTextField(20);
        useridtxt.setBounds(450,60,200,45);
        useridtxt.setBackground(Color.WHITE);
        useridtxt.setOpaque(true);
        useridtxt.setFont(fn1);
        ps=new JPasswordField(15);
        ps.setBounds(450,150,200,45);
        ps.setBackground(Color.WHITE);
        ps.setFont(fn2);
        ps.setOpaque(true);
        ps.setEchoChar('*');
        userbttn=new JButton("User Login");
        adminbtn=new JButton("Administrator Login");
        userbttn.setFont(fn2);
        adminbtn.setFont(fn2);
        userbttn.setBounds(80,350,150,50);
        adminbtn.setBounds(420,350,190,50);
        userbttn.setBackground(Color.BLUE);
        userbttn.setOpaque(true);
        adminbtn.setBackground(Color.RED);
        adminbtn.setForeground(Color.WHITE);
        adminbtn.setOpaque(true);
        userbttn.setForeground(Color.WHITE);
        userbttn.setOpaque(true);
        adminbtn.setOpaque(true);
        cnlogin.add(jbl0);
        cnlogin.add(juserid);
        cnlogin.add(passward);

        cnlogin.add(useridtxt);
        cnlogin.add(ps);
        cnlogin.add(userbttn);
        cnlogin.add(adminbtn);



        userbttn.addActionListener(this);
        adminbtn.addActionListener(this);
        ps.addActionListener(this);

    }


/////////////////////////////////////create some students account before
public    void someStudents()
{
    int i=0;
    String line ;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            while ((line = br.readLine()) != null)
            {
                String [] s=new String[30];
                 s= line.split("  ");
                Students st=new Students(s[0],s[1],s[2],s[3],s[4],s[5],s[6],s[7],s[8],s[9],s[10],s[11],s[12],s[13],s[14],s[15],s[16],s[17],s[18],s[19],s[20],s[21],s[22],s[23],s[24],s[25],s[26],s[27]);
                System.out.println(s[i+3]);
               System.out.println((s[i]+"  "+s[i+1]+"  "+s[i+2]+"  "+s[i+3]+"  "+s[i+4]+" "+s[i+5]+"  "+s[i+6]+"  "+s[i+7]+"  "+s[i+8]+"  "+s[i+9]+"  "+s[i+10]+"  "+s[i+11]+"  "+s[i+12]+"  "+s[i+13]+"  "+s[i+14]+"  "+s[i+15]+"  "+s[i+16]+"  "+s[i+17]+"  "+s[i+18]+"  "+s[i+19]+"  "+s[i+20]+"  "+s[i+21]+"  "+s[i+22]+"  "+s[i+23]+"  "+s[24]));
                studentlist.add(st);

            }
           }catch (Exception e)
        {
e.printStackTrace();
        }

     try {
          FileOutputStream f = new FileOutputStream("f.txt");
          ObjectOutputStream out = new ObjectOutputStream(f);
          out.writeObject( studentlist);
          out.flush();
      }
      catch(Exception exc)
      {
          exc.printStackTrace();
      }


 /* try (FileInputStream fis = new FileInputStream("f.txt");
         ObjectInputStream ois = new ObjectInputStream(fis)) {
        Object o = ois.readObject();
        ArrayList<Students> s;
        s = (ArrayList<Students>) o;
        for(i=0;i<s.size();i++) {
             s.get(i).getId();
             System.out.println(s.get(i).getName());
        }
        ois.close();
    }

catch(Exception em){
    System.out.println(em.getMessage());*/
}






public void actionPerformed(ActionEvent ex) {
    Object ob = ex.getSource();
    if (ob == userbttn) {
        boolean check = false;
        int i;
        try {
            FileInputStream fis = new FileInputStream("f.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            ArrayList<Students> s;
            s = (ArrayList<Students>) o;
            for (i = 0; i < s.size(); i++) {


                char[] pass = ps.getPassword();
                String passString = new String(pass);           //////////////////////more important topic used here
                if ((s.get(i).getId().equals(useridtxt.getText())) && (s.get(i).getPassword().equals(passString))) {
                    info();
                    infoframe.setVisible(true);
                    loginframe.setVisible(false);
                    check = true;
                    searchtxt1.setVisible(true);
                    search.setVisible(true);
                    reset.setVisible(false);
                    save.setVisible(false);
                    account_create_hbtn.setVisible(false);
                    backpg.setVisible(false);

                }
            }

            if (check == false) {

                JOptionPane.showMessageDialog(null, "Incorrect password or User ID  Try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
            }
            fis.close();
        } catch (Exception m) {
            m.printStackTrace();
        }
    } else if (ob == logout) {
        infoframe.setVisible(false);
        loginframe.setVisible(true);
        useridtxt.setText("");
        ps.setText("");

    } else if (ob == adminbtn) {

        info();

        char[] pass = ps.getPassword();
        String passString = new String(pass);
                                              //////////////////////more important topic used here
        if ((adminID.equals(useridtxt.getText())) && (adminPassword.equals(passString))) {
            account_create_hbtn.setVisible(true);
            reset.setVisible(true);
            infoframe.setVisible(true);
            loginframe.setVisible(false);
            save.setVisible(false);
            backpg.setVisible(false);
            isadmin=true;
        } else {

            JOptionPane.showMessageDialog(null, "Incorrect password or Admin ID  Try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
        }
    } else if (ob == account_create_hbtn) {
        //account_create_hbtn.setVisible(false);
        reset.setVisible(false);
        save.setVisible(true);
        searchtxt1.setVisible(false);
        search.setVisible(false);
         backpg.setVisible(true);
        nametxt2.setText("");
        batchtxt3.setText("");
        idtxt4.setText("");
        ///////////////////////gender have to handel
        bloodgrptxt.setText("");
        birthdaytxt.setText("");
        emailtxt.setText("");
        contacttxt.setText("");
        parmanentaddresstxt.setText("");
        fathernametxt.setText("");
        mothernametxt.setText("");
        temporaryadresstxt.setText("");
        /////////////////////////////////////////////////////////////
        versitynametxt1.setText("");
        versitynametxt2.setText("");
        versitynametxt3.setText("");
        ///////////////////////gender have to handel
        departmenttxt1.setText("");
        departmenttxt2.setText("");
        departmenttxt3.setText("");
        yeartxt1.setText("");
        yeartxt2.setText("");
        yeartxt3.setText(" ");
        degreetxt1.setText("  ");
        degreetxt2.setText("  ");
        degreetxt3.setText(" ");
        resulttxt1.setText(" ");
        resulttxt2.setText(" ");
        resulttxt3.setText(" ");


    } else if (ob == reset) {
        searchtxt1.setVisible(true);
        search.setVisible(true);
        account_create_hbtn.setVisible(false);
        save.setVisible(true);
        backpg.setVisible(true);
        reset.setVisible(false);

    } else if (ob == save) {

        searchtxt1.setVisible(true);
        search.setVisible(true);
        account_create_hbtn.setVisible(true);
        save.setVisible(false);
        reset.setVisible(true);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
          int i;
        boolean check1 = false;

       /* for (i = 0; i < studentlist.size(); i++) {
            Students stnd = studentlist.get(i);
            */
        try {
            FileInputStream fis = new FileInputStream("f.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            ArrayList<Students> s;
            s = (ArrayList<Students>) o;
            for (i = 0; i < s.size(); i++) {

                //if (s.get(i).getId().equals(searchtxt1.getText())) {
               //  Students st=s.get(i);
                if (s.get(i).getId().equals(idtxt4.getText())) {


                    String name, batch, id, gender, blood, birtday, email, phn, par_address, tem_address, father, mother,  editPassword;

                    name = nametxt2.getText();
                    batch = batchtxt3.getText();
                    id = idtxt4.getText();
                    //////////////////////////////////////////////////gender have to handel
                    blood = bloodgrptxt.getText();
                    birtday = birthdaytxt.getText();
                    email = emailtxt.getText();
                    phn = contacttxt.getText();
                    par_address = parmanentaddresstxt.getText();
                    tem_address = temporaryadresstxt.getText();
                    father = fathernametxt.getText();
                    mother = mothernametxt.getText();
                    ///////////////////////////////////////////////acdemy field
                    String vc, clg, scl, deprt1, deprt2, deprt3, pasyr1, pasyr2, pasyr3, degree1, degree2, degree3, rslt1, rslt2, rslt3;
                    vc = versitynametxt1.getText();
                    clg = versitynametxt2.getText();
                    scl = versitynametxt3.getText();
                    deprt1 = departmenttxt1.getText();
                    deprt2 = departmenttxt2.getText();
                    deprt3 = departmenttxt3.getText();
                    degree1 = degreetxt1.getText();
                    degree2 = degreetxt2.getText();
                    degree3 = degreetxt3.getText();
                    pasyr1 = yeartxt1.getText();
                    pasyr2 = yeartxt2.getText();
                    pasyr3 = yeartxt3.getText();
                    rslt1 = resulttxt1.getText();
                    rslt2 = resulttxt2.getText();
                    rslt3 = resulttxt3.getText();
                    int reply=JOptionPane.showConfirmDialog(null,"Do You Want edit passward","Conformation",JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                         editPassword = JOptionPane.showInputDialog(null, "Reset password");
                    }
                    else
                    {
                         editPassword=s.get(i).getPassword();
                    }
                  //  char[] pass = ps.getPassword();
                  //  String passString = new String(pass);
                 String crsnm=coursetxtarea.getText();
                 System.out.println(crsnm);
                    Students stdnt = new Students(name, father, mother, id, batch, email, phn, birtday, par_address, tem_address, vc, clg, scl, deprt1, deprt2, deprt3, degree1, degree2, degree3, rslt1, rslt2, rslt3, pasyr1, pasyr2, pasyr3,editPassword, blood,crsnm);
                    s.set(i, stdnt);

                    try {
                        FileOutputStream f = new FileOutputStream("f.txt");
                        ObjectOutputStream out = new ObjectOutputStream(f);
                        out.writeObject(s);
                        out.flush();
                        f.close();
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }

                    System.out.println(name + " same  " + i);
                    check1 = true;
                    break;
                }
                fis.close();
            }
            //////////////////////////////////////////////////////////personal field
            if (check1 == false) {
                String name, batch, id, gender, blood, birtday, email, phn, par_address, tem_address, father, mother;

                name = nametxt2.getText();
                batch = batchtxt3.getText();
                id = idtxt4.getText();
                //////////////////////////////gender have to handel
                blood = bloodgrptxt.getText();
                birtday = birthdaytxt.getText();
                email = emailtxt.getText();
                phn = contacttxt.getText();
                par_address = parmanentaddresstxt.getText();
                tem_address = temporaryadresstxt.getText();
                father = fathernametxt.getText();
                mother = mothernametxt.getText();
                ///////////////////////////////////////////////acdemy field
                String vc, clg, scl, deprt1, deprt2, deprt3, pasyr1, pasyr2, pasyr3, degree1, degree2, degree3, rslt1, rslt2, rslt3;
                vc = versitynametxt1.getText();
                clg = versitynametxt2.getText();
                scl = versitynametxt3.getText();
                deprt1 = departmenttxt1.getText();
                deprt2 = departmenttxt2.getText();
                deprt3 = departmenttxt3.getText();
                degree1 = degreetxt1.getText();
                degree2 = degreetxt2.getText();
                degree3 = degreetxt3.getText();
                pasyr1 = yeartxt1.getText();
                pasyr2 = yeartxt2.getText();
                pasyr3 = yeartxt3.getText();
                rslt1 = resulttxt1.getText();
                rslt2 = resulttxt2.getText();
                rslt3 = resulttxt3.getText();
                String  setPassword=JOptionPane.showInputDialog(null,"Set password");

                // char[] pass = ps.getPassword();
               // String passString = new String(pass);
                Students stdnt = new Students(name, father, mother, id, batch, email, phn, birtday, par_address, tem_address, vc, clg, scl, deprt1, deprt2, deprt3, degree1, degree2, degree3, rslt1, rslt2, rslt3, pasyr1, pasyr2, pasyr3,setPassword, blood,coursetxtarea.getText());
                s.add(stdnt);

                try {
                    FileOutputStream f = new FileOutputStream("f.txt");
                    ObjectOutputStream out = new ObjectOutputStream(f);
                    out.writeObject(s);
                    out.flush();
                    f.close();
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                System.out.println(name + "  new " + i);
            }
        } catch (Exception xy) {

            xy.printStackTrace();
        }
        nametxt2.setText("");
        batchtxt3.setText("");
        idtxt4.setText("");
        ///////////////////////gender have to handel
        bloodgrptxt.setText("");
        birthdaytxt.setText("");
        emailtxt.setText("");
        contacttxt.setText("");
        parmanentaddresstxt.setText("");
        fathernametxt.setText("");
        mothernametxt.setText("");
        temporaryadresstxt.setText("");
        /////////////////////////////////////////////////////////////
        versitynametxt1.setText("");
        versitynametxt2.setText("");
        versitynametxt3.setText("");
        ///////////////////////gender have to handel
        departmenttxt1.setText("");
        departmenttxt2.setText("");
        departmenttxt3.setText("");
        yeartxt1.setText("");
        yeartxt2.setText("");
        yeartxt3.setText(" ");
        degreetxt1.setText("  ");
        degreetxt2.setText("  ");
        degreetxt3.setText(" ");
        resulttxt1.setText(" ");
        resulttxt2.setText(" ");
        resulttxt3.setText(" ");
        coursetxtarea.setText("");

    } else if (ob == searchtxt1) {
        boolean check2 = false;







       /* for (i = 0; i < studentlist.size(); i++) {
            Students stnd = studentlist.get(i);
            // System.out.println(stnd.getId());
*/


        try {



            FileInputStream fl = new FileInputStream("f.txt");
            ObjectInputStream ois = new ObjectInputStream(fl);
            Object o = ois.readObject();
            ArrayList<Students> s;
            s = (ArrayList<Students>) o;
            int i;
            for (i = 0; i < s.size(); i++) {

                if (s.get(i).getId().equals(searchtxt1.getText())) {

                    check2 = true;
                    if(isadmin==true)
                    {
                       account_create_hbtn.setVisible(false);
                    }
                    if (!(useridtxt.getText().equals(adminID))) {
                        infoframe.setVisible(true);
                        loginframe.setVisible(false);
                        searchtxt1.setVisible(true);
                        search.setVisible(true);
                        reset.setVisible(false);
                        save.setVisible(false);
                        account_create_hbtn.setVisible(false);
                    } else {
                        infoframe.setVisible(true);
                        loginframe.setVisible(false);
                        searchtxt1.setVisible(true);
                        search.setVisible(true);
                        reset.setVisible(true);
                        save.setVisible(true);
                        account_create_hbtn.setVisible(false);

                    }

                    /////////////////////////////////////////////////////////////
                    nametxt2.setText(s.get(i).getName());
                    batchtxt3.setText(s.get(i).getBatch());
                    idtxt4.setText(s.get(i).getId());
                    ///////////////////////gender have to handel
                    bloodgrptxt.setText(s.get(i).getBloodgrp());
                    birthdaytxt.setText(s.get(i).getBirthday());
                    emailtxt.setText(s.get(i).getEmail());
                    contacttxt.setText(s.get(i).getPhnNumber());
                    parmanentaddresstxt.setText(s.get(i).getParmanent());
                    fathernametxt.setText(s.get(i).getFatherName());
                    mothernametxt.setText(s.get(i).getMotherName());
                    temporaryadresstxt.setText(s.get(i).getTemproary());
                    /////////////////////////////////////////////////////////////
                    versitynametxt1.setText(s.get(i).getVcName());
                    versitynametxt2.setText(s.get(i).getCollegeName());
                    versitynametxt3.setText(s.get(i).getSchoolName());
                    ///////////////////////gender have to handel
                    departmenttxt1.setText(s.get(i).getDepartment1());
                    departmenttxt2.setText(s.get(i).getDepartment2());
                    departmenttxt3.setText(s.get(i).getDepartment3());
                    yeartxt1.setText(s.get(i).getPassyr1());
                    yeartxt2.setText(s.get(i).getPassyr2());
                    yeartxt3.setText(s.get(i).getPassyr3());
                    degreetxt1.setText(s.get(i).getDegree1());
                    degreetxt2.setText(s.get(i).getDegree2());
                    degreetxt3.setText(s.get(i).getDegree3());
                    resulttxt1.setText(s.get(i).getResult1());
                    resulttxt2.setText(s.get(i).getResult2());
                    resulttxt3.setText(s.get(i).getResult3());
                    coursetxtarea.setText(s.get(i).getCoursename());
                    String mmn=s.get(i).getCoursename();
                    System.out.println(mmn);


                }
            }
            if (check2 == false) {

                JOptionPane.showMessageDialog(null, "Incorrect  ID  Try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
            }

            fl.close();
        } catch (Exception er) {
            er.printStackTrace();
        }

    }
    else if(ob==backpg)
    {
        searchtxt1.setVisible(true);
        search.setVisible(true);
        reset.setVisible(true);
        account_create_hbtn.setVisible(true);
        save.setVisible(false);
    }
   }
}