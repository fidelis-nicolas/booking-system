package com.prove.oop.incapsuliatsiya;
import java.util.UUID;

    class User{

          //https://docs.oracle.com/javase/8/docs/api/java/util/UUID.html
        private String name;
        private String surname;
        //private UUID id;
        private int id;


        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        /*public UUID getId() {
            return id;
        }
*/

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
            //this.id = UUID.randomUUID();
            this.id = this.id+1;
        }


   // User user = new User("Nata", "Pust", 1);

    public static void main(String[] args) {

            User user = new User("Nataliya", "Pust");
        System.out.println(user.getId());
        User user2 = new User("Tetyana", "Pust");
        System.out.println(user.getId());
    }


}
