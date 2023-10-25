package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateExample {
    public static void main(String[] args) throws ParseException {
        Locale locale = Locale.forLanguageTag("uz");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG , locale);
        String date = dateFormat.format(new Date());
        System.out.println(date);

        DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.LONG , locale);
        String time = timeFormat.format(new Date());
        System.out.println(time);

        /*for (Locale availableLocale : DateFormat.getAvailableLocales()) {
            System.out.println(availableLocale);
        }*/

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String format = formatter.format(new Date());
        System.out.println(format);

        String parseDate = formatter.format(new Date());
        Date parse = formatter.parse("01-01-2023");
        System.out.println(parse);

    }
}
