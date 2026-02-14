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


    /*
     teste 1 : Adicao normal
     */
    @Test
    public void testAdditionNormal() {
        calculator.setFirstOperand(new BigDecimal("5"));
        calculator.setMathBinaryOperation("ADD");
        BigDecimal result = calculator.calculate(new BigDecimal("3"));
        System.out.println("ESPERADO: 8");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("8"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }
     /*
     teste 2 : Adicao com numeros negativos
     */

    @Test
    public void testAdditionWithNegative() {
        calculator.setFirstOperand(new BigDecimal("-5"));
        calculator.setMathBinaryOperation("ADD");
        BigDecimal result = calculator.calculate(new BigDecimal("3"));
        System.out.println("ESPERADO: -2");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("-2"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");

    }
    /*
        teste 3 : subtracao normal
        */
    @Test
    public void testSubtractionNormal() {
        calculator.setFirstOperand(new BigDecimal("10"));
        calculator.setMathBinaryOperation("SUBTRACT");
        BigDecimal result = calculator.calculate(new BigDecimal("4"));
        System.out.println("ESPERADO: 6");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("6"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }
    /*
        teste 4 : subtracao com resultado negativos
        */
    @Test
    public void testSubtractionNegativeResult() {
        calculator.setFirstOperand(new BigDecimal("3"));
        calculator.setMathBinaryOperation("SUBTRACT");
        BigDecimal result = calculator.calculate(new BigDecimal("10"));
        System.out.println("ESPERADO: -7");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("-7"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }
    /*
        teste 5 : multiplicacao normal
        */
    @Test
    public void testMultiplicationNormal() {
        calculator.setFirstOperand(new BigDecimal("4"));
        calculator.setMathBinaryOperation("MULTIPLY");
        BigDecimal result = calculator.calculate(new BigDecimal("5"));
        System.out.println("ESPERADO: 20");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("20"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }
    /*
        teste 6 : multiplicaco por zero
        */
    @Test
    public void testMultiplicationByZero() {
        calculator.setFirstOperand(new BigDecimal("10"));
        calculator.setMathBinaryOperation("MULTIPLY");
        BigDecimal result = calculator.calculate(new BigDecimal("0"));
        System.out.println("ESPERADO: 0");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("0"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }
    /*
        teste 7 : divisao normal
        */
    @Test
    public void testDivisionNormal() {
        calculator.setFirstOperand(new BigDecimal("20"));
        calculator.setMathBinaryOperation("DIVIDE");
        BigDecimal result = calculator.calculate(new BigDecimal("4"));
        System.out.println("ESPERADO: 5");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("5"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }
    /*
        teste 8 :  percententagem
        */
    @Test
    public void testPercentOf() {
        calculator.setFirstOperand(new BigDecimal("20"));
        calculator.setMathBinaryOperation("PERCENT_OF");
        BigDecimal result = calculator.calculate(new BigDecimal("50"));
        System.out.println("ESPERADO: 10");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("10"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }
    /*
        teste 9 : reset da calculadora
        */
    @Test
    public void testResetCalculator() {
        calculator.setFirstOperand(new BigDecimal("10"));
        calculator.setMathBinaryOperation("ADD");
        calculator.reset();
        BigDecimal result = calculator.calculate(new BigDecimal("5"));
        System.out.println("ESPERADO: 5");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("5"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }
    /*
        teste 10 : numeros decimais na adicao
        */
    @Test
    public void testDecimalNumbers() {
        calculator.setFirstOperand(new BigDecimal("2.5"));
        calculator.setMathBinaryOperation("ADD");
        BigDecimal result = calculator.calculate(new BigDecimal("3.7"));
        System.out.println("ESPERADO: 6.2");
        System.out.println("OBTIDO: " + result);
        assertEquals(new BigDecimal("6.2"), result);
        System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
        System.out.println("========================================\n");
    }


    @Test
    public void testIntentional(){
        System.out.println("teste de falha intencional");
        calculator.setFirstOperand(new BigDecimal("5"));
        calculator.setMathBinaryOperation("ADD");

        BigDecimal result = calculator.calculate(new BigDecimal("3"));

        System.out.println("Esperado errado '10");
        System.out.println("obtido: " + result);

        try {
            assertEquals(new BigDecimal("10"), result);
            System.out.println("RESULTADO: TESTE PASSOU COM SUCESSO!");
            System.out.println("========================================\n");
        } catch (AssertionError e){
            System.out.println("Teste falhou");
            throw e;
        }


    }
}