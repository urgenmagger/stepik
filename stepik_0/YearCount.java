package stepik_0;

public class YearCount {
    public static void main(String[] args) {
       int year = leapYearCount(2000);
        System.out.println(year);
    }
    public static int leapYearCount(int year) {
        return (year/4) - (year/100) + (year/400);
    }
}
