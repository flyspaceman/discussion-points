package test;

public class Lastname implements ILastname<Lastname.Builder,Lastname> {
    private final String lastname;

    public Lastname(Builder builder) {
        this.lastname = builder.lastname;
    }
    @Override
    public Builder getBuilder() {
        return new Builder();
    }
    @Override
    public Builder getBuilderFromThis() {
        return new Builder(this);
    }
    public String getLastname() {
        return lastname;
    }

    public static class Builder implements ILastname.IBuilder<Lastname,Builder> {
        private String lastname;
        public Builder() {};
        public Builder(Lastname instance) {
            this.lastname = instance.lastname;

        }
        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        @Override
        public Lastname build() {
            return new Lastname(this);
        }
    }

}
