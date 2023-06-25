package com.latest.features;

public class StringBlock {
    public static void main(String[] args) {
//        String json = "{\n" +
//                "firstName : Rajasekhar\n" +
//                "lastName : Karampudi\n" +
//                "}";

        String json = """
                {
                    "firstName" : "Rajasekhar",
                    "lastName" : "Karampudi",
                }
                """;

        System.out.println(json);
    }
}
