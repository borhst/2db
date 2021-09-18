public class tobd {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Day d = new Day(12, 1, 2000);
        System.out.println(d.name_ru);
    }

    public static class Day {
        int day;
        int month; 
        int year;
        // static int date;
        String name_ru; 
    
        public Day(int d, int m, int y) {
            this.day = d;
            this.month = m;
            this.year = y;
            
            name_ru = Integer.toString(day) + Integer.toString(month) + Integer.toString(year);
    
        }
    }
}
