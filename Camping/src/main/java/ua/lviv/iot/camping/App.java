package ua.lviv.iot.camping;





import lombok.var;
import ua.lviv.iot.camping.models.CampingItem;
import ua.lviv.iot.camping.models.Tent;

public class App {
    public static void main(String[] args) {
         var item = CampingItem.builder()
                 .name("Something")
                 .company("Microsoft")
                 .price(1000000000)
                 .build();

        System.out.println(item);

        var item2 = Tent.builder()
                .name("Somethinsghwwwwwwwwwwwwwsg")
                .company("Micrthosoft")
                .price(10)
                .capacityOfPeople(5)
                .squareTent(3)
                .build();
        System.out.println(item2);

    }
}
