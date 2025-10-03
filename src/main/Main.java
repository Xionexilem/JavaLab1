import java.util.Arrays;
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
    return switch (x) {
      case 1 -> "понедельник";
      case 2 -> "вторник";
      case 3 -> "среда";
      case 4 -> "четверг";
      case 5 -> "пятница";
      case 6 -> "суббота";
      case 7 -> "воскресенье";
      default -> "это не день недели";
    };
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
      System.out.println();
    }
  }

  // Задача 8
  public void leftTriangle (int x) {
    for (int i = 1; i <= x; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print('*');
      }
      System.out.println();
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
      System.out.println();
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
    System.out.print("arr=" + Arrays.toString(arr));
  }

  // Задача 9
  public int[] findAll (int[] arr, int x) {
    int count = 0;
    int pos = 0;
    for (int i : arr) {
      if (i == x) {
        count++;
      }
    }
    int[] newArr = new int[count];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) { newArr[pos] = i; pos++; }
    }
    return newArr;
  }

  // Задача 10
  public int[] deleteNegative (int[] arr) {
    int count = 0;
    int pos = 0;
    for (int i : arr) {
      if (i >= 0) {
        count++;
      }
    }
    int[] newArr = new int[count];
    for (int i : arr) {
      if (i >= 0) {
        newArr[pos] = i;
        pos++;
      }
    }
    return newArr;
  }

  // Для визулаьной части начала задания
  private void visualTopTab (int exercise, int task) {
    String visual = " ========== ";
    System.out.println(visual + "Задание №" + exercise + "  Задача №" + task + visual);
  }

  // Для визуальной части конца задания
  private void visualBottomTab () {
    String visual = " ================== ";
    System.out.println(visual + "Конец" + visual);
  }

  // Сообщение о неизвестной задаче
  private void unknownTask (int exercise) {
    System.out.println("Неизвестная задача в задании №" + exercise);
  }

  // Сообщение о неверном значении
  private void invalidValue () {
    System.out.println("Введено неверное значение, попробуйте ещё раз.");
  }

  // Просьба ввода
  private void pleaseEnter (String text) {
    System.out.print("Введите " + text + ": ");
  }

  // Создание массивов с вводом
  private int[] createArr () {
    Main obj = new Main();
    try (Scanner scanner = new Scanner(System.in)) {
      obj.pleaseEnter("длину массива");
      int arrLen = scanner.nextInt();
      int[] arr = new int[arrLen];
      for (int i = 0; i < arrLen; i++) {
        obj.pleaseEnter(i + "-й элемент");
        arr[i] = scanner.nextInt();
      }
      return arr;
    }
  }

  public static void main(String[] args) {
    Main obj = new Main();
    Scanner scanner = new Scanner(System.in);
    String result = "результат: ";
    boolean isWork = true;

    while (isWork) {
      try {
      obj.pleaseEnter("номер задания (-1 - выход)");
      int numberExercise = scanner.nextInt();

      if (numberExercise == -1) {isWork = false; break;}

      obj.pleaseEnter("номер задачи");
      int numberTask = scanner.nextInt();

      obj.visualTopTab(numberExercise, numberTask);

        switch (numberExercise) {
          case 1: {
            switch (numberTask) {
              case 2: {
                System.out.println("Нахождение суммы двух последних знаков числа.");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result + obj.sumLastNums(x));
                break;
              }
              case 3: {
                System.out.println("Преобразование символа цифры в число");
                obj.pleaseEnter("символ");
                char x = scanner.next().charAt(0);
                System.out.println(result + obj.charToNum(x));
                break;
              }
              case 6: {
                System.out.println("Проверка символа, что это верхний регистр.");
                obj.pleaseEnter("символ");
                char x = scanner.next().charAt(0);
                System.out.println(result + obj.isUpperCase(x));
                break;
              }
              case 8: {
                System.out.println("Проверка на возможное деление между числами.");
                obj.pleaseEnter("первое целочисленное значение");
                int a = scanner.nextInt();
                obj.pleaseEnter("второе целочисленное значение");
                int b = scanner.nextInt();
                System.out.println(result + obj.isDivisor(a, b));
                break;
              }
              case 10: {
                System.out.println("Сложение единиц пяти значений.");
                obj.pleaseEnter("первое целочисленное значение");
                int x = scanner.nextInt();
                for (int i = 0; i < 4; i ++) {
                  System.out.print(x + "+");
                  int tmp = scanner.nextInt();
                  x = obj.lastNumSum(x, tmp);
                  System.out.print("это " + x);
                  System.out.println();
                }
                System.out.println(result + x);
                break;
              }
              default: {
                obj.unknownTask(numberExercise);
                continue;
              }
            }
            break;
          }
          case 2: {
            switch (numberTask) {
              case 1: {
                System.out.println("Нахождение модуля числа.");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result + obj.abs(x));
                break;
              }
              case 2: {
                System.out.println("Нахождение деления числа X на Y");
                obj.pleaseEnter("целочисленное значение X");
                int x = scanner.nextInt();
                obj.pleaseEnter("целочисленное значение Y");
                int y = scanner.nextInt();
                System.out.println(result + obj.safeDiv(x, y));
                break;
              }
              case 7: {
                System.out.println("Нахождение суммы двух чисел. Если сумма попадает в диапазон от 10 до 19, то равна 20");
                obj.pleaseEnter("первое целочисленное значение");
                int x = scanner.nextInt();
                obj.pleaseEnter("второе целочисленное значение");
                int y = scanner.nextInt();
                System.out.println(result + obj.sum2(x, y));
                break;
              }
              case 8: {
                System.out.println("Добавление к числу слова 'год' со склонением");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result + obj.age(x));
                break;
              }
              case 9: {
                System.out.println("День недели в зависимости от числа дня.");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result + obj.day(x));
                break;
              }
              default: {
                obj.unknownTask(numberExercise);
                continue;
              }
            }
            break;
          }
          case 3: {
            switch (numberTask) {
              case 3: {
                System.out.println("Вывод всех чётных чисел от 0 до x.");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result + obj.chet(x));
                break;
              }
              case 5: {
                System.out.println("Вывод количества знаков в числе.");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result + obj.numLen(x));
                break;
              }
              case 7: {
                System.out.println("Вывод квадрата из '*'.");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result);
                obj.square(x);
                break;
              }
              case 8: {
                System.out.println("Вывод левостороннего треугольника из '*'.");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result);
                obj.leftTriangle(x);
                break;
              }
              case 9: {
                System.out.println("Вывод правостроннего треугольника из '*'.");
                obj.pleaseEnter("целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result);
                obj.rightTriangle(x);
                break;
              }
              default: {
                obj.unknownTask(numberExercise);
                continue;
              }
            }
            break;
          }
          case 4: {
            switch (numberTask) {
              case 4: {
                System.out.println("Вставка в массив элемента на позицию X.");
                int[] arr = obj.createArr();
                obj.pleaseEnter("вставляемое целочисленное значение");
                int x = scanner.nextInt();
                obj.pleaseEnter("позицию вставки (от 0 до " + arr.length + ")");
                int pos = scanner.nextInt();
                System.out.println(result + Arrays.toString(obj.add(arr, x, pos)));
                break;
              }
              case 5: {
                System.out.println("Вставка в массив элемента на позицию X.");
                int[] arr = obj.createArr();
                int[] ins = obj.createArr();
                obj.pleaseEnter("позицию вставки (от 0 до " + arr.length + ")");
                int pos = scanner.nextInt();
                System.out.println(result + Arrays.toString(obj.add(arr, ins, pos)));
                break;
              }
              case 6: {
                System.out.println("Переворот массива задом-наперёд.");
                int[] arr = obj.createArr();
                System.out.println(result);
                obj.reverse(arr);
                break;
              }
              case 9: {
                System.out.println("Нахождение всех вхождений значения X в массиве.");
                int[] arr = obj.createArr();
                obj.pleaseEnter("искомое целочисленное значение");
                int x = scanner.nextInt();
                System.out.println(result + Arrays.toString(obj.findAll(arr, x)));
                break;
              }
              case 10: {
                System.out.println("Удаление всех отрицательных значений в массиве.");
                int[] arr = obj.createArr();
                System.out.println(result + Arrays.toString(obj.deleteNegative(arr)));
                break;
              }
              default: {
                obj.unknownTask(numberExercise);
                continue;
              }
            }
            break;
          }
          default: {
            System.out.println("Неизвестная задание");
            continue;
          }
        }

        obj.visualBottomTab();
      } catch (Exception e) {
        obj.invalidValue();
        scanner.nextLine();
        continue;
      }
    }

    scanner.close();
    System.out.println("Программа успешно завершила работу.");
  }
}
