package singletonClass;
/* 
Singleton Class: Admin
The singleton class assists the admin login operation. Only a single object for Admin class will ever be created. 
*/
 public class Admin {
    private volatile static Admin admin = null;
    private static String admID = "adminID@marketplace.com";
    private static String pwd = "abc@123";

   // A private constructor prevents any other class from instantiating. Exists only to defeat instantiation. 
   private Admin(String adminID, String password) {
        if(adminID.equals(admID) && password.equals(pwd))
            System.out.println("Admin Login Successful !!");
        else if(!adminID.equals(admID)) {
            System.out.println("Admin ID is incorrect. Login Unsuccessful !!");
            //App.main(null);
        }
        else if(!password.equals(pwd)) {
            System.out.println("Admin Password is incorrect. Login Unsuccessful !!");
            //App.main(null);
        }
        else {
            System.out.println("You have not entered all the fields");
            //App.main(null);
        }
            
    }

/* 
Static 'instance' method: getInstance(...)
The static modifier means this method will be called without the existence of an object; 
If no object exists one will be created; if one already exists, it will be re-used. 
*/
   public static Admin getInstance(String adminID, String password) {
    // synchronized block to remove overhead
    synchronized(Admin.class) {
    if(admin == null) 
        admin = new Admin(adminID, password); //lazy loading

     return admin;
        }
    }     
}
