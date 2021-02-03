import java.io.Serializable;

/**
 * Created by ASUS on 9/22/2017.
 */
public class Students implements Serializable{






/////////////////////////////////////////personal information
    private String name;
    private String fathername;
    private String mothername;
    private String id;
    private String batch;
    private String email;
    private String phnnumber;
    private String birthday;
    private String bloodgrp;
    private String parmanent;
    private String temproary;
    private String password;
////////////////////////////////////////academy information
private String vcname;
    private String collegename;
    private String schoolname;
    private String department1;
    private String department2;
    private String department3;
    private String degree1;
    private String degree2;
    private String degree3;
    private String result1;
    private String result2;
    private String result3;
    private String passyr1;
    private String passyr2;
    private String passyr3;
    private String coursename;


    //////////////////conostructor
    Students(String name, String fathername,String mothername, String id, String batch, String email,String phnnumber,String birthday,String parmanent,String temproary, String vcname, String collegename,String schoolname,String department1,String department2, String department3,String degree1,String degree2,String degree3, String result1, String result2, String result3,String passyr1,String passyr2,String passyr3 ,String password,String bloodgrp,String coursename)
    {
          this.name=name;
          this.fathername=fathername;
          this.mothername=mothername;
          this.id=id;
          this.batch=batch;
          this.email=email;
          this.phnnumber=phnnumber;
          this.birthday=birthday;
          this.parmanent=parmanent;
          this.temproary=temproary;
          this.password=password;
           this.bloodgrp=bloodgrp;


        this.vcname=vcname;
        this.collegename=collegename;
        this.schoolname=schoolname;
        this.department1=department1;
        this.department2=department2;
        this.department3=department3;
        this.degree1=degree1;
        this.degree2=degree2;
        this.degree3=degree3;
        this.result1=result1;
        this.result2=result2;
        this.result3=result3;
        this.passyr1=passyr1;
        this.passyr2=passyr2;
        this.passyr3=passyr3;
        this.coursename=coursename;








    }






    ////////////////////////setter method///////////personal info
    public void setName(String str)
    {
        name=str;
    }

    public void setFatherName(String str)
    {
        fathername=str;
    }

    public void setMotherName(String str)
    {
        mothername=str;
    }

    public void setId(String str)
    {
        id=str;
    }

    public void setBatch(String str)
    {
        batch=str;
    }

    public void setEmail(String str)
    {
        email=str;
    }

    public void setPhnNumber(String str)
    {
        phnnumber=str;
    }

    public void setBirthday(String str)
    {
        birthday=str;
    }
    public void setParmanent(String str)
    {
        birthday=str;
    }
    public void setTemproary(String str)
    {
        birthday=str;
    }
    public void setPassword(String str)
    {
        password=str;
    }
    public void setBloodgrp(String str)
    {
        bloodgrp=str;
    }

    //////////////////////// //gettter method
    public String getName()
    {
        return name;
    }

    public String getFatherName()
    {
        return fathername;
    }

    public String getMotherName()
    {
        return mothername;
    }

    public String getId()
    {
        return id;
    }

    public  String getBatch()
    {
        return batch;
    }

    public  String  getEmail()
    {
        return email;
    }

    public  String  getPhnNumber()
    {
        return phnnumber;
    }

    public  String  getBirthday()
    {
        return  birthday;
    }
    public  String  getParmanent()
    {
        return parmanent;
    }
    public  String  getTemproary() {return temproary; }
    public  String  getPassword() {return password; }
    public  String  getBloodgrp() {return bloodgrp; }


    //////////////////////////////////////////////////////////academy info
    public void setVcName(String str)

    {
        vcname=str;
    }

    public void setCollegeName(String str)

    {
        collegename=str;
    }
    public void setSchoolName(String str)

    {
        schoolname=str;
    }

    public void setDepartment1(String str)

    {
        department1=str;
    }

    public void setDepartment2(String str)

    {
        department2=str;
    }

    public void setDepartment3(String str)


    {
        department3=str;
    }

    public void setDegree1(String str)

    {
        degree1=str;
    }

    public void setDegree2(String str)

    {
        degree2=str;
    }

    public void setDegree3(String str)

    {
        degree3=str;
    }
    public void setResult1(String str)
    {
        result1=str;
    }
    public void setResult2(String str)
    {
        result2=str;
    }

    public void setResult3(String str)

    {
        result3=str;
    }
    public void setPassyr1(String str)


    {
        passyr1=str;
    }
    public void setPassyr2(String str)
    {
        passyr2=str;
    }
    public void setPassyr3(String str)
    {
        passyr3=str;
    }
    public void setCoursename(String str)
    {
        coursename=str;
    }
///////////////////////////////getter method

    public String getVcName()

    {
        return vcname;
    }

    public String getCollegeName()

    {
        return collegename;
    }
    public String getSchoolName()

    {
        return schoolname;
    }

    public String getDepartment1()

    {
        return  department1;
    }

    public String getDepartment2()

    {
        return department2;
    }

    public String getDepartment3()


    {
        return department3;
    }

    public  String getDegree1()

    {
        return degree1;
    }

    public String getDegree2()

    {
        return degree2;
    }

    public String getDegree3()

    {
        return degree3;
    }
    public String getResult1( )
    {
        return result1;
    }
    public String getResult2( )
    {
        return result2;
    }

    public String getResult3()

    {
        return result3;
    }
    public String getPassyr1()


    {
        return  passyr1;
    }
    public String getPassyr2()
    {
        return passyr2;
    }
    public String getPassyr3()
    {
        return  passyr3;
    }
    public String getCoursename()
    {
        return  coursename;
    }

}
