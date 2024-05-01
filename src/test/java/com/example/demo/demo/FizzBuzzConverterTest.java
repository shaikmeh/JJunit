package com.example.demo.demo;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.assertj.core.api.Assert;




public class FizzBuzzConverterTest {
    @Test
    public void fizzBuzzConverter1() {
    FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
    assertEquals("1", fizzBuzz.convert(1));

}
    @Test
    public void fizzBuzzConvertor2() {
    FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
    assertEquals("2", fizzBuzz.convert(2));
 }
}
  //  @Test
 //   public void fizzBuzzConvertor3() {
  //  FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
 //   assertEquals("Fizz", fizzBuzz.convert(3));
//}
 //    @Test
  //   public void fizzBuzzConvertorMultiplesOfThree() {
 //    FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
 //    assertEquals("Fizz", fizzBuzz.convert(6));
//}
 //    @Test
//     public void fizzBuzzConvertorMultiplesOfSeven() {
//     FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
  //   assertEquals("Buzz", fizzBuzz.convert(7));
//}
  //  @Test
 //   public void fizzBuzzConvertorMultiplesOfThreeAndSeven() {
   // FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
  //  assertNotEquals("FizzBuzz", fizzBuzz.convert(14));
   // assertEquals("FizzBuzz", fizzBuzz.convert(21));
  //  assertEquals("FizzBuzz", fizzBuzz.convert(42));
  //  assertEquals("FizzBuzz", fizzBuzz.convert(63));
//}
//}
    

