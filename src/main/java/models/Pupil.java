package models;
import java.util.Set;
import java.util.HashSet;

public class Pupil {

    private int id;
    private final Set<Pupil> friends = new HashSet<Pupil>();
    private final Set<Pupil> enemies = new HashSet<Pupil>();
    private final Set<Pupil> disruptive_partnerships = new HashSet<Pupil>;
    private Boolean sensory_impairment;
    private Boolean generally_attentive;
    private Boolean academic_achiever;

    private Desk desk;

    public Pupil(){};


    public Pupil(int id, final Boolean sensory_impairment, final Boolean generally_attentive, final Boolean academic_achiever) {

        this.id = id;
        this.sensory_impairment = sensory_impairment;

    }


}
