package kjkrol.calculator.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class CalculatorTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    // TESTE 1: Adição Normal
    @Test
    public void testAdditionNormal() {
        calculator.setFirstOperand(new BigDecimal("5"));
        calculator.setMathBinaryOperation("ADD");
        BigDecimal result = calculator.calculate(new BigDecimal("3"));
        assertEquals(new BigDecimal("8"), result);
    }
    
    // TESTE 2: Adição com Números Negativos
    @Test
    public void testAdditionWithNegative() {
        calculator.setFirstOperand(new BigDecimal("-5"));
        calculator.setMathBinaryOperation("ADD");
        BigDecimal result = calculator.calculate(new BigDecimal("3"));
        assertEquals(new BigDecimal("-2"), result);
    }
    
    // TESTE 3: Subtração Normal
    @Test
    public void testSubtractionNormal() {
        calculator.setFirstOperand(new BigDecimal("10"));
        calculator.setMathBinaryOperation("SUBTRACT");
        BigDecimal result = calculator.calculate(new BigDecimal("4"));
        assertEquals(new BigDecimal("6"), result);
    }
    
    // TESTE 4: Subtração com Resultado Negativo
    @Test
    public void testSubtractionNegativeResult() {
        calculator.setFirstOperand(new BigDecimal("3"));
        calculator.setMathBinaryOperation("SUBTRACT");
        BigDecimal result = calculator.calculate(new BigDecimal("10"));
        assertEquals(new BigDecimal("-7"), result);
    }
    
    // TESTE 5: Multiplicação Normal
    @Test
    public void testMultiplicationNormal() {
        calculator.setFirstOperand(new BigDecimal("4"));
        calculator.setMathBinaryOperation("MULTIPLY");
        BigDecimal result = calculator.calculate(new BigDecimal("5"));
        assertEquals(new BigDecimal("20"), result);
    }
    
    // TESTE 6: Multiplicação por Zero
    @Test
    public void testMultiplicationByZero() {
        calculator.setFirstOperand(new BigDecimal("10"));
        calculator.setMathBinaryOperation("MULTIPLY");
        BigDecimal result = calculator.calculate(new BigDecimal("0"));
        assertEquals(new BigDecimal("0"), result);
    }
    
    // TESTE 7: Divisão Normal
    @Test
    public void testDivisionNormal() {
        calculator.setFirstOperand(new BigDecimal("20"));
        calculator.setMathBinaryOperation("DIVIDE");
        BigDecimal result = calculator.calculate(new BigDecimal("4"));
        assertEquals(new BigDecimal("5"), result);
    }
    
    // TESTE 8: Percentagem (PERCENT_OF)
    @Test
    public void testPercentOf() {
        calculator.setFirstOperand(new BigDecimal("20"));
        calculator.setMathBinaryOperation("PERCENT_OF");
        BigDecimal result = calculator.calculate(new BigDecimal("50"));
        assertEquals(new BigDecimal("10"), result);
    }
    
    // TESTE 9: Reset da Calculadora
    @Test
    public void testResetCalculator() {
        calculator.setFirstOperand(new BigDecimal("10"));
        calculator.setMathBinaryOperation("ADD");
        calculator.reset();
        BigDecimal result = calculator.calculate(new BigDecimal("5"));
        assertEquals(new BigDecimal("5"), result);
    }
    
    // TESTE 10: Números Decimais em Adição
    @Test
    public void testDecimalNumbers() {
        calculator.setFirstOperand(new BigDecimal("2.5"));
        calculator.setMathBinaryOperation("ADD");
        BigDecimal result = calculator.calculate(new BigDecimal("3.7"));
        assertEquals(new BigDecimal("6.2"), result);
    }
}