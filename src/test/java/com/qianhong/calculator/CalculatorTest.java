package com.qianhong.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final CalculatorService calculator = new CalculatorService();

    public void testAdd(){
        assertEquals(5,calculator.Add(2, 3));
    }
}