package local.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

// https://dev.java/learn/api/streams/

public class Demo01Streams {
    
    int[] numbers = {1, 2, 34, 67};
    IntStream sNumbers = Arrays.stream(numbers);


    public int sumSquaresGreaterThan (int limit, IntStream sNumbers ) {
        return sNumbers
            .map(num -> num * num)
            .filter(num -> num > limit)
            .reduce((acc, num) -> acc += num)
            .orElse(-1);
    }


    public void makeMap() {
        IntStream sNumbersNew = sNumbers.map(number -> number * number);
        makeForEach(sNumbersNew);
    }
    

    public void makeFilter() {
        IntStream sNumbersNew = sNumbers.filter(number -> number > 10);
        makeForEach(sNumbersNew);
    }

    public void makeReduce() {
       OptionalInt newValue = sNumbers.reduce( (int acc, int number ) -> { 
            acc = acc + number; 
            return acc;
        });
       System.out.println(newValue);
    }


    public void makeForEach(IntStream sNumbers) {
        sNumbers.forEach(number -> System.out.println(number));
    }


    public static void main(String[] args) {

        Demo01Streams demo = new Demo01Streams();
        // demo.makeForEach(demo.sNumbers);
        // demo.makeMap();
        // demo.makeFilter();
        System.out.println(
            demo.sumSquaresGreaterThan(10_000, demo.sNumbers)
        );
        
    }



}
