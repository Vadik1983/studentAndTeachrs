public class User extends Human {

    private final String patronymic;

    public User(String name, String lastName, String patronymic, int age) {
        super(name, lastName, patronymic);
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + name + '\'' +
                ", secondName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + age +
                '}';
    }

    @Override
    public Comparable<String> name() {
        return null;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getName() != null ? !getName().equals(user.name()) :
                user.getName() != null) {
            return false;
        }

        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        if (getLastName() != null ? !getLastName().equals(user.getLastName()) :
                user.getLastName() != null) {
            return false;
        }
        return getAge() != 0 ? getAge() == user.getAge():
                user.getAge() == 0;
    }
}
