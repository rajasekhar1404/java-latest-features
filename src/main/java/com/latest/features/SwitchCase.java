package com.latest.features;

public class SwitchCase {
    public static void main(String[] args) {
        String type = "";

        String domain = "com";

        type = switch (domain) {
            case "com" -> "Google";
            case "in" ->  "Microsoft";
            case "org" -> "GitHub";
            default -> "db";
        };

        System.out.println(type);
    }

}
