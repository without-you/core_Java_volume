package demo04;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 在这个练习中，学习使用Java封装好的一个日历类，进行打印出本月的日历。
 * 通过这个练习，可以了看到如何使用一个类来完成一个复杂的任务，而不需要了解它的内部实现。
 * @author 烂醉花间
 * @date 2022/12/13  22:23
 */
public class CalendarTest {
    public static void main(String[] args) {
        //LocalDate.now()方法最终依旧会使用构造器返回一个对象，只不过进行了一些封装，可以直接拿到当前年月日的LocalDate对象
        LocalDate date = LocalDate.now();
        //getMonthValue()获得当前月份的int类型值
        int month = date.getMonthValue();
        //getDayOfMonth()获得当天在这个月的int类型值
        int today = date.getDayOfMonth();
        //minusDays()获得减去对应天数的LocalDate对象，用今天的日期-1就会得到对应这个月1号的LocalDate对象。
        date = date.minusDays(today-1);
        //getDayOfWeek()获得当前LocalDate对象所对应的周几
        DayOfWeek weekDay = date.getDayOfWeek();
        //周一的值为1...周日为7
        int value = weekDay.getValue();

        //开始打印日历，并对内容格式化
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d",date.getDayOfMonth());
            //将今天所处的日期使用*号标记
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            //plusDays()获取增加对应天数的LocalDate对象
            date = date.plusDays(1);
            //每周一换行
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
