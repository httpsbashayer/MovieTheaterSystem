public class ReservationTest
{
  public static void main(String[]args)
  {
    MovieTheater voxCinema = new MovieTheater("VOX", 20);
    Ticket first = new StandardTicket("Born A King", "Riyadh Park", "26/02/2021", "10:00", "J-5", "Standard");
    Ticket second = new StandardTicket("Goodbye", "Red Sea Mall", "26/02/2021", "15:00", "H-5", "Premium");
    Ticket third = new GoldTicket("Social Dilemma", "Riyadh Park", "27/02/2021", "18:30", "K-2", "Chicken Burger");
    Ticket fourth = new GoldTicket("Born A King", "Riyadh Park", "28/02/2021", "20:15", "J-2", "Classic Nachos");
    
    System.out.print((voxCinema.addReservation(first))? "The " + first.getClass().getName() + " is added successfully!\r" : "Unfortunately the " + first.getClass().getName() + " is not added\r" );
    System.out.print((voxCinema.addReservation(second))? "The " + second.getClass().getName() + " is added successfully!\r" : "Unfortunately the " + second.getClass().getName() + " is not added\r" );
    System.out.print((voxCinema.addReservation(third))? "The " + third.getClass().getName() + " is added successfully!\r" : "Unfortunately the " + third.getClass().getName() + " is not added\r" );
    System.out.print((voxCinema.addReservation(fourth))? "The " + fourth.getClass().getName() + " is added successfully!\r" : "Unfortunately the " + fourth.getClass().getName() + " is not added\r" );
    System.out.println();
    
    voxCinema.display();
    System.out.println();
    
    int index = 2;
    System.out.print((voxCinema.cancelReservation(index))? "The ticket no. " + ++index + " is found and it was successfully deleted!\r" : "Unfortunately the ticket no. " + ++index + " does not exist\r" );
    System.out.println();
    
    Ticket [] movie = voxCinema.allTickets("Born A King");
    System.out.print("No. of tickets for \"Born A King\" movie: " + movie.length + "\r");
    System.out.printf("| %3s %7s %7s %12s %5s |\r", "For", "Golden", "Ticket", "Reservation", "Only");
    System.out.println("------------------------------------------");
    
    for(int count = 0; count < movie.length; count++)
    {System.out.print(movie[count].toString()); System.out.println("------------------------------------------");}

    System.out.println();
    
    voxCinema.display();
  }
}