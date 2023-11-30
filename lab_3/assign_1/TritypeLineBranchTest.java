package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeLineBranchTest {
    @Test
    public void testTriang1(){
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(1,2,7));
    }

    @Test
    public void testTriang2(){
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(2,2,7));
    }

    @Test
    public void testTriang3(){
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(-1,-2,3));
    }

    @Test
    public void testTriang4(){
        Tritype tri = new Tritype();
        assertEquals(2,tri.Triang(2,3,2));
    }

    @Test
    public void testTriang5(){
        Tritype tri = new Tritype();
        assertEquals(2,tri.Triang(2,7,7));
    }

    @Test
    public void testTriang6(){
        Tritype tri = new Tritype();
        assertEquals(1,tri.Triang(3,4,5));
    }

    @Test
    public void testTriang7(){
        Tritype tri = new Tritype();
        assertEquals(2,tri.Triang(4,4,5));
    }

}