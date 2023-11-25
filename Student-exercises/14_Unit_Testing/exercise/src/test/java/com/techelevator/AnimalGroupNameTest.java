package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class AnimalGroupNameTest {
    private AnimalGroupName animalGroupName;

    @Before
    public void setup(){
        animalGroupName = new AnimalGroupName();
    }
    @Test
    public void testGetHerd_Animal(){
        String result = animalGroupName.getHerd("rhino");
        assertEquals("Crash", result);
    }
    @Test
    public void testGetHerd_SecondAnimal(){
        String result = animalGroupName.getHerd("giraffe");
        assertEquals("Tower", result);
    }
    @Test
    public void testGetHerd_ThirdAnimal(){
        String result = animalGroupName.getHerd("elephant");
        assertEquals("Herd", result);
    }
    @Test
    public void testGetHerd_FourthAnimal(){
        String result = animalGroupName.getHerd("lion");
        assertEquals("Pride", result);
    }
    @Test
    public void testGetHerd_FifthAnimal(){
        String result = animalGroupName.getHerd("crow");
        assertEquals("Murder", result);
    }
    @Test
    public void testGetHerd_SixthAnimal(){
        String result = animalGroupName.getHerd("pigeon");
        assertEquals("Kit", result);
    }
    @Test
    public void testGetHerd_SeventhAnimal(){
        String result = animalGroupName.getHerd("flamingo");
        assertEquals("Pat", result);
    }
    @Test
    public void testGetHerd_EighthAnimal(){
        String result = animalGroupName.getHerd("deer");
        assertEquals("Herd", result);
    }
    @Test
    public void testGetHerd_NinthAnimal(){
        String result = animalGroupName.getHerd("dog");
        assertEquals("Pack", result);
    }
    @Test
    public void testGetHerd_unknownAnimal(){
        String result = animalGroupName.getHerd("walrus");
        assertEquals("unknown" , result);
    }
    @Test
    public void testGetHerd_emptyString(){
        String result = animalGroupName.getHerd("");
        assertEquals("unknown", result);
    }
    @Test
    public void testGetHerd_bigRhino(){
        String result = animalGroupName.getHerd("Rhino");
        assertEquals("Crash", result);
    }
    @Test
    public void testGetHerd_isElephant(){
        String result = animalGroupName.getHerd("elephants");
        assertEquals("unknown", result);
    }
}

