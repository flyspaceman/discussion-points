package test;

public interface IValue<B extends IValue.IBuilder<C,B>, C extends IValue<B,C>> {
    public B getBuilder();
    public B getBuilderFromThis();

    public interface IBuilder<B extends IValue<C,B>, C extends IBuilder<B,C>> {
        public B build();
    }

}
