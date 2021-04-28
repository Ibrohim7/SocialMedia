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
                    social.name = "Instagram";
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
                    social.model = "2021";
                    social.users = 975763112;
                    social.price = 9;
                    social.year = 2000;
                    social.color = "red";
                    social.developer = "Ibrokhim";
                    social(social);
                    break;
                case 3:
                    social.name = "Facebook";
                    social.model = "2021";
                    social.users = 975763112;
                    social.price = 9;
                    social.year = 2000;
                    social.color = "red";
                    social.developer = "Ibrokhim";
                    social(social);
                    break;
                case 4:
                    social.name = "Twitter";
                    social.model = "2021";
                    social.users = 975763112;
                    social.price = 9;
                    social.year = 2000;
                    social.color = "red";
                    social.developer = "Ibrokhim";
                    social(social);
                    break;
            }
        }
    }
}

