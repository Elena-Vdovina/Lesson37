public class Rook {
  public enum Color {
    WHITE,
    BLACK,
  }

  private Rook.Color color;
  private int row;
  private int column;

  public Rook(Rook.Color color, int row, int column) {
    this.color = color;

    checkCoordinates(row, column);
    this.row = row;
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  public void setCoordinates(int row, int column) {
    checkCoordinates(row, column);
    // TODO проверка возможности хода
    if (this.row == row || this.column == column) {
      this.row = row;
      this.column = column;
      System.out.println("Ладья перешла на клетку " + row + ":" + column);
    } else {
      System.out.println("Ладья так не ходит");
    }
  }


  private static void checkCoordinates(int row, int column) {
    if (row < 1 || row > 8) {
      throw new IllegalArgumentException("Некорректный номер строки: " + row);
    }

    if (column < 1 || column > 8) {
      System.out.println("Некорректный номер столбца: " + column);
      throw new IllegalArgumentException();
    }
  }
}
