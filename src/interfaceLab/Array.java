package interfaceLab;

import java.util.Arrays;

public class Array implements BooleanLab {

    public Boolean check(int index) throws IndexOutOfBoundsException  {
        if(index >= 0 && index < array.length) {
           return array[index];
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }

    public void set(int index) throws IndexOutOfBoundsException  {
        if(index >= 0 && index < array.length) {
            array[index] = true;
        }
        else {
              throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }

    }

    public void setValue(int index, Object value) throws IndexOutOfBoundsException  {
        if(index >= 0 && index < array.length) {
            array[index] = (Boolean) value;
        }
        else {
            throw new IndexOutOfBoundsException ("Неверно указан индекс массива или тип значения, которое должно быть присвоено элементу массива");

        }
    }

    public void dropValue(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < array.length) {
            if (array[index] == true) {
                array[index] = false;
            }
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }

    public void invert(int index) throws IndexOutOfBoundsException  {
        if(index >= 0 && index < array.length) {
            boolean temp = array[index];
            array[index] = !temp;
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
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
