package com.SetApp;

import java.util.Scanner;

public class newObject {
    static void social(SocialMedia media) {
        System.out.println(
                "name "+media.name+"\n"+
                "year "+media.year+"\n"+
                "price "+media.price+"\n"+
                "color "+media.color+"\n"+
                        "developer "+media.developer+"\n"+
                        "users "+media.users+"\n"+
                        "model "+media.model


        );
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocialMedia social = new SocialMedia();
        int command;
        while (true) {
            System.out.println("1=>Instagram, 2=>Telegram, 3=>Facebook, 4=>Twitter");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    social.name ="Instagram";
                            social.model = "2021";
                            social.users = 975763112;
                            social.price = 9;
                            social.year = 2000;
                            social.color = "red";
                            social.developer = "Ibrokhim";
                            social(social);
                    break;
                case 2:
                    social.name = "Telegram";
                    social.model = "X";
                    social.users = 6457631;
                    social.price = 9;
                    social.year = 2003;
                    social.color = "blue";
                    social.developer = "Ibrokhim";
                    social(social);
                    break;
                case 3:
                    social.name = "Facebook";
                    social.model = "SP";
                    social.users = 635112;
                    social.price = 0.9;
                    social.year = 1980;
                    social.color = "blue";
                    social.developer = "Ibrokhim";
                    social(social);
                    break;
                case 4:
                    social.name = "Twitter";
                    social.model = "LK";
                    social.users = 5133112;
                    social.price = 6;
                    social.year = 1998;
                    social.color = "blue nd white";
                    social.developer = "Ibrokhim";
                    social(social);
                    break;
            }
        }
    }
}

