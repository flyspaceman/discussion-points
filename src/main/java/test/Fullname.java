package test;

public class Fullname implements IFullname<Fullname.Builder,Fullname> {
    public final FirstName firstName;
    public final Lastname lastname;

    public Fullname(Builder builder) {
        this.firstName = builder.firstName;
        this.lastname = builder.lastname;
    }

    public String getFirstname() {
        return firstName.getFirstname();
    }

    public String getLastname() {
        return lastname.getLastname();
    }

    @Override
    public Builder getBuilderFromThis() {
        return new Builder(this);
    }

    @Override
    public Builder getBuilder() {
        return new Builder();
    }

    public static class Builder implements IFullname.IBuilder<Fullname, Fullname.Builder> {

        public FirstName firstName;
        public Lastname lastname;

        public Builder() {
        }

        public Builder(Fullname fullname) {
            this.firstName = fullname.firstName;
            this.lastname = fullname.lastname;

        }

        public Builder setFirstname(String firstName) {
            this.firstName = new FirstName.Builder().setFirstname(firstName).build();
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = new Lastname.Builder().setLastname(lastname).build();
            return this;
        }

        @Override
        public Fullname build() {
            return new Fullname(this);
        }
    }
}
