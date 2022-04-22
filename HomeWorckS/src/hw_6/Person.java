package hw_6;

/*Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
        метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.*/

public class Person {

    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {

    }

    String getName() {
        if (sex == "M") {
            return "Mr." + name;
        } else {

            return "Mrs." + name;
        }
    }
}

