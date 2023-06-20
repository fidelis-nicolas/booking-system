import com.booking.model.City;
import com.booking.model.Users;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<City> cities = new ArrayList<>();

        Users user1 = new Users();
        user1.setFirstName("Natali");
        System.out.println(user1.getFirstName());
        //An object is an instance of class
        City city = new City("Ukraine", 100, "Kiev");
        City city1 = new City("Nigeria", 400,"Lagos");

        cities.add(city);
        cities.add(city1);

        for(City mycity: cities){
            System.out.println(mycity.getCityName()+" " + mycity.getPostCode()+" "+ mycity.getRegion());
        }

//       for(int i=0; i<cities.size(); i++){
//           System.out.println(cities.get(i).getCityName());
//           System.out.println(cities.get(i).getPostCode());
//       }





    }
}