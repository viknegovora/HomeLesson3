package com.example.homelesson1;

public class RailwayTicketChild extends RailwayTicket {
    //задание полей
    public float ticketDiscount; //скидка на детский билет

    //создание пустого конструктора
    public RailwayTicketChild(){

    }

    //создание конструктора исходных данных детского билета(стоимость билета,количество билетов,скидка)
    public RailwayTicketChild(float ticketPrice,int numberOfTickets,float ticketDiscount ){
        super(ticketPrice,numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public RailwayTicketChild(int ticketPrice, int numberOfTickets) {
    }


    //переопределение метода подсчёта детских билетов
    public float ticketPriceALL(){
        return (getTicketPrice() * getNumberOfTickets() * (100-ticketDiscount))/100;//нужно количество билетов умножить на стоимость одного билета, умножить на скидку и все разделить на 100
    }
}
