package interfaceLab; 

public class Main {
    public static void main(String[] args) {

        Array array = new Array();
        ArrayBit arrayBit = new ArrayBit();

        System.out.println("Значение заданного элемента массива: " + array.check(3));
        array.set(1);
        array.setValue(4, true);
        array.dropValue(1);
        array.invert(5);
        System.out.println("Количество элементов в коллекции, имеющих значение true: " + array.numberTrue());
        System.out.println("Ввод значений всех элементов коллекции после их преобразования по принципу \"true = 1, а false = 0\": " + array.toString());

        System.out.println();

        System.out.println("Значение заданного элемента массива: " + arrayBit.check(3));
        arrayBit.set(1);
        arrayBit.setValue(4, (byte)1);
        arrayBit.dropValue(1);
        arrayBit.invert(5);
        System.out.println("Количество элементов в коллекции, имеющих значение 1: " + arrayBit.numberTrue());
        System.out.println("Ввод значений всех элементов коллекции byte: " + arrayBit.toString());
    }


}
