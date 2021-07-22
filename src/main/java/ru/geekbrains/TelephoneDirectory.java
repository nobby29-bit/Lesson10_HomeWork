package ru.geekbrains;

public class TelephoneDirectory {
   String number;
   String surname;

   public TelephoneDirectory(String surname, String number){

       this.number = number;
       this.surname = surname;
   }

    public String getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }
}

