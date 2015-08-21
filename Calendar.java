public class Calendar
{
    public static void main (String[] args) {
        String month = "September "; 
        String description = "  ";
        int day = 1;
        while(day < 31)
            {
                if (day == 5 || day == 6 || day == 12 || day == 13 || day == 19 || day == 20 || day == 26 || day == 27)
                {
                    description = " - WEEKEND";
                }
                else if (day == 7)
                {
                    description = " - NO SCHOOL (LABOR DAY)";
                }
                else if (day == 25)
                {
                    description = " - END OF THE MARKING PERIOD";
                }
                else
                {
                    description = "  ";
                }
                System.out.println(month + day + description); 
                day++;
            }
    }
}