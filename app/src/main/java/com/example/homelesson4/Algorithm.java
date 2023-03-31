package com.example.homelesson4;

import android.renderscript.ScriptGroup;

public class Algorithm {

    //создание пустого конструктора
    public Algorithm() {

    }

    //метод определения счастливого билета по питерской системе
    public static boolean isHappyStPetersburg(String ticketNumber) {
        if (ticketNumber.length() != 6) {
            return false;
        }
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < 3 ; i++) {
            s1 += Integer.parseInt(ticketNumber.charAt(i) + "");
        }
        for (int i = ticketNumber.length() / 2; i < ticketNumber.length(); i++) {
            s2 += Integer.parseInt(ticketNumber.charAt(i) + "");
        }
        return s1 == s2;

        //метод определения счастливого билета(чуть менее быстрый)
        public int nextHappyTicketV1(String input){
            int Inputint = Integer.parseInt(ScriptGroup.Input);//Конвертирование данных из String в int

            if (!isHappyStPetersburg(Integer.toString(inputInt))) {//то выполняется цикл
                Inputint = Inputint + 1;//шаговой проверки следующих билетов до наступления счастливых билетов
            }
            return Inputint;//возвращается найденный счастливый билет
        }else{//иначе(в случе изначально счастливого билета)
            return Inputint;//возвращается счастливый билет

            //метод определения счастливого билета(быстрее)
            public int nextHappyTicketV2(String ScriptGroup.Input) {
                int Inputint = Integer.parseInt(ScriptGroup.Input);//конвертирование данных из String в int
                int count = 0;//задание счётчика

                for (int i = Inputint; i < 1000000; i++) {// цикл проверки и поиски счастливого билета
                    int s1 = i%10 + (i/10)%10 + (i/100)%10;//подсчёт суммы последних трёх чисел
                    int j = i/1000;
                    int s2 = j%10 + (j/10)%10 + (j/100)%10;//подсчёт суммы первых трёх чисел

            }
                if (s1 == s2) {//проверка счастливого билета
                    break;//выброс из цикла
                } else { //иначе
                    count++;//увеличение счётчика на единицу
                }

        }
        }
        return Inputint + count; //вывод счастливого билета
    }
