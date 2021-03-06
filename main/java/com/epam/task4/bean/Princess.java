package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Princess extends Treasure {
    private String name;
    private String birthplace;
    private short age;
    private boolean damnation;

    public Princess() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public boolean isDamnation() {
        return damnation;
    }

    public void setDamnation(boolean damnation) {
        this.damnation = damnation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Princess princess = (Princess) o;

        if (damnation != princess.damnation) {
            return false;
        }
        if (age != princess.age) {
            return false;
        }
        if (name == null) {
            return false;
        } else {
            if (!name.equals(princess.name)) {
                return false;
            }
        }
        if (birthplace == null) {
            return false;
        } else {
            if (!birthplace.equals(princess.birthplace)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getBirthplace() != null ? getBirthplace().hashCode() : 0);
        result = 31 * result + (int) getAge();
        result = 31 * result + (isDamnation() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "name='" + name + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", age=" + age +
                ", damnation=" + damnation +
                '}';
    }
}
