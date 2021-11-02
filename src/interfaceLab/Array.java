package interfaceLab;

import java.util.Arrays;

public class Array implements BooleanLab {
    public boolean[] array;

    public Array() {
        array = new boolean[1024];
        for(int i = 0; i < 1024; i++) {
            array[i] = false;
        }
    }

    public boolean checkBoolean(int index) {
        return array[index];
    }
    public void setBoolean(int index) {
        array[index] = true;
    }
    public void setValue(int index, boolean value) {
        array[index] = value;
    }
    public void dropValue(int index) {
        if(array[index] == true) {
            array[index] = false;
        }
    }
    public void invert(int index) {
        boolean temp = array[index];
        array[index] = !temp;
    }

    public int numberTrue() {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == true) {
                count++;
            }
        }
        return count;
    }
    public String toString() {
        int[] arrayInt = new int[1024];
        for(int i = 0; i < array.length; i++) {
            if(array[i] == true) {
                arrayInt[i] = 1;
            }
            else {
                arrayInt[i] = 0;
            }
        }
        return Arrays.toString(arrayInt);
    }


}
