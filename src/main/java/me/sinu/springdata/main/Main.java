package me.sinu.springdata.main;

import me.sinu.springdata.domain.Person;
import me.sinu.springdata.repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SiJohn on 1/2/2015.
 */

/**
 * Persists to test.h2.db ( saved in home directory of the user )
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);
        Person p1 = new Person();
        p1.setId(101);
        p1.setName("Kejriwal");

        personRepository.save(p1);
        Person p2 = personRepository.findOne(101);
        if(p2 == null || !p2.getName().equals(p1.getName())) {
            System.out.println("Invalid object received");
            return;
        }

        System.out.println("Test success. Got Person:" + p2.getName());
    }
}
