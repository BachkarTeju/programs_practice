public class YearLeap {
  public static void main(String[] args) {
    int year = 2023;
    boolean isLeapYear;

    // divisible by 4
    isLeapYear = (year % 4 == 0);
    isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

    if (isLeapYear) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
}