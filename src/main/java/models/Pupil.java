
import java.util.stream.Collectors;
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Pupil> getFriends(final Set<Pupil> others) {
        return others.stream().filter(other -> friends.contains(other))
                .collect(Collectors.toSet());
    }

    public Set<Pupil> getEnemies(final Set<Pupil> others) {
        return others.stream().filter(other -> enemies.contains(other))
                .collect(Collectors.toSet());
    }

    public Set<Pupil> getDisruptivePartnerships(final Set<Pupil> others) {
        return others.stream().filter(other -> enemies.contains(other))
                .collect(Collectors.toSet());
    }

    public Boolean hasSensoryImpairment() {
        return sensory_impairment;
    }

    public void setSensoryImpairment(Boolean sensory_impairment) {
        this.sensory_impairment = sensory_impairment;
    }

    public Boolean isGenerallyAttentive() {
        return generally_attentive;
    }

    public void setGenerallyAttentive(Boolean generally_attentive) {
        this.generally_attentive = generally_attentive;
    }

    public Boolean isAcademicAchiever() {
        return academic_achiever;
    }

    public void setAcademicAchiever(Boolean academic_achiever) {
        this.academic_achiever = academic_achiever;
    }

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }
}
