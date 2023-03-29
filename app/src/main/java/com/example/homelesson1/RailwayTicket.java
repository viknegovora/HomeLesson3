package com.example.homelesson1;

public class RailwayTicket {//задание полей сущности
    private String departurePoint;//место отправления
    private String arrivalPoint;//место прибытия
    private String departureDate;//время отправления
    private String arrivalDate;//время прибытия
    private int distance;//расстояние пути
    private float ticketPrice;//стоимость взрослых билетов
    private float ticketpensprice;//стоимость билетов для пенсионеров
    private int numberOfTickets;//количество билетов

    //создание пустого конструктора
    public RailwayTicket() {

    }

    //создание конструктора исходных данных
    public RailwayTicket(float ticketPrice , float ticketpensprice , int numberOfTickets ) {
            this.ticketPrice = ticketPrice;//стоимость взрослых билетов
            this.ticketpensprice = ticketpensprice;//стоимость билетов для пенсионеров
            this.numberOfTickets = numberOfTickets;//количество билетов
    }

    public RailwayTicket(float ticketPrice, int numberOfTickets) {
    }


    //метод подсчёта стоимости взрослых билетов
    public float ticketPriceAll(){
        return ticketPrice * numberOfTickets;//нужно количество билетов умножить на стоимость одного билета
    }

    //метод подсчёта стоимости билетов для пенсионеров
    public float ticketPriceALL(){
        return ticketpensprice * numberOfTickets;//нужно количество билетов умножить на стоимость одного билета
    }

   //создание геттеров и сеттеров
    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public float getTicketpensprice() {
        return ticketpensprice;
    }

    public void setTicketpensprice( ){
        this.ticketpensprice = ticketpensprice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void  setNumberOfTickets(){
        this.numberOfTickets = numberOfTickets;
    }
}
