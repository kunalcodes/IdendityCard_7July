package com.example.idendity_card;

public class Person {
    private int image;
    private String company;
    private String age;
    private String profession;

    public Person(int image, String company, String age, String profession) {
        this.image = image;
        this.company = company;
        this.age = age;
        this.profession = profession;
    }

    public int getImage() {
        return image;
    }

    public String getCompany() {
        return company;
    }

    public String getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}
