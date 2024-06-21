package Third_Assignment;

public class Task02 {


    public static class Holiday {
        private String nameHoliday;
        private int day;
        private String month;

        public Holiday(){}
        public Holiday(String nameHoliday, int day, String month) {
            this.nameHoliday = nameHoliday;
            this.day = day;
            this.month = month;
        }

        /*
        * Write a method inSameMonth, which compares two instances of the class
         Holiday, and
         returns the Boolean value true if they have the same month, and false if they do
         not.
        *
        * */
        public boolean inSameMonth(Holiday otherHoliday){
            return this.month.equals(otherHoliday.month);
        }

        /*
        *
        *  Write a method avgDate which takes an array of base type Holiday as its
        argument, and returns a double that is the average of the day variables in the Holiday instances in
        the array. You may assume that the array is full (i.e. does not have any null entries).
        *
        *
        * */

       public double avgDate(Holiday[] holidays){
           double sum = 0.0;
           for(Holiday holiday1 : holidays){
               sum += holiday1.day;
           }
                return sum / holidays.length;
       }


        public static void main(String[] args) {

        Holiday holidayNo1 = new Holiday("Independence Day",4,"August");
        Holiday holidayNo2 = new Holiday("Rest Day",5,"July");
        System.out.println("\n"+holidayNo1);
        System.out.println("\n"+holidayNo2);
        System.out.println(holidayNo1==holidayNo2);

        }
    }
}
