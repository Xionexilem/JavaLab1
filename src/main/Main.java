import java.util.Scanner;

public class Main {

  // Задание 1
  // Задача 2
  public int sumLastNums (int x) {
    int first = x % 10;
    int second = (x / 10) % 10;

    return first + second;
  }

  // Задача 3
  public int charToNum (char x) {
    return Character.getNumericValue(x);
  }

  // Задача 6
  public boolean isUpperCase (char x) {
    char clone = Character.toUpperCase(x);
    return x == clone;
  }

  // Задача 8
  public boolean isDivisor (int a, int b) {
    return a % b == 0 | b % a == 0;
  }

  // Задача 10
  public int lastNumSum (int a, int b) {
    return a % 10 + b % 10;
  }

  // Задание 2
  // Задача 1
  public int abs (int x) {
    if (x > 0) {
      return x;
    } else {
      return x * -1;
    }
  }

  // Задача 2
  public double safeDiv (int x, int y) {
    if (y == 0) {
      return 0;
    } else {
      return (double) x/y;
    }
  }

  // Задача 7
  public int sum2 (int x, int y) {
    int summa = x + y;
    if (10 <= summa && summa <= 19) {
      return 20;
    } else {
      return summa;
    }
  }

  // Задача 8
  public String age (int x) {
    int remainder = x % 10;
    int tens = x / 10 % 10;
    if (remainder == 1 && tens != 1) {
      return x + " год";
    } else if (2 <= remainder && remainder <= 4 && tens != 1) {
      return x + " года";
    } else {
      return x + " лет";
    }
  }

  // Задача 9
  public String day (int x) {
    switch (x) {
      case 1:
        return "понедельник";
      case 2:
        return "вторник";
      case 3:
        return "среда";
      case 4:
        return "четверг";
      case 5:
        return "пятница";
      case 6:
        return "суббота";
      case 7:
        return "воскресенье";
      default:
        return "это не день недели";
    }
  }

  // Задание 3
  // Задача 3
  public String chet (int x) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i <= x; i++) {
      if (i % 2 == 0) {
        result.append(i);
        if (i != x) {
          result.append(" ");
        }
      }
    }
    return result.toString();
  }

  // Задача 5
  public int numLen (long x) {
    int result = 0;
    while (x != 0) {
      x /= 10;
      result++;
    }
    return result;
  }

  // Задача 7
  public void square (int x) {
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        System.out.print('*');
      }
      System.out.println("");
    }
  }

  // Задача 8
  public void leftTriangle (int x) {
    for (int i = 1; i <= x; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print('*');
      }
      System.out.println("");
    }
  }

  // Задача 9
  public void rightTriangle (int x) {
    for (int i = x; i > 0; i--) {
      for (int j = 1; j <= x; j++) {
        if (j < i) {
          System.out.print(' ');
        } else {
          System.out.print('*');
        }
      }
      System.out.println("");
    }
  }

  // Задание 4
  // Задача 4
  public int[] add (int[] arr, int x, int pos) {
    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < pos; i++) {
      newArr[i] = arr[i];
    }
    newArr[pos] = x;
    for (int i = pos; i < arr.length; i++) {
      newArr[i + 1] = arr[i];
    } 
    return newArr;
  }

  // Задача 5
  public int[] add (int[] arr, int[] ins, int pos) {
    int[] newArr = new int[arr.length + ins.length];
    for (int i = 0; i < pos; i++) {
      newArr[i] = arr[i];
    }
    for (int i = 0; i < ins.length; i++) {
      newArr[i + pos] = ins[i];
    }
    for (int i = pos; i < arr.length; i++) {
      newArr[i + arr.length] = arr[i]; 
    }
    return newArr;
  }

  // Задача 6
  public void reverse (int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      int index = arr.length - 1 - i;
      arr[i] = arr[index];
      arr[index] = temp;
    }
  }

  private void visualTopTab (String exercise, String task) {
    String visual = " ========== ";
    System.out.println(visual + "Задание №" + exercise + " Задача №" + task + visual);
  }

  private void visualBottomTab () {
    String visual = " ========== ";
    System.out.println(visual + "Конец" + visual);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String numberExercise = scanner.nextInt();
    String numberTask = scanner.nextLine();

  }
}
