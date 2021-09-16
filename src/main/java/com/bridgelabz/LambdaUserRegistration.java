package com.bridgelabz;

import java.util.regex.Pattern;

    @FunctionalInterface
    interface Validator {
        boolean verify(String regexPattern, String inputString);

        static void printComparisonResult(Validator functionObject, String regexPattern, String inputString) {
            if (functionObject.verify(regexPattern, inputString)) {
                System.out.println(inputString + " ACCEPTED ENTRY");
            } else System.out.println(inputString + " DENIED ENTRY");
        }
    }
    public class LambdaUserRegistration {
        public static void main(String[] args) {
            //LAMBDA FUCNTION
            Validator entryValidator=(String regexPattern, String inputString)-> Pattern.matches(regexPattern,inputString);
            //FIRST NAME
            System.out.println("Firstname Validation");
            System.out.println("Entered Credentails correct:: "+entryValidator.verify("^[A-Z]{1}[a-z]{2,}","Shubham"));
            Validator.printComparisonResult(entryValidator,"^[A-Z]{1}[a-z]{2,}","Shubham");
            Validator.printComparisonResult(entryValidator,"^[A-Z]{1}[a-z]{2,}","shubham");
            //LASTNAME
            System.out.println("Lastname Validation");
            System.out.println("Entered Credentails correct:: "+entryValidator.verify("^[A-Z]{1}[a-z]{2,}","Bandagale"));
            Validator.printComparisonResult(entryValidator,"^[A-Z]{1}[a-z]{2,}","Bandagale");
            Validator.printComparisonResult(entryValidator,"^[A-Z]{1}[a-z]{2,}","bandagale");
            //EMAIL
            System.out.println("Email Valiation");
            System.out.println("Entered Credentails correct:: "+entryValidator.verify("[a-zA-Z]+[.]*[a-zA-Z]*[@][b][l][.][c][o][.]*[in]*","shubham.bridglelabz@bl.co.in"));
            Validator.printComparisonResult(entryValidator,"[a-zA-Z]+[.]*[a-zA-Z]*[@][b][l][.][c][o][.]*[in]*","shubham.bridglelabz@bl.co.in");
            Validator.printComparisonResult(entryValidator,"[a-zA-Z]+[.]*[a-zA-Z]*[@][b][l][.][c][o][.]*[in]*","shubham.bridglelabzbl.co.in");
//PHONENUMBER
            System.out.println("PhoneNumber Validation");
            System.out.println("Entered Credentails correct:: "+entryValidator.verify("[9][1](?:\\s|-)*[0-9]{10}","91 9004608395"));
            Validator.printComparisonResult(entryValidator,"[9][1](?:\\s|-)*[0-9]{10}","91 9004608395");
            Validator.printComparisonResult(entryValidator,"[9][1](?:\\s|-)*[0-9]{10}","9004608395");
//PASSWORD
            System.out.println("Password Validation");
            System.out.println("Entered Credentails correct:: "+entryValidator.verify("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}","Haywards@5000"));
            Validator.printComparisonResult(entryValidator,"(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}","Haywards@5000");
            Validator.printComparisonResult(entryValidator,"(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}","aywards5000");

        }
    }



