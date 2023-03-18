public class GoldTicket extends Ticket
{
  private String order;
  
  public GoldTicket(String movieName, String venue, String date, String time, String seat, String order)
  {
    super(movieName, venue, date, time, seat);
    this.order = order;
    calculateOrderPrice();
  }
  
  public GoldTicket(GoldTicket ticket)
  {
    super(ticket.movieName, ticket.venue, ticket.date, ticket.time, ticket.seat);
    order = ticket.order;
    calculateOrderPrice();
  }
  
  public String getOrder()
  {return order;}
  
  public void calculateOrderPrice()
  {
    switch(order)
    {
      case "Chicken Burger":
      orderPrice = 150 + 60; orderPrice = orderPrice + orderPrice * 0.15;
      break;
      
      case "Nac N Cheese":
      orderPrice = 150 + 50; orderPrice = orderPrice + orderPrice * 0.15;
      break;
      
      case "Classic Nachos":
      orderPrice = 150 + 40; orderPrice = orderPrice + orderPrice * 0.15;
      break;
    }
  }
  
  public String toString()
  {
    return "Ticket type: " + getClass().getName() + "\r" + super.toString() + "Order: " + getOrder() + "\rTotal price: " + orderPrice + " SR\r";
  }
}