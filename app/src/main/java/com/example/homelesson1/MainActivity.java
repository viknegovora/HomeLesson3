package com.example.homelesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //создание объекта сущности взрослых билетов(стоимость билета,количество билетов)
    RailwayTicket railwayTicket = new RailwayTicket(70,9);
    //создание объекта сущности билетов для пенсионеров (стоимость билета,количество билетов,скидка)
    RailwayTicket ticket = new RailwayTicket(70, 5);
    //создание объекта сущности детских билетов(стоимость билета,количество билетов,скидка)
    RailwayTicket railwayTicketChild = new RailwayTicketChild(70,11,50);

    //создание полей для вывода на экран нужных значений
    private TextView railwayTicketOut;//поле вывода общей стоимости взрослых билетов
    private TextView ticketOut;//поле вывода общей стоимости билетов для пенсионеров
    private TextView railwayTicketChildOut;//поле вывода общей стоимости детских билетов
    private TextView railwayTicketTotalOut;//поле вывода общей стоимости всех билетов
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {//создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//присваивание жизненному циклу активити представления activity_main

        ///присваивание переменным активити элементов представления activity_main
        railwayTicketOut = findViewById(R.id.railwayTicketOut);//вывод информации стоимости всех взрослых билетов
        ticketOut = findViewById(R.id.ticketOut);//вывод информации стоимости билетов для пенсионеров
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);//вывод информации стоимости всех детских билетов
        railwayTicketTotalOut = findViewById(R.id.railwayTicketOut);//вывод информации стоимости всех детских билетов

        //заполнение экрана
        //1)заполнение первого поля воспользовавшись методом подсчёта стоимости взрослого билета ticketPriceALL
        //с помощью метода Float.toString() мы конвертировали данные из типа Float в String
        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceALL())+"монет");
        //2)заполнение второго поля воспользовавшись методом подсчёта стоимости  билета для пенсионера
        ticketOut.setText(Float.toString(ticket.ticketPriceALL())+"монет");
        //3)заполнение третьего поля воспользовавшись переопределённым методом подсчёта стоимости детского билета ticketPriceALL
        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceALL())+"монет");
        //4)заполнение четвёртого поля стоимостью всех билетов
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceALL()+ticket.ticketPriceAll()+railwayTicketChild.ticketPriceAll())+"монет");
        //
    }
}