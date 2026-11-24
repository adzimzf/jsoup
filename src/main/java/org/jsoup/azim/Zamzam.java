package org.jsoup.azim;
import org.jsoup.parser.Parser;


public class Zamzam {
    public static String parse(String html, Parser parser) {
        return parser.defaultNamespace();
    }

    private String name(String test){
        parse(test);
        return  "";
    }

    String text() {
        return """
            hello
            """;
    }

}
