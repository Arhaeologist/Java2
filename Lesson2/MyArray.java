package Java2.Lesson2;

public class MyArray {
    public static void main(String[] args) {
        String[][] str1 = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] str2 = {{"1","t","3","4"},{"1","2","t3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] str3 = new String[4][5];
        //System.out.println(GetArray(str1)); //Не выводит ошибки
        //System.out.println(GetArray(str2)); //Ошибка в значении
        System.out.println(GetArray(str3)); //Ошибка в размере
    }

    public static int GetArray(String[][] array){
        boolean flag = false;
        int sum = 0;
        if(array.length != 4){
            flag = true;
        }else{
            for (int i = 0; i < 4; i++) {
                if(array[i].length != 4){
                    flag = true;
                }
            }
        }
        if(flag == true){
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }else{
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        try {
                            throw new MyArrayDataException(i,j);
                        } catch (MyArrayDataException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception{
    public MyArraySizeException(){
        super("Некорректный размер массива");
    }
}

class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j){
        super("В ячейке "+ i + ", " + j + " находится некорректный символ");
    }
}