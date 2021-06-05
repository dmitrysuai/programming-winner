public class WhatToDo {
    public static void main(String[] args) {
        int time = 14;
        boolean isgoodweather = false;
        boolean late = time >= 23 || time <=5;
        if (late)
        System.out.println("Поздно");
        if (!late && isgoodweather)
        System.out.println("Гулять");
        if (!late && !isgoodweather)
        System.out.println("Плохая погода");
    }
}
