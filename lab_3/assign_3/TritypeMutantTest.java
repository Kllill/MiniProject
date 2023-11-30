package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutantTest {

    @Test
    public void testTriangMutantOne(){
        TritypeMutantOne tri = new TritypeMutantOne();
        assertEquals(4,tri.Triang(2,2,5));
    }

    @Test
    public void testTriangMutantTwo(){
        TritypeMutantTwo tri = new TritypeMutantTwo();
        assertEquals(4,tri.Triang(3,3,6));
    }
}
