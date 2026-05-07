public class Date {

    public static final int MIN_MONTH = 1;
    public static final int MAX_MONTH = 12;
    public static final int MIN_DAY   = 1;
    public static final int MAX_DAY   = 31;
    public static final int MIN_YEAR  = 1;

    private int month;
    private int day;
    private int year;

   
    public Date() {
        try {
            setMonth(1);
            setDay(1);
            setYear(2000);
        } catch (DateException e) {}
    }

    
    public Date(int month, int day, int year) throws DateException {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    // Deep copy constructor
    public Date(Date other) throws DateException {
        setMonth(other.month);
        setDay(other.day);
        setYear(other.year);
    }

    public void setMonth(int month) throws DateException {
        if (month < MIN_MONTH || month > MAX_MONTH)
            throw new DateException("Invalid month: " + month);
        this.month = month;
    }

    public void setDay(int day) throws DateException {
        if (day < MIN_DAY || day > MAX_DAY)
            throw new DateException("Invalid day: " + day);
        this.day = day;
    }

    public void setYear(int year) throws DateException {
        if (year < MIN_YEAR)
            throw new DateException("Invalid year: " + year);
        this.year = year;
    }

    public int getMonth() { 
        return month; 
    }
    public int getDay()   { 
        return day;   
    }
    public int getYear()  { 
        return year;  
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
