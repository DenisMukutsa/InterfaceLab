package interfaceLab;

import java.util.Arrays;

public class ArrayBit implements BooleanLab {

    public Byte check(int index) throws IndexOutOfBoundsException  {
        if(index >= 0 && index < arrayBit.length) {
            return arrayBit[index];
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }

    public void set(int index) throws IndexOutOfBoundsException  {
        if(index >= 0 && index < arrayBit.length) {
            arrayBit[index] = 1;
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }

    }

    public void setValue(int index, Object value) throws IndexOutOfBoundsException  {
        if(index >= 0 && index < arrayBit.length) {
            arrayBit[index] = (Byte) value;
        }
        else {
            throw new IndexOutOfBoundsException ("Неверно указан индекс массива или тип значения, которое должно быть присвоено элементу массива");

        }
    }

    public void dropValue(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < arrayBit.length) {
            if (arrayBit[index] == 1) {
                arrayBit[index] = 0;
            }
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }

    public void invert(int index) throws IndexOutOfBoundsException  {
        if(index >= 0 && index < arrayBit.length) {
            if(arrayBit[index] == 0 ) {
                arrayBit[index] = 1;
            }
            else {
                arrayBit[index] = 0;
            }
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }

    public int numberTrue() {
        int count = 0;
        for(byte number : arrayBit) {
            if(number == 1) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        return Arrays.toString(arrayBit);
    }


}
