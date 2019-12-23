package day12;

public class LoginTest {

    public static void main(String[] args) {

        String userName = "user123";
        String password="345678";

        if(userName.equals("user123") && password.equals("pass123") ){

            System.out.println("Log in successfully !!!");

        }else if(!userName.equals("user123") && password.equals("pass123")){

            System.out.println("Your username is not correct");

        }else if(userName.equals("user123") && !password.equals("pass123")){
            System.out.println("Your password is not correct");
        }
    }
}
