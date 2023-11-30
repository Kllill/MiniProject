package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {

    /* 测试代码
    if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
            triOut = 4;
            return (triOut);
        }
    */
    @Test
    public void testTriang(){
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(0,-1,7));
    }
    @Test
    public void testTriang1(){
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(0,-1,0));
    }
    @Test
    public void testTriang2(){
        Tritype tri = new Tritype();
        assertEquals(1,tri.Triang(3,4,5));
    }

}