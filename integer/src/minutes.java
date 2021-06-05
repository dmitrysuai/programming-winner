public class minutes {
    public static void main(String[] args) {
        int seconds = 590000;
        int minutes = seconds / 60;
        int halfminutes = minutes % 60;
        int hours = minutes/60;
        int days = hours / 31;

        System.out.println("количество дней:"+ days);
        System.out.println("часов:"+ hours);
        System.out.println("минут:"+ minutes);
        System.out.println("секунд:"+ seconds);

    }
}
