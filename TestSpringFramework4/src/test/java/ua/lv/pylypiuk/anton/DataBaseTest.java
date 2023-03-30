package ua.lv.pylypiuk.anton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseTest {

    @Test
    public void testScanner() {
        DataBase dataBase = new DataBase();
        dataBase.setNumber1(10);
        dataBase.setNumber2(5);
        dataBase.setAction("-");
        assertEquals(10, dataBase.getNumber1());
        assertEquals(5, dataBase.getNumber2());
        assertEquals("-", dataBase.getAction());
    }

    @Test
    public void testSubtraction() {
        DataBase dataBase = new DataBase();
        dataBase.setNumber1(10);
        dataBase.setNumber2(5);
        dataBase.setAction("-");
        dataBase.subtraction();
        assertEquals(5, dataBase.getResult());
    }

    @Test
    public void testAddition() {
        DataBase dataBase = new DataBase();
        dataBase.setNumber1(10);
        dataBase.setNumber2(5);
        dataBase.setAction("+");
        dataBase.addition();
        assertEquals(15, dataBase.getResult());
    }

    @Test
    public void testMultiplication() {
        DataBase dataBase = new DataBase();
        dataBase.setNumber1(10);
        dataBase.setNumber2(5);
        dataBase.setAction("*");
        dataBase.multiplication();
        assertEquals(50, dataBase.getResult());
    }

    @Test
    public void testDivision() {
        DataBase dataBase = new DataBase();
        dataBase.setNumber1(10);
        dataBase.setNumber2(5);
        dataBase.setAction("/");
        dataBase.division();
        assertEquals(2, dataBase.getResult());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        DataBase dataBase = new DataBase();
        dataBase.setNumber1(10);
        dataBase.setNumber2(0);
        dataBase.setAction("/");
        dataBase.division();
    }
}
