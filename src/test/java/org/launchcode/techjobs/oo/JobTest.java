package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
public class JobTest {
    //TODO: Create your unit tests here
   @Test
    public void testSettingJobId() {
        Job emptyJobOne = new Job();
        Job emptyJobTwo = new Job();
        assertNotEquals(emptyJobOne.getId(), emptyJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        String name = "Product tester";
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType position = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job test_job = new Job(name, employer, location, position, coreCompetency);

        assertEquals(name, test_job.getName());
        assertEquals(employer, test_job.getEmployer());
        assertEquals(location, test_job.getLocation());
        assertEquals(position, test_job.getPositionType());
        assertEquals(coreCompetency, test_job.getCoreCompetency());

        assertTrue(employer instanceof Employer);
        assertTrue(location instanceof Location);
        assertTrue(position instanceof PositionType);
        assertTrue(coreCompetency instanceof CoreCompetency);
        assertTrue(test_job instanceof Job);
    }

   @Test
    public void testJobsForEquality() {
       Job emptyJobOne = new Job("Anakin Skywalker", new Employer("Jedi Council"), new Location("Coruscant"), new PositionType("General of the 501st"), new CoreCompetency("General"));
       Job emptyJobTwo = new Job("Anakin Skywalker", new Employer("Jedi Council"), new Location("Coruscant"), new PositionType("General of the 501st"), new CoreCompetency("General"));

       assertFalse(equals(emptyJobOne) != equals(emptyJobTwo));
   }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job emptyJobThree = new Job("Anakin Skywalker", new Employer("Jedi Council"), new Location("Coruscant"), new PositionType("not the rank of master"), new CoreCompetency("General"));

        String newline = System.lineSeparator();
            String testToString = newline +
                    "ID: " + emptyJobThree.getId() +
                    "Name: " + emptyJobThree.getName() +
                    "Employer: " + emptyJobThree.getEmployer() +
                    "Location: " + emptyJobThree.getLocation() +
                    "Position Type: " + emptyJobThree.getPositionType() +
                    "Core Competency: " + emptyJobThree.getCoreCompetency() + newline;


        assertEquals(emptyJobThree.toString().startsWith(newline) && emptyJobThree.toString().endsWith(newline), emptyJobThree.toString().startsWith(newline) && emptyJobThree.toString().endsWith(newline));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job emptyJobThree = new Job("Anakin Skywalker", new Employer("Jedi Council"), new Location("Coruscant"), new PositionType("not the rank of master"), new CoreCompetency("General"));

        String newline = System.lineSeparator();
        String testToString =
                newline +
                "ID: " + emptyJobThree.getId() + newline +
                "Name: " + emptyJobThree.getName() + newline +
                "Employer: " + emptyJobThree.getEmployer() + newline +
                "Location: " + emptyJobThree.getLocation() + newline +
                "Position Type: " + emptyJobThree.getPositionType() + newline +
                "Core Competency: " + emptyJobThree.getCoreCompetency() + newline;

        assertEquals(testToString, emptyJobThree.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job emptyJobThree = new Job("Anakin Skywalker", new Employer("Jedi Council"), new Location(""), new PositionType(""), new CoreCompetency(""));

        String newline = System.lineSeparator();
        String testToString =
                newline +
                        "ID: " + emptyJobThree.getId() + newline +
                        "Name: " + emptyJobThree.getName()  + newline +
                        "Employer: " + emptyJobThree.getEmployer() + newline +
                        "Location: Data not available" + newline +
                        "Position Type: Data not available" + newline +
                        "Core Competency: Data not available" + newline;

        assertEquals(testToString, emptyJobThree.toString());
    }

}
