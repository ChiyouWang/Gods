package cn.itcast.zeus.dao.entity;

public class Demo {
    private Integer id;

    private String name;

    private Byte age;

    private Integer userClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Integer getUserClass() {
        return userClass;
    }

    public void setUserClass(Integer userClass) {
        this.userClass = userClass;
    }
}