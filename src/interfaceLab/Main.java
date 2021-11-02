package interfaceLab; 

public class Main {

    public static void main(String[] args) {
        Array array = new Array();
        System.out.println("Значение заданного элемента массива: " + array.checkBoolean(3));
        array.setBoolean(1);
        array.setValue(4, true);
        array.dropValue(1);
        array.invert(5);
        System.out.println("Количество элементов в коллекции, имеющих значение true: " + array.numberTrue());
        System.out.println("Ввод значений всех элементов коллекции после их преобразования по принципу \"true = 1, а false = 0\": " + array.toString());
    }


}
