import org.junit.Before;
import org.junit.Test;

import models.Desk;
import models.Pupil;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PupilTest {

    Pupil pupil1;
    Pupil pupil2;
    Desk desk1;
    Desk desk2;

    @Before
     public void setUp(){
         pupil1 = new Pupil("Frank", true, false, false);
         pupil2 = new Pupil("Harriet", false, true, true);
         desk1 = new Desk();
     }

     @Test
     public void hasName(){
        assertEquals("Frank", pupil1.getName());
        assertEquals("Harriet", pupil2.getName());
     }

     @Test
     public void hasSensoryImpairmentBoolean(){
        assertEquals(true, pupil1.hasSensoryImpairment());
        assertEquals(false, pupil2.hasSensoryImpairment());
     }

     @Test
     public void hasAttentivenessBoolean(){
        assertEquals(false, pupil1.isGenerallyAttentive());
        assertEquals(true, pupil2.isGenerallyAttentive());
     }

     @Test
     public void hasAcademicAchievementBoolean(){
        assertEquals(false, pupil1.isAcademicAchiever());
        assertEquals(true, pupil2.isAcademicAchiever());
     }

     @Test
     public void canAssignDesk(){
        pupil1.setDesk(desk1);
        assertEquals(desk1, pupil1.getDesk());
     }


}
