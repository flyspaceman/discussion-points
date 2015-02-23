package test;

public interface IFullname<B extends IFullname.IBuilder<C,B>, C extends IFullname<B,C>> extends IFirstname<B,C>, ILastname<B,C>{



    public interface IBuilder<B extends IFullname<C,B>, C extends IBuilder<B,C>> extends IFirstname.IBuilder<B,C>, ILastname.IBuilder<B,C>{



    }
}
