package dummy.dummy;

import com.google.java.contract.Invariant;

@Invariant("true")
public class Bar {
    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }
}