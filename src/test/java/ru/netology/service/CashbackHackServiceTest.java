package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainNoRefund() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainNoRefundZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainRefund() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);

    }
}