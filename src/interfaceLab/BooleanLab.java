package interfaceLab;

public interface BooleanLab {

    public abstract boolean checkBoolean(int index);
    public abstract void setBoolean(int index);
    public abstract void setValue(int index, boolean value);
    public abstract void dropValue(int index);
    public abstract void invert(int index);
    public abstract int numberTrue();
    public abstract String toString();

}
