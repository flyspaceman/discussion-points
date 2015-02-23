package test;

import org.junit.Test;

public class FullnameTest {
    public static final String LASTNAME = "EXAMPLE_LASTNAME";

    public static final String FIRSTNAME = "EXAMPLE_FIRSTNAME";
    public Fullname EXAMPLE_FULLNAME() {
        return new Fullname
                .Builder()
                .setFirstname(FIRSTNAME)
                .setLastname(LASTNAME)
                .build();
    }
    @Test
    public void testSame() {

    }

    public static class Strange<T extends IFirstname<S, T>,S extends IFirstname.IBuilder<T,S>>{
        T t;
        public void setFirstname(String firstname) {
            this.t = t.getBuilder().setFirstname(firstname).build();

        }
        public T getT() {
            return t;
        }
    }
    public static class Stranger<T extends IFullname<S,T>, S extends IFullname.IBuilder<T,S>> extends Strange<T,S> {
        public void setLastname(String firstname) {
            this.t = t.getBuilder().setLastname(firstname).build();

        }
    }
}