package com.google.java.contract.tests;

import dummy.dummy.Foo;
import dummy.dummy.Bar;

import junit.framework.TestCase;


public class PackageSiblingsTest extends TestCase {
    public void testBogusInvariant() {
        Foo a = new Foo();
        Bar b = new Bar(a);
    }
}
