public class MovieTheater
{
  private String cinemaName;
  private int numOfTickets;
  private Ticket[] ticketList;
  
  public MovieTheater(String name, int size)
  {
    cinemaName = name;
    numOfTickets = 0;
    ticketList = new Ticket[size];
  }
  
  public boolean addReservation(Ticket ticket)
  {
    if(numOfTickets != ticketList.length)
    {
      ticketList[numOfTickets++] = ticket;
      return true;
    }
    else
    return false;
  }
  
  public boolean cancelReservation(int index)
  {
    int count;
    if(ticketList[index] != null)
    {
      for(count = index; count < numOfTickets; count++)
      ticketList[count] = ticketList[count + 1];
      
      ticketList[count] = null;
      --numOfTickets;
      return true;
    }
    
    else
    return false;
  }
  
  public Ticket[] allTickets(String movieName)
  {
    Ticket[] movieList;
    int num = 0;
    for(int count = 0; count < numOfTickets; count++)
    {
      if(ticketList[count] instanceof GoldTicket)
      if((ticketList[count].getMovieName()).equals(movieName))
      num++;
    }
    
    movieList = new Ticket[num];
    
    for(int count = 0, counter = 0; count < numOfTickets; count++)
    {
      if(ticketList[count] instanceof GoldTicket)
      if((ticketList[count].getMovieName()).equals(movieName))
      movieList[counter++] = ticketList[count];
    }
    
    return movieList;
  }
  
  public void display()
  {
    System.out.println("| Cinema's name: " + cinemaName + " | No. of tickets: " + numOfTickets + " |");
    System.out.println("------------------------------------------");
    
    for(int counter = 0; counter < numOfTickets; counter++)
    {
      System.out.print(ticketList[counter].toString());
      System.out.println("------------------------------------------");
    }
  }
}