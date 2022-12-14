/*@Purpose::Ability to check valid regex.
 *@File:: Email Validator Using Regex
 *@Author:: Shubham Raj
 */

package com.regex_email;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexValidation {
    /*
     * @purpose: Ability to check valid regex
     *
     * @param: takes regex and user data as input
     *
     * @function : compiles given regex using pattren.compile method matches input
     * and regex gives a boolean output
     *
     * @return: Returns true or false
     */
    static public boolean isValid(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        return Pattern.matches(regex, input);

    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the emails to test\n");
            try (Scanner scanner = new Scanner(System.in)) {
                String email = scanner.next();
                boolean regexCheck = isValid("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@"
                        + "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$", email);
                System.out.println(regexCheck);
            }
        }

    }

}