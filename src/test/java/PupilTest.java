import org.junit.Before;
import org.junit.Test;

import models.Desk;
import models.Pupil;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PupilTest {

    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Desk desk1;
    Desk desk2;

    @Before
     public void setUp(){
         pupil1 = new Pupil("Frank", true, false, false);
         pupil2 = new Pupil("Harriet", false, true, true);
         pupil3 = new Pupil("Lucy", true, true, false);
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

     @Test
     public void canAddFriends(){
        pupil1.addFriend(pupil2);
        HashSet<Pupil> friends = new HashSet<Pupil>();
        friends.add(pupil2);
        assertEquals(1, pupil1.getFriends(friends).size());
     }

     @Test
     public void canAddEnemies(){
        pupil1.addEnemy(pupil3).addEnemy(pupil2);
        HashSet<Pupil> enemies = new HashSet<Pupil>();
        enemies.add(pupil2);
        enemies.add(pupil3);
        assertEquals(2, pupil1.getEnemies(enemies).size());
     }

     @Test
     public void canAddDisruptivePartners(){
        pupil1.addDisruptivePartner(pupil3);
        HashSet<Pupil> disruptive_partnerships = new HashSet<Pupil>();
        disruptive_partnerships.add(pupil3);
        assertEquals(1, pupil1.getDisruptivePartnerships(disruptive_partnerships).size());
     }


}
