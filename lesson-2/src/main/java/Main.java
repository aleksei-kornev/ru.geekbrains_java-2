import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {

        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String[] subStr;
        String[][] arrStr = new String [4][4];
        int[][] arrInt = new int [4][4];
        System.out.println(str);

        subStr = str.split("\n");
        for(int i = 0; i < subStr.length; i++) {
            try {
                arrStr[i] = subStr[i].split(" ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("Ошибка длины масссива");  //Превышение числа строк
            }
        }

        System.out.println();
        try {
            for (int i = 0; i < arrStr.length; i++) {
                for (int j = 0; j < arrStr[i].length; j++) {
                    arrInt[i][j] = Integer.parseInt (arrStr[i][j]);
                    System.out.print(arrInt[i][j]+" ");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.print("Ошибка типа данных");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Ошибка длины масссива");  //Превышение числа столбцов
        }
    }

}
