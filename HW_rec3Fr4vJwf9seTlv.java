public class HW_rec3Fr4vJwf9seTlv {
    public static void main(String[] args) {
        int startInteger = 365;
        int hundredths = startInteger / 100;
        int tenth = (startInteger - (hundredths * 100)) / 10 ;
        int units = (startInteger - ((hundredths * 100) + (tenth * 10))) ;

        System.out.println(hundredths + " - сотни");
        System.out.println(tenth + " - десятки");
        System.out.println(units + " - единицы");
    }
}
