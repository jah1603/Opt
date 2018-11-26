package models;

import java.util.List;


public class Desk {

    private int id;
    private int capacity;
    private int row;
    private int column;

    public Desk(){};

    public Desk(int id, int capacity, int row, int column) {

        this.id = id;
        this.capacity = capacity;
        this.row = row;
        this.column = column;

    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRow(int row){
        this.row = row;
    }

    public void setColumn(int column){
        this.column = column;
    }

    @Override
    public int hashCode() {
        final int prime = 41;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Desk other = (Desk) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    public int atFullCapacity(final List<Pupil> pupils) {
        return capacity >= pupils.size() ? 0 : (pupils.size() - capacity);
    }


}
