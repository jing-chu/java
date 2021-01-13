package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //A regular expression is a sequence of characters that forms a search pattern.
	    String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");  //Character: I
        System.out.println(yourString);
        System.out.println(string);

        String alphanumeric = "abcDeeeF12Ghhiiijkl99z";
        //Predefined character class: . (Any character)
        System.out.println(alphanumeric.replaceAll(".","Y"));

        String secondString = "abcDeeeF12abcDeeeGhhiiijkl99z";
        // Boundary matchers: ^ (The beginning of a line)
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiijkl99z"));
        System.out.println(alphanumeric.matches("abcDeeeF12abcDeeeGhhiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("iijkl99z", "`THE END"));
        //character classes [abc]: a,b,or c (simple class)
        System.out.println(alphanumeric.replaceAll("[aei]","X"));
        System.out.println(alphanumeric.replaceAll("[aei]","REGULAR EXPRESSION"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","***"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiijkl99z";
        //Any character except a, b, or c
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        //a through f, or A through F, or 3 through 8
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","X"));
        //???
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));
        //predefined character class: \d (a digit [0-9]), \\: to escape \
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        // A non-digit: [^0-9]
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        //\t: The tab character; \n: the newline character;
        String hasWhitespace = "I have blank and\ta tab, and also a newline\n!!";
        System.out.println(hasWhitespace);
        // A whitespace character: [ \t\n\x0b\f\r]
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "@"));
        // a non-whitespace character: [^\s]
        System.out.println(hasWhitespace.replaceAll("\\S", "&"));
        // A word character: [a-zA-Z_0-9]
        System.out.println(newAlphanumeric.replaceAll("\\w", "A"));
        System.out.println(hasWhitespace.replaceAll("\\w", "^"));
        //A non-word character: [^\w]
        System.out.println(hasWhitespace.replaceAll("\\W", "X"));
        // Boundary matchers: \b (a word boundary)
        System.out.println(hasWhitespace.replaceAll("\\b", "<p>"));

        String thirdAlphanumericString = "abcDeeeF12Ghhiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDeee","YYY"));
        //Greedy quantifiers e{3}: e,exactly 3 times
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}","YYY"));
        //Gready quantifiers e+: e,one or more times
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*","YYY"));

//        String thirdAlphanumericString = "abcDF12Ghhiiijkl99z";
//        System.out.println(thirdAlphanumericString.replaceAll("^abcDeee","YYY"));
//        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}","YYY"));
//        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+","YYY"));
//        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*","YYY"));

        //Greedy quantifiers e{2,5}: e, at least 2 but not more than 5 times
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("12G{2,5}","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something. </p>");
        htmlText.append("<p>This is another paragraph about something else. </p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<h2></h2>");
        htmlText.append("<p>Here is the summary. </p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern); // first compile regex into an instance of the Pattern class
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();  //we can only use matcher once
        int count = 0;
        while (matcher.find()) {
            count ++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        //String h2GroupPattern = "(<h2>.*</h2>)";  // X* greedy quantifier
        String h2GroupPattern = "(<h2>.+?</h2>)";   // X*? lazy quantifier
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
            //System.out.println("Occurrence-0: " + groupMatcher.group(0));
        }

        String h2TextGroup = "(<h2>)(.+?)(</h2>)";  //three groups: 1,2,3
        Pattern h2TextPattern = Pattern.compile(h2TextGroup);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence multiple groups: " + h2TextMatcher.group(2));
        }

        System.out.println("harryHarry".replaceAll("[H|h]arry", "L"));  //logical OR
        //"abc" logical AND: "a" and "b" and "c"

        //logical NO negation character class vs negative lookahead
        String tvTest = "tstvtkt";
        //String tNotVRegExp = "t[^v]"; //negation character class
        String tNotVRegExp = "t(?!v)";  //negative lookahead
        Pattern tNoVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotMatcher = tNoVPattern.matcher(tvTest);

        count =0;
        while(tNotMatcher.find()) {
            count ++;
            System.out.println("Occurrence not tv: " + count + " : " + tNotMatcher.start() + " to " + tNotMatcher.end());
        }
        // t(?=v)  output: Occurrence not tv: 1 : 2 to 3

        // real world uses
        // input validation: (800) 123-4567

        String phoneNo = "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
        String phone1 = "1234567890";
        String phone2 = "(123) 456-7890";
        String phone3 = "123 456-789";

        System.out.println("phone1 = " + phone1.matches(phoneNo));
        System.out.println("phone2 = " + phone2.matches(phoneNo));
        System.out.println("phone3 = " + phone3.matches(phoneNo));

    }
}
