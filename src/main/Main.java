public class Main {

  // Задание 1
  // Задача 2
  public int sumLastNums (int x) {
    int first = x%10;
    int second = (x/10)%10;

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
      return x*-1;
    }
  }

  // Задача 2
  public double safeDiv (int x, int y) {
    if (y==0) {
      return 0;
    } else {
      return (double) x/y;
    }
  }

  // Задача 7
  public boolean isInRange (int a, int b, int num) {
    if (a > b) {
      return a >= num && b <= num;
    } else {
      return a <= num && b >= num;
    }
  }

  // Задача 8
  public boolean isDivisor (int a, int b)
  // Задание 3
  // Задача 1
  public String listNums (int x) {
    StringBuilder numbers = new StringBuilder();
    for (int i = 0; i <= x; i++) {
      numbers.append(i);
      if (i < x) {
        numbers.append(" ");
      }
    }
    return numbers.toString();
  }

  // Задача 2
  public String reverseListNums (int x) {
    StringBuilder numbers = new StringBuilder();
    for (int i = x; i >= 0; i--) {
      numbers.append(i);
      if (i > 0) {
        numbers.append(" ");
      }
    }
    return numbers.toString();
  }

  // Задача 3
  public String chet (int x) {
    StringBuilder numbers = new StringBuilder();
    for (int i = 0; i <= x; i++) {
      numbers.append(i);
      if (i%2==0) {
        if (i < x) {
          numbers.append(" ");
        }
      }
    }
    return numbers.toString();
  }

  // Задача 4
  public int pow (int x, int y) {
    int result = 1;
    for (int i = 0; i < y; i++) {
        result *= x;
      }
    return result;
  }

  // Задача 5
  public int numLen (long x) {
    int count = 0;
    while (x > 0) {
      x /= 10;
      count += 1;
    }
    return count;
  }

  // Задание 4
  // Задача 1
  public int findFirst (int[] arr, int x) {
    int result = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==x) {
        result = i;
        break;
      }
    }
    return result;
  }
}