package me.sinu.springdata;

import junit.framework.Assert;
import me.sinu.springdata.domain.Person;
import me.sinu.springdata.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by SiJohn on 1/2/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/test/resources/test-context.xml"})

/**
 * Uses in memory database
 */
public class TestPersonRepository {
    @Autowired
    private PersonRepository personRepository;

    @Before
    public void init() {
        Person p1 = new Person();
        p1.setId(101);
        p1.setName("Kejriwal");
        personRepository.save(p1);

        p1 = new Person();
        p1.setId(102);
        p1.setName("Kejriwal");
        personRepository.save(p1);

        p1 = new Person();
        p1.setId(103);
        p1.setName("Kejriwal");
        personRepository.save(p1);
    }

    @Test
    public void testGetList() {
        List<Person> personList = personRepository.getByName("Kejriwal");
        Assert.assertEquals(3, personList.size());
    }
}
