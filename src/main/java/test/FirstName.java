package test;

public class FirstName implements IFirstname<FirstName.Builder,FirstName> {
        private final String firstname;

        public FirstName(Builder builder) {
            this.firstname = builder.firstname;
        }
        @Override
        public Builder getBuilder() {
            return new Builder();
        }
        @Override
        public Builder getBuilderFromThis() {
            return new Builder(this);
        }
        public String getFirstname() {
            return firstname;
        }

    public static class Builder implements IFirstname.IBuilder<FirstName,Builder> {
        private String firstname;
        public Builder() {};
        public Builder(FirstName instance) {
            this.firstname = instance.firstname;

        }
        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        @Override
        public FirstName build() {
            return new FirstName(this);
        }
    }

}
