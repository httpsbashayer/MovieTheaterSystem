public class StandardTicket extends Ticket
{
  private String classOfSeat;
  
  public StandardTicket(String movieName, String venue, String date, String time, String seat, String classOfSeat)
  {
    super(movieName, venue, date, time, seat);
    this.classOfSeat = classOfSeat;
    calculateOrderPrice();
  }
  
  public StandardTicket(StandardTicket ticket)
  {
    super(ticket.movieName, ticket.venue, ticket.date, ticket.time, ticket.seat);
    classOfSeat = ticket.classOfSeat;
    calculateOrderPrice();
  }
  
  public String getClassOfSeat()
  {return classOfSeat;}
  
  public void calculateOrderPrice()
  {
    switch(classOfSeat)
    {
      case "Standard":
      orderPrice = 50; orderPrice = orderPrice + orderPrice * 0.15;
      break;
      
      case "Premium":
      if(venue.equals("Riyadh Park"))
      {orderPrice = 60; orderPrice = orderPrice + orderPrice * 0.15;}
      else if(venue.equals("Red Sea Mall"))
      {orderPrice = 75; orderPrice = orderPrice + orderPrice * 0.15;}
      break;
    }
  }
  
  public String toString()
  {
    return "Ticket type: " + getClass().getName() + "\r" + super.toString() + "Class of seat: " + getClassOfSeat() + "\rTotal price: " + orderPrice + " SR\r";
  }
}