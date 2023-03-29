package com.example.homelesson1;

public class RailwayTicket {//задание полей сущности
    private String departurePoint;//место отправления
    private String arrivalPoint;//место прибытия
    private String departureDate;//время отправления
    private String arrivalDate;//время прибытия
    private int distance;//расстояние пути
    private float ticketPrice;//стоимость билетов
    private float ticketDiscount = 0;//скидка
    private int numberOfTickets;//количество билетов

    //создание конструктора исходных данных
    public RailwayTicket(float ticketPrice , float ticketDiscount , int numberOfTickets ) {
            this.ticketPrice = ticketPrice;//стоимость взрослых билетов
            this.ticketDiscount = ticketDiscount;//скидка
            this.numberOfTickets = numberOfTickets;//количество билетов
    }

    private float ticketPriceWithDiscount() {
        if (ticketDiscount != 0) {
         return ticketPrice - (ticketPrice * ticketDiscount/100);
        } else {
            return ticketPrice;
        }

    }

    //метод подсчёта стоимости взрослых билетов
    public float ticketPriceAll(){
        return ticketPriceWithDiscount() * numberOfTickets;//нужно количество билетов умножить на стоимость одного билета
    }

   //создание геттеров и сеттеров
    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void  setNumberOfTickets(){
        this.numberOfTickets = numberOfTickets;
    }
    public float getTicketDiscount() {
        return ticketDiscount;
    }

    public void  setTicketDiscount(){
        this.ticketDiscount = ticketDiscount;
    }
}
