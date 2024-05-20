package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testTrueAdd() {
        Assert.assertEquals(3.0, MathQuestionService.q1Addition("1", "2"), 0);
    }

    @Test
    public void testAddNumber1Empty() {
        try {
            MathQuestionService.q1Addition("", "2");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testAddNumber2Empty() {
        try {
            MathQuestionService.q1Addition("1", "");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testAddBothNumbersEmpty() {
        try {
            MathQuestionService.q1Addition("", "");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testAddInvalidNumber1() {
        try {
            MathQuestionService.q1Addition("abc", "2");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testAddInvalidNumber2() {
        try {
            MathQuestionService.q1Addition("1", "xyz");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testTrueSubtract() {
        Assert.assertEquals(1.0, MathQuestionService.q2Subtraction("3", "2"), 0);
    }

    @Test
    public void testSubtractNumber1Empty() {
        try {
            MathQuestionService.q2Subtraction("", "2");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testSubtractNumber2Empty() {
        try {
            MathQuestionService.q2Subtraction("1", "");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testSubtractBothNumbersEmpty() {
        try {
            MathQuestionService.q2Subtraction("", "");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testSubtractInvalidNumber1() {
        try {
            MathQuestionService.q2Subtraction("abc", "2");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testSubtractInvalidNumber2() {
        try {
            MathQuestionService.q2Subtraction("1", "xyz");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testTrueMultiply() {
        Assert.assertEquals(6.0, MathQuestionService.q3Multiplication("3", "2"), 0);
    }

    @Test
    public void testMultiplyNumber1Empty() {
        try {
            MathQuestionService.q3Multiplication("", "2");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testMultiplyNumber2Empty() {
        try {
            MathQuestionService.q3Multiplication("1", "");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testMultiplyBothNumbersEmpty() {
        try {
            MathQuestionService.q3Multiplication("", "");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testMultiplyInvalidNumber1() {
        try {
            MathQuestionService.q3Multiplication("abc", "2");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void testMultiplyInvalidNumber2() {
        try {
            MathQuestionService.q3Multiplication("1", "xyz");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }
}
