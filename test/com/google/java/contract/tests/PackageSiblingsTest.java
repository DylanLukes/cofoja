package com.google.java.contract.tests;

import com.google.java.contract.examples.dummy.Bar;
import junit.framework.TestCase;

import com.google.java.contract.examples.dummy.Foo;

public class PackageSiblingsTest extends TestCase {
    public void testBogusInvariant() {
        Foo a = new Foo();
        Bar b = new Bar(a);
    }
}
