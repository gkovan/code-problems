package com.example.demos.functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/*
 * Sources for this example:
 * 
 * https://dev.to/phouchens/functional-programming-in-java-refactoring-if-else-logic-with-the-help-
 * of-functional-interfaces-2hcj
 * 
 * and
 * 
 * https://dev.to/phouchens/exploring-functional-programming-in-java-functional-interfaces-1phe
 */
public class FuncInt {

    public static class MyResponse {
        private String contentType;

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public String getContentType() {
            return contentType;
        }
    }

    public static void formatResponseUsingIfElseIf(String format, MyResponse response) {
        if ("csv".equals(format)) {
            response.setContentType("csv");
        }
        else if ("html".equals(format)) {
            response.setContentType("html");
        }
        else if ("pdf".equals(format)) {
            response.setContentType("pdf");
        }
        else if ("xml".equals(format)) {
            response.setContentType("xml");
        }
        else {
            response.setContentType("text");
        }
    }

    private static Consumer<MyResponse> csvStrategy = response -> {
        response.setContentType("csv");
    };

    private static Consumer<MyResponse> htmlStrategy = response -> {
        response.setContentType("html");
    };

    private static Consumer<MyResponse> xmlStrategy = response -> {
        response.setContentType("xml");
    };

    private static Consumer<MyResponse> pdfStrategy = response -> {
        response.setContentType("pdf");
    };

    private static Map<String, Consumer<MyResponse>> createStrategies() {
        Map<String, Consumer<MyResponse>> strategies = new HashMap<>();
        strategies.put("csv", csvStrategy);
        strategies.put("html", htmlStrategy);
        strategies.put("pdf", pdfStrategy);
        strategies.put("xml", xmlStrategy);
        return strategies;
        // return Collection.unmodifiableMap(strategies);
    }

    public static void formatResponseUsingFunctionalInterfaces(String format, MyResponse response) {
        Map<String, Consumer<MyResponse>> strategies = createStrategies();
        strategies.getOrDefault(format, xmlStrategy).accept(response);
    }

    public static void main(String args[]) {

        // uses if else if
        MyResponse myResponse1 = new MyResponse();
        formatResponseUsingIfElseIf("csv", myResponse1);
        System.out.println(myResponse1.getContentType());

        // replace if else if with functional interfaces
        MyResponse myResponse2 = new MyResponse();
        formatResponseUsingFunctionalInterfaces("html", myResponse2);
        System.out.print(myResponse2.getContentType());

        System.out.println("");
    }
}
