---
toc: True
comments: True
layout: post
title: Java Hello
description: None
type: hacks
courses: {'csse': {'week': 1}, 'csp': {'week': 0, 'categories': []}, 'csa': {'week': 0}}
---

The beginning of the code defines the SuperHero class with private instance variables. The SuperHero class has a default constructor that initializes the instance variables to empty values.


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
        SuperHero ultimate_spiderman = newSuperHero()

        // set the attributes of the superhero objects
        batman.setName("Batman");
        batman.setAffiliation("Justice League");
        batman.setSecretIdentity("Bruce Wayne");
        batman.setPowers("None");

        ultimate_spiderman.setName("Spiderman");
        ultimate_spiderman.setAffiliation("Champions");
        ultimate_spiderman.setSecretIdentity("Miles Morales");
        ultimate_spiderman.setPower("Super strength, super speed, agility, cling to solid surfaces, invisibility, and venom strike.")

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
