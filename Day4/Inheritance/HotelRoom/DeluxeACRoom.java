public class DeluxeACRoom extends DeluxeRoom{
    
    public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
        super(hotelName,numberOfSqFeet,hasTV,hasWifi);
        this.ratePerSqFeet =12;

    }
}