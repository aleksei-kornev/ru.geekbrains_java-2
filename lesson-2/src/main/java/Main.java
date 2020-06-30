import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static int[][] StrToIntArr(String str) {
        String[] subStr;
        String[][] arrStr = new String[4][4];
        int[][] arrInt = new int[4][4];

        subStr = str.split("\n");
        for (int i = 0; i < subStr.length; i++) {
            arrStr[i] = subStr[i].split(" ");
        }

        System.out.println();
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrInt[i][j] = Integer.parseInt(arrStr[i][j]);
                System.out.print(arrInt[i][j] + " ");
            }
            System.out.println();
        }
        return arrInt;
    }

    public static void main(String[] args) {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        String[][] arrStr = new String[4][4];
        int[][] arrInt = new int[4][4];
        System.out.println(str);

        try {
            arrInt = StrToIntArr(str);
        } catch (NumberFormatException e) {
            System.out.print("Ошибка типа данных");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Ошибка длины масссива");
        }

        int sum = 0;
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                sum += arrInt[i][j];
            }
        }
        System.out.println();
        System.out.println("Сумма ячеек " + sum + "; Делим на 2: " + (sum / 2));
    }

}
