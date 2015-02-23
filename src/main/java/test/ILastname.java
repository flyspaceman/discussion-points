package test;

public interface ILastname<B extends ILastname.IBuilder<C,B>, C extends ILastname<B,C>> extends IValue<B,C> {

    public String getLastname();

    public interface IBuilder<B extends ILastname<C,B>, C extends IBuilder<B,C>> extends IValue.IBuilder<B,C>{

        public C setLastname(String lastname);

    }
}
