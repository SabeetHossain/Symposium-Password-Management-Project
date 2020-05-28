import java.util.Scanner;
public class SystemFact 
{ 
  static Scanner myScanner = new Scanner(System.in);
  private int passLength;
  private static String websiteName="";
  private Boolean hasSpecial;
  private int minLength;
  private int maxLength;
  public static void main(String args[]){
    setThing();
    System.out.println(getWebsite());
  }
  public static void setThing()
  {
    String a;
    String b;
    String Password;
    System.out.println("What is the name of this website");
    a=myScanner.nextLine();
    setWebsite(a);
    System.out.println("Do you already have a password for this website(y/n)");
    b=myScanner.nextLine();
    if(b=="y")
    {
     //end generation of this password save users password and moves on to the next site
     System.out.println("What is the password you are using?");
     Password=myScanner.nextLine();
    }
    else if(b="n")
    {
    //continue password generating
      
    }
  }
 
  public static void setWebsite(String aname)
  {
    websiteName=aname;
  }

  public static String getWebsite()
  {
    return websiteName;
  }
}
