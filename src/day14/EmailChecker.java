package day14;

public class EmailChecker {

    public static void main(String[] args) {

        String email= "nrn123@gmail.com";

        if(!email.contains("@") ){

            System.out.println("invalid email");

        }else if(email.contains(" ")){

            System.out.println("invalid email");

        }else if(email.endsWith("@gmail")){

            System.out.println("gmail.com");

        }else if(email.endsWith("@yahoo.com")){

        System.out.println("yahoo email");

        }else if(email.endsWith("@mail.ru.com")){

            System.out.println("russian email");
        }
    }



    }

