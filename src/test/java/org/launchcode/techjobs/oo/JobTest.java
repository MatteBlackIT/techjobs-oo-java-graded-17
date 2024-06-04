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
            public void testJobConstructorSetsAllFields () {
        Job emptyJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(name, test_job.getName()); assertEquals(employer, test_job.getEmployer());
        assertEquals(location, test_job.getLocation()); assertEquals(position, test_job.getPositionType());
        assertEquals(coreCompetency, test_job.getCoreCompetency());

        assertTrue(employer instanceof Employer); assertTrue(location instanceof Location); assertTrue(position instanceof PositionType);
        assertTrue(coreCompetency instanceof CoreCompetency); assertTrue(test_job instanceof Job);
   }

   @Test
    public void testJobsForEquality() {
       Job emptyJobOne = new Job("Anakin Skywalker", new Employer("Jedi Council"), new Location("Coruscant"), new PositionType("General of the 501st"), new CoreCompetency("General"));
       Job emptyJobTwo = new Job("Anakin Skywalker", new Employer("Jedi Council"), new Location("Coruscant"), new PositionType("General of the 501st"), new CoreCompetency("General"));

       assertFalse(equals(emptyJobOne) != equals(emptyJobTwo));
   }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job emptyJobOne = new Job("Anakin Skywalker", new Employer("Jedi Council"), new Location("Coruscant"), new PositionType("not the rank of master"), new CoreCompetency("General"));

            String testToString = newline +
                    "Job{ " +
                    "Id: " + emptyJobOne.getId() + ", " +
                    "Name: " + emptyJobOne.getName() + ", " +
                    "Employer: " + emptyJobOne.geteEmployer() + ", " +
                    "Location: " + emptyJobOne.getLocation() + ", " +
                    "PostionType: " + emptyJobOne.getPositionType() + ", " +
                    "CoreCompetency: " + emptyJobOne.getCoreCompetency() + "}" + newline;
            ;

        assertEquals(expectedString.startsWith(newline) && expectedString.endswith(newline), emptyJobOne.toString().startsWith(newline) && emptyJobOne.toString().endsWith(newline));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

    }


}
