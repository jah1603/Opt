package models;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class PupilDifficultyComparator implements Comparator<Pupil> {
    @Override
    public int compare(final Pupil a, final Pupil b) {
        return new CompareToBuilder()
                .append(a.significantRelationships(), b.significantRelationships())
                .append(a.getId(), b.getId()).toComparison();
    }
}
