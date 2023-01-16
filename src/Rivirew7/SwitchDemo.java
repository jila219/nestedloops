package Rivirew7;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter your favorite browser");
        String browser=scan.nextLine();
        switch (browser.toLowerCase()){
            case"chrome":
                System.out.println("Test case excuted in " +browser);break;
            case "saferi":
                System.out.println("Test case excuted in" +browser);break;
            case "Edge":
                System.out.println("Test case excuted in" +browser);break;
            default:
                System.out.println("browser is uknown- no execution");
        }
    }
}
