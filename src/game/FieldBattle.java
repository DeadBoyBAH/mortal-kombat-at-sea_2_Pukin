package game;

/**
 * Игровое поле.
 */
public class FieldBattle {
    private String[][] field;
    private int sizeField = 10;

    public FieldBattle() {
        field = new String[sizeField][sizeField];
        setWawe();
    }

    /**
     * Заполнение поля 'волнами'.
     */
    private void setWawe() {
        field[0][0] = " ";
        for (int x = 0; x < sizeField; x++) {
            for (int y = 0; y < sizeField; y++) {
                field[x][y] = "~";
            }
        }
    }

    /**
     * Вывод поля в консоль.
     */
    public void printField() {
        int n = 1;
        char m = 'a';
        for (int x = -1; x < sizeField; x++) {
            for (int y = -1; y < sizeField; y++) {
                if (x == -1 & y == -1) System.out.print(" ");
                else if (x == -1 & y > -1) {
                    System.out.print(n);
                    n += 1;
                } else if (y == -1 & x > -1) {
                    System.out.print(m);
                    m += 1;
                } else System.out.print(field[x][y]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
