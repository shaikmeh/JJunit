package com.example.demo.demo;

public class FizzBuzzConverter {
    public String convert(int input) {
        boolean isMultipleOf3 = input % 3 == 0;
boolean isMultipleOf7 = input % 7 == 0;
if (isMultipleOf3 && isMultipleOf7) {
return "FizzBuzz";
} else if (isMultipleOf3) {
return "Fizz";
} else if (isMultipleOf7) {
return "Buzz";
}
return String.valueOf(input);
}
}
