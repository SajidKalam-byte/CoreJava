/*Q10. Extract Domain from URL
Problem Statement: A digital marketing company wants to extract the domain name from a given URL. Write a Java program that:
 Accepts a URL.
 Extracts and displays only the domain name.
Example Input/Output:
Input:Enter URL: https://www.google.com/search?q=java
Output: Domain: google.com */

import java.util.*;

class URLProcessor {
    // Method to extract the domain name
    String extractDomain(String url) {
        try {
            // Split using "://" to ignore protocol (http/https)
            String[] parts = url.split("://");
            if (parts.length < 2) return "Invalid URL"; // Handle invalid URLs
            
            // Extract domain by splitting at '/' to isolate the core domain
            String domainPart = parts[1].split("/")[0];

            // Remove "www." if present to extract clean domain
            if (domainPart.startsWith("www.")) {
                domainPart = domainPart.substring(4);
            }
            
            return domainPart;
        } catch (Exception e) {
            return "Invalid URL";
        }
    }
}

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = sc.nextLine();

        // Creating object of URLProcessor class
        URLProcessor processor = new URLProcessor();
        String domain = processor.extractDomain(url);

        System.out.println("Domain: " + domain);
    }
}


