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
    System.out.println("What is the name of this website");
    a=myScanner.nextLine();
    setWebsite(a);
    System.out.println("Do you already have a password for this website");
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
