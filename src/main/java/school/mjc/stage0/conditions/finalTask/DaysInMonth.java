package school.mjc.stage0.conditions.finalTask;

import java.time.YearMonth;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month > 12 || month <= 0) {
            System.out.println("invalid date");
            return;
        }
        YearMonth yearMonth = YearMonth.of(year,month);
        int daysInMonth = yearMonth.lengthOfMonth();
        System.out.println(daysInMonth);
    }
}
