---
toc: True
comments: True
layout: post
title: Java Hello (Classes)
description: None
type: hacks
courses: {'csa': {'week': 1}}
---

The beginning of the code defines the SuperHero class with private instance variables. The SuperHero class has a default constructor that initializes the instance variables to empty values.

<html>
<img src="https://github.com/realethantran/ethan_student/assets/109186517/936e9858-7a69-495b-ac6d-9b1a04ee6e36" height="350px">
</html>


```java
// class definition for SuperHero
public class SuperHero {
    // private instance variables
    private String Name;
    private String Affiliation;
    private String SecretIdentity;
    private String Powers;

    // constructor w/o parameters
    public SuperHero() {
        Name = "";
        Affiliation = "";
        SecretIdentity = "";
        Powers = "";
    }

    // parameterized constructor
    public SuperHero(String name, String, Affiliation, String SecretIdentity, String Powers) {
        this.Name = name;
        this.Affiliation = affiliation;
        this.SecretIdentity = secretIdentity;
        this.Powers = powers;
    }

    // setters to set the values of instance variables
    public void setName(String name) {
        Name = name;
    }

    public void setAffiliation(String affiliation) {
        Affiliation = affiliation;
    }

    public void setSecretIdentity(String secretIdentity) {
        SecretIdentity = secretIdentity;
    }

    public void setPowers(String powers) {
        Powers = powers;
    }

    // getters to get the values of instance variables
    public String getName() {
        return Name;
    }

    public String getAffiliation() {
        return Affiliation;
    }

    public String getSecretIdentity() {
        return SecretIdentity;
    }

    public String getPowers() {
        return Powers;
    }

    public static void main(String[] args) {
        // create an instance using the default constructor
        SuperHero batman = new SuperHero();

        // set the attributes of the superhero objects
        batman.setName("Batman");
        batman.setAffiliation("Justice League");
        batman.setSecretIdentity("Bruce Wayne");
        batman.setPowers("None");

        // create an instance using the parameterized constructor
        SuperHero ultimate_spiderman=("Spiderman", "Champions","Miles Morales", "Super strength, super speed, agility, cling to solid surfaces, invisibility, and venom strike.")

        // use getters to  retrieve and print the values of the attributes
        System.out.println("Name: " + batman.getName());
        System.out.println("Affiliation: " + batman.getAffiliation());
        System.out.println("Secret Identity: " + batman.getSecretIdentity());
        System.out.println("Powers: " + batman.getPowers());
    }

}

```

Using getters I can retrieve the values of instance variables. For example, here I am retrieving the name of the batman instance.


```java
batman.getName();
```

> Output

Bruce Wayne
