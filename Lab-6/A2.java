class Time {
    int hour;
    int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void Addition(Time t) {
        this.hour += t.hour;
        this.minute += t.minute;

        if (this.minute >= 60) {
            this.hour++;
            this.minute -= 60;
        }
    }

    public void addprint() {
        System.out.println("Addition of Two Numbers = " + this.hour + ":" + this.minute);
    }
}

public class A2 {
    public static void main(String[] args) {
        Time t1 = new Time(5, 55);
        Time t2 = new Time(4, 50);
        Time t3 = new Time(0, 0);

        t3.Addition(t1);
        t3.Addition(t2);

        t3.addprint(); // Now this prints correctly
    }
}