package com.company;

public class Person {

    // поля
    private final boolean man;
    private final String name;
    private Person spouse;

    // конструктор
    public Person(boolean man, String name){
        this.man = man;
        this.name = name;
        spouse = null;
    }

    // сравнение личностей
    public boolean equalPerson(Person person, boolean man, String name){
        if(person == null)
            return false;
        if(person.man != man)
            return false;
        if(!spouse.name.equals(name))
            return false;

        return true;
    }


    // свадьба
    public boolean marry(Person person){
        if(person == null)
            return false;
        if(this.man == person.man)
            return false; // одинаковый пол
        if( equalPerson(this.spouse, person.man, person.name) )
            return false; // одинаковые личности
        if( equalPerson(person.spouse, this.man, this.name) )
            return false; // одинаковые личности

        return true;
    }

    // развод
    public boolean divorce(){
        if(this.spouse != null){
            this.spouse = null;
            return true;
        }

        return false;
    }
}

