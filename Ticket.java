public abstract class Ticket
{
  protected String movieName, venue, date, time, seat;
  protected double orderPrice;
  
  public Ticket(String movieName, String venue, String date, String time, String seat)
  {
    this.movieName = movieName; this.venue = venue;
    this.date = date; this.time = time; this.seat = seat;
  }
  
  public String getMovieName()
  {return movieName;}
  
  public String getVenue()
  {return venue;}
  
  public abstract void calculateOrderPrice();
  
  public String toString()
  {
    return "Movie name: " + movieName + "\rVenue: " + venue + "\rDate: " + date + "\rTime: " + time + "\rSeat: " + seat + "\r";
  }
}