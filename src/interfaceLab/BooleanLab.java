package interfaceLab;

public interface BooleanLab {
    boolean[] array = new boolean[1024];
    byte[] arrayBit = new byte[1024];
    Object check(int index);
    void set(int index);
    void setValue(int index, Object value);
    void dropValue(int index);
    void invert(int index);
    int numberTrue();
    String toString();
}
