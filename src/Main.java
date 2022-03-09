import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> days = new ArrayList<String>();

        days.add("And a partridge in a pear tree.");
        days.add("Two turtle doves,");
        days.add("Three French hens,");
        days.add("Four calling birds,");
        days.add("Five golden rings,");
        days.add("Six geese a-laying,");
        days.add("Seven swans a-swimming,");
        days.add("Eight maids a-milking,");
        days.add("Nine ladies dancing,");
        days.add("Ten lords a-leaping,");
        days.add("Eleven pipers piping,");
        days.add("Twelve drummers drumming,");

        twelveDayChrist(days, 0);
    }

    public static void twelveDayChrist(ArrayList<String> days, int n)
    {
        String suffix = "th";
        if (n == 1)
            suffix = "nd";
        if (n == 2)
            suffix = "rd";
        if (n == 0)
            System.out.println("On the 1st day of Christmas,\n" +
                    "My true love game to me\n" +
                    "A partridge in a pear tree.");
        else
        {
            System.out.println("On the " + (n + 1) + suffix + " day of Christmas,\n" +
                    "My true love gave to me");

            for (int i = n; i >= 0; i--)
                System.out.println(days.get(i));
        }
        System.out.println("\n");
        if (n < 11)
            twelveDayChrist(days, n + 1);
    }
}