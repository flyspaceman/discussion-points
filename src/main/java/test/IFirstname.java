package test;

public interface IFirstname<B extends IFirstname.IBuilder<C,B>, C extends IFirstname<B,C>> extends IValue<B,C>{

    public String getFirstname();

    public interface IBuilder<B extends IFirstname<C,B>, C extends IBuilder<B,C>> extends IValue.IBuilder<B,C>{

        public C setFirstname(String firstname);

    }
}
